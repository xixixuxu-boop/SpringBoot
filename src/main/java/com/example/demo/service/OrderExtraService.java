package com.example.demo.service;

import com.example.demo.bean.OrderExtra;
import com.example.demo.mapper.OrderExtraMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: jiangzhangcheng
 * @date:
 * @time: Copyright (C) 2021 Meituan
 * All rights reserved
 */
@Service
public class OrderExtraService {

    @Autowired
    private OrderExtraMapper orderExtraMapper;

    public List<OrderExtra> findAll(){
        return orderExtraMapper.findAll();
    }

    public OrderExtra getOrderExtra(Long id){
        OrderExtra temp = new OrderExtra(123,999999, "ppppp", "qqqqq", null);
        return orderExtraMapper.getOrderExtra(id) == null ? temp : orderExtraMapper.getOrderExtra(id);
    }
    public List<OrderExtra> getFieldKey(String fieldKey){
        List<OrderExtra> res = orderExtraMapper.getFieldKey(fieldKey);
        List<OrderExtra> temp = new ArrayList<>();
        OrderExtra temp1 = new OrderExtra(456,000000, "zzzzzzz", "yyyyy", null);
        temp.add(temp1);
        return res != null ? temp : res;
    }

    void insert(OrderExtra orderextra){

    }
}
