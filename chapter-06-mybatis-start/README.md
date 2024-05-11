### 注意点

1. [Mybatis中接口和对应的mapper文件位置详解](https://blog.csdn.net/zxd1435513775/article/details/79710493)

这里需要注意，要配置父级pom.xml 中的build项目，说明 recourse 怎么归属，否则获取不到mybatis-config.xml；因为打包时候，不会把mybatis-config.xml带到 target 中去
