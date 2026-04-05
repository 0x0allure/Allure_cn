package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/db")
    public String testDb() {
        try {
            jdbcTemplate.queryForObject("select 1", Integer.class);
            return "✅ MySQL 连接成功！";
        } catch (Exception e) {
            return "❌ 连接失败：" + e.getMessage();
        }
    }
}