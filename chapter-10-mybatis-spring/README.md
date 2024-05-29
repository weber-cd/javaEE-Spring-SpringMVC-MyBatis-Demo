#### 踩坑

一直报错：

```java
Mapped Statements collection does not contain value for com.mybatis.spring.po.CustomerMapper.findCustomerById
```

经过排查发现是按照教材来写的

[CustomerDaoIml.java](src/main/java/com/mybatis/spring/dao/CustomerDaoIml.java)

这里的CustomerMapper不对，应该改为Customer。可见，this.getSqlSession().selectOne方法，传入的参数应该是对应的

[CustomerMapper.xml](com/mybatis/spring/po/CustomerMapper.xml) 中的 namespace
