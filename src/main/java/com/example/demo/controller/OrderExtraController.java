package com.example.demo.controller;

import com.example.demo.bean.Animal;
import com.example.demo.bean.Car;
import com.example.demo.bean.OrderExtra;
import com.example.demo.service.OrderExtraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @description:
 * @author: jiangzhangcheng
 * @date:
 * @time: Copyright (C) 2021 Meituan
 * All rights reserved
 */
@RestController //说明这是一个控制器，专门用来处理请求。类型转换，将对象转为json格式。等效于@ResponseBody+@Controller
public class OrderExtraController {

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car(){
        return car;
    }
    @Autowired
    private OrderExtraService userService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/query")
    public Map<String, Object> map(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from order_extra");
        for(Map map : maps){
            Set<Map.Entry> ms = map.entrySet();
            for(Map.Entry entry : ms){
                System.out.print("Key = "+entry.getKey()+",value="+entry.getValue()+",  ");
            }
            System.out.println();
        }
        return maps.get(1);
    }

    @RequestMapping("/abc")//前端返回地址
    public List<Animal> getName(){
        List<Animal> res = new ArrayList<>();
        res.add(new Animal("dog", 5));
        res.add(new Animal("cat", 8));
        res.add(new Animal("pig", 3));
        return res;
    }

    @RequestMapping("/123")
    public List<OrderExtra> getOrder(){
        return userService.findAll();
    }//返回的数据写给浏览器

    @ResponseBody//返回json注解
    @GetMapping("/getOrderExtra")
    public OrderExtra getOrderExtra(@RequestParam("id") Long id){
        return userService.getOrderExtra(id);
    }
    @ResponseBody//返回json注解
    @GetMapping("/getFieldKey")
    public List<OrderExtra> getFieldKey(@RequestParam("fieldKey") String fieldKey){
        return userService.getFieldKey(fieldKey);
    }
}
