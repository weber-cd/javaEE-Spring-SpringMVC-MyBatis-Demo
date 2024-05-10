#### 注意点

1. 配置数据库连接本地数据时，使用useSSL false来降低
   ```
   useSSL=false
   ```

2.pojo 下的 User 重写 toString 的目的：

```java
    @Override
    public String toString() {
```

目的是在打印时，更具有可读性

3. 关注这里new UserRowMapper()参数，理解他的作用是讲数据库查询结果映射到 java 对象上

```java
List<User> userList = jdbcTemplate.query("select * from user", new UserRowMapper());
```
