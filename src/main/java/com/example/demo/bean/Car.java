package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @description:
 *  只有在容器中的组件，才会拥有SpringBoot提供的强大功能
 * @author: jiangzhangcheng
 * @date:
 * @time: Copyright (C) 2021 Meituan
 * All rights reserved
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "carofjzc")//配置属性，和yml中的属性对应
public class Car {
    private String brand;
    private Integer price;

    @Override
    public String toString(){
        return "Car{" +
                " brand='" + brand + '\'' +
                ", price = "+ price +
                '}';
    }
}
