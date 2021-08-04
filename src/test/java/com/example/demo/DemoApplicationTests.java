package com.example.demo;

import com.example.demo.mapper.OrderExtraMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Slf4j //日志打印
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Autowired
    OrderExtraMapper orderExtraMapper;
    @Test//jdbc测试
    public void testJdbc(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from order_extra");
        for(Map map : maps){
            System.out.println(map);
        }
    }
    @Test
    void contextLoads() {
        //jdbcTemplate.queryForObject("select * from order_extra");
        jdbcTemplate.queryForList("select * from order_extra");
        Long aLong = jdbcTemplate.queryForObject("select count(*) from order_extra", Long.class);
        log.info("记录总数：{}", aLong);

        log.info("数据源类型：{}", dataSource.getClass());
    }
//    @Test
//    void testOrderExtraMapper(){
//        orderExtraMapper.selectBy();
//    }
}
