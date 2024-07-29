* 注意这里的配置，它的作用是让指定包下的UserDao.xml dao被扫码到，并经过编译进行implements。一开始就是因为这里配置不对，导致启动失败

```xml
    <!-- 接口开发，扫描com.boot.dao包，写在此包下的接口即可被扫描到 -->
    <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
        <property name="basePackage" value="com.boot.dao" />
    </bean>
```

* 这里的@Param指定了参数名字，这里指定的名字叫什么，那在UserDao.xml的变量名也叫这个

```java
public User findUser(@Param("usercode") String usercode, @Param("password") String password);
```

* commons.tld文件有何作用？
  * 这是一个前端组件，只不过是传统的jsp中的写法
* 数据库连接时，需要指定&characterEncoding=UTF-8。否则保存中文时，会乱码。
