package com.jdbc;
import com.pojo.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void queryUserById(int id){
        System.out.println("开始查询用户信息");
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        User user = jdbcTemplate.queryForObject("select * from user where id = ?", rowMapper, id);
        System.out.println("user查询结果:" + user.toString());
    }
    @Override
    public void queryUserList(){
        System.out.println("开始查询用户信息");
        List<User> userList = jdbcTemplate.query("select * from user", new UserRowMapper());
        System.out.println("userList:" + userList);
    }

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) { // 添加 setter 方法
        this.jdbcTemplate = jdbcTemplate;
    }

    private static class UserRowMapper implements RowMapper<User>{
        @Override
        public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setPwd(resultSet.getString("pwd"));
            return  user;
        };
    }
}
