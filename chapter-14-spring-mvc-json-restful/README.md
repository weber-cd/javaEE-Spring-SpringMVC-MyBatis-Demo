#### 说明

1. webapp 下的文件，可以直接静态访问，比如要访问index.jsp，就访问链接

http://localhost:8080/chapter_14_spring_mvc_json_restful_war_exploded/index.jsp

2. jsp中访问静态资源的路径：

```JavaScript
 src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js">
```
