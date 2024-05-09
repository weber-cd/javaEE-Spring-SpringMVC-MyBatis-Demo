##### 注意点

```java
 UserService userService = applicationContext.getBean("userService", UserService.class);
```

1. 这里 getBean("userService")要注意，我们注解的是类UserService，这里获取应该自动按照小写开头的userService来获取
2. 从测试用例开始逐个阅读，应该就能看出各个知识点
