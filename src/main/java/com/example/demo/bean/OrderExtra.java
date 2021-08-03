package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

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
@Component
public class OrderExtra {
    private int id;
    private int orderId;
    private String fieldKey;
    private String fieldValue;
    private Animal pet;

//    OrderExtra(int id, int orderId, String fieldKey, String fieldValue){
//        this.id = id;
//        this.orderId = orderId;
//        this.fieldKey = fieldKey;
//        this.fieldValue = fieldValue;
//    }
    @Override
    public String toString(){
        return "OrderExta{" +
                " id = " + id +
                " orderId = " + orderId +
                " fieldKey = " + fieldKey +
                " fieldValue = " + fieldValue +
                " pet = " + pet +
                "}";
    }
}
