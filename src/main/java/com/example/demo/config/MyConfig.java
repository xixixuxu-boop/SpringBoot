package com.example.demo.config;

import ch.qos.logback.core.db.DBHelper;
import com.example.demo.bean.Animal;
import com.example.demo.bean.Car;
import com.example.demo.bean.OrderExtra;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @description:
 * 1.配置类里面使用@Bean标注在方法上ge给容器注册组件，默认也是单实例的
 * 2.配置类本身也是组件
 * 3.proxyBeanMethods：代理bean方法
 *      Full(proxyBeanMethods=true)全模式，容器中只有一种类型的单实例，在该模式下SpringBoot每次启动都会判断检查容器中是否存在该组件
 *      Lite(proxyBeanMethods=false)轻量级模式，不用检查容器，实例化新的对象，在该模式下SpringBoot每次启动会跳过检查容器中是否存在该组件
 *      组件依赖
 * 4.@Import({OrderExtra.class, DBHelper.class})
 *      给容器中自动创建出这两个类型的组件，默认组件的名字就是全类名
 *
 */
@Import({OrderExtra.class, DBHelper.class})
@Configuration(proxyBeanMethods = false)//告诉Spring Boot这是一个配置类，等效于配置文件
@ImportResource("classpath:beans.xml")
@EnableConfigurationProperties(Car.class)
//1.开启Car属性配置功能
//2.把这个Car这个组件自动注册到容器中
public class MyConfig {
    /**
     * 外部无论对这个配置类中的组件注册方法调用多少次，获取的都是之前在注册容器中的单实例对象
     * @return
     */
    @ConditionalOnMissingBean(name = "animalxxx")
    @Bean("order123xxx") //给容器中添加组件，以方法名作为组件的id，返回类型为组件类型。返回的值，就是组件在容器中的实例
    public OrderExtra orderextra01(){
        //Animal ani1 = animal01();
        OrderExtra o1 = new OrderExtra(1, 2, "stall_name", "团餐", animal01());
        return o1;
    }

    @Bean("animalxxx")
    public Animal animal01(){
        return new Animal("cat", 3);
    }
}
