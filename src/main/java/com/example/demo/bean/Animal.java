package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: jiangzhangcheng
 * @date:
 * @time: Copyright (C) 2021 Meituan
 * All rights reserved
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    private String name;
    private int age;

    @Override
    public String toString(){
        return "Animal{" +
                " name = " + name +
                " age = " + age +
                "}";
    }

}
