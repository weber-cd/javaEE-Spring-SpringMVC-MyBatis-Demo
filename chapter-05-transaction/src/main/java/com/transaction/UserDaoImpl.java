package com.transaction;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void setDeposit(){
        System.out.println("开始查询用户信息");
        jdbcTemplate.update("update user set deposit = deposit + ? where name = ?", 100, "张三");
        int i = 1/0; // 触发系统错误
        jdbcTemplate.update("update user set deposit = deposit - ? where name = ?", 100, "李四");
    }

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) { // 添加 setter 方法
        this.jdbcTemplate = jdbcTemplate;
    }
}
