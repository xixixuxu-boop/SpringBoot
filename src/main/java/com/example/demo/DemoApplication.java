package com.example.demo;

import com.example.demo.bean.Animal;
import com.example.demo.bean.Car;
import com.example.demo.bean.OrderExtra;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication//等效于下面三个注解
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("com.example.demo")
public class DemoApplication {

    public static void main(String[] args) {
        //1.返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
//
//        //2.查看容器里面的组件
//        String[] names = run.getBeanDefinitionNames();
////        for(String name : names){
////            System.out.println(name);
////        }
//
//        //3.从容器中获取组件
////        OrderExtra order1 = run.getBean("orderxxx", OrderExtra.class);
////        System.out.println(order1);
////        OrderExtra order2 = run.getBean(OrderExtra.class);
////        System.out.println(order2);
////        MyConfig bean =  run.getBean(MyConfig.class);
////        System.out.println(bean);
//
//        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查在这个组件是否在容器内
//        //保持组件单实例
//        Animal animal1 = run.getBean("animalxxx", Animal.class);
//        System.out.println(animal1);
//        //System.out.println("是否相同吗："+ (order1.getPet() == animal1));
//
//        //获取组件
        String[] beanNamesForType = run.getBeanNamesForType(OrderExtra.class);
        System.out.println("===================================");
        for (String s:beanNamesForType) {
            System.out.println(s);
        }
        System.out.println("===================================");
        String[] beanNamesForType2 = run.getBeanNamesForType(Animal.class);
        for (String s:beanNamesForType2) {
            System.out.println(s);
        }
        System.out.println("===================================");
//        DBHelper bean1 = run.getBean(DBHelper.class);
//        System.out.println(bean1);
        boolean ani = run.containsBean("animalxxx");
        System.out.println("容器中animalxxx组件: " + ani);
        boolean o1 = run.containsBean("orderExtra");
        System.out.println("容器有没有orderExtra组件: " + o1);
        boolean o2 = run.containsBean("order123xxx");
        System.out.println("容器有没有order123xxx组件: " + o2);
        System.out.println("===================================");
        System.out.println(run.containsBean("haha"));
        System.out.println(run.containsBean("hehe"));
        System.out.println("===================================");
        String[] cars = run.getBeanNamesForType(Car.class);
        for (String car: cars) {
            System.out.println(car);
        }
        Car car1 = run.getBean("car", Car.class);
        //Car car2 = run.getBean("mycar", Car.class);
        Car car3 = run.getBean("carofjzc-com.example.demo.bean.Car", Car.class);
        System.out.println(car1);
        //System.out.println(car2);
        System.out.println(car3);
        System.out.println(car1 == car3);
      }

}
