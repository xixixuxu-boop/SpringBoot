package com.example.demo.service;

import com.example.demo.bean.OrderExtra;
import com.example.demo.mapper.OrderExtraMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
