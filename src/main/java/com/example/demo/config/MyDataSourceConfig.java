package com.example.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @description:
 * @author: jiangzhangcheng
 * @date:
 * @time: Copyright (C) 2021 Meituan
 * All rights reserved
 */
@Deprecated //此方法已经过时
@Configuration
public class MyDataSourceConfig {
    //默认的自动配置是判断容器中没有才会配@ConditionalOnMissingBean(DataSource.class)
//    @ConfigurationProperties("spring.datasource")//配置属性，和yml文件中的属性对应
//    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        //以下属性的配置可以在yml配置文件中直接指定
//        druidDataSource.setUrl();
//        druidDataSource.setUsername();
//        druidDataSource.setPassword();
        //加入监控功能
//        druidDataSource.setFilters("stat,wall");
//        druidDataSource.setMaxActive(10);
        return druidDataSource;
    }

    /**
     * 配置druid的监控页功能
     * @return
     */
//    @Bean
//    public ServletRegistrationBean statViewServlet(){
//        StatViewServlet statViewServlet = new StatViewServlet();
//        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>();
//        return  registrationBean;
//    }
}
