package com.example.demo.mapper;

import com.example.demo.bean.OrderExtra;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @author: jiangzhangcheng
 * @date:
 * @time: Copyright (C) 2021 Meituan
 * All rights reserved
 */
@Mapper
public interface OrderExtraMapper {
    List<OrderExtra> findAll();
}
