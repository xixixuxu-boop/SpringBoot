package com.example.demo.mapper;

import com.example.demo.bean.OrderExtra;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

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

    @Select("select * from order_extra where id=#{id}")
    OrderExtra getOrderExtra(Long id);

    List<OrderExtra> getFieldKey(String fieldKey);

    @Insert("insert into orderextra('order_id','field_key','field_value') values(#{orderId}, #{fieldKey},#{fieldValue})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    void insert(OrderExtra orderextra);
}
