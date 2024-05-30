#### 说明

1. 使用 tomcat 启动项目后，页面的访问路径为：http://localhost:8089/chapter_11_spring_mvc_start_war_exploded/firstController
2. 对于带斜杠的 bean name，解释是在 Spring MVC 配置文件中，`<bean>` 元素用于定义一个 Spring Bean。在你提到的配置中：

```java
<bean name="/firstController"
      class="com.spring.mvc.FirstController"/>
```

<bean name="/firstController"
class="com.spring.mvc.FirstController"/>

这种带有 `/` 的 `name` 属性用于将一个 Spring MVC 控制器绑定到一个特定的 URL 路径。这种配置主要在 XML 配置文件中使用，通常用于配置基于 XML 的 Spring MVC 应用程序。在这种情况下：

* `name` 属性定义了这个 Bean 的名称，同时也定义了这个控制器所映射的 URL 路径。
* `class` 属性定义了该 Bean 的具体实现类，在这里是 `com.spring.mvc.FirstController`。
