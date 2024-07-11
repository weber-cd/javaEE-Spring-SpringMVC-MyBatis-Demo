<%@ page import="java.net.URI" %>
<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: weber
  Date: 2024/7/11
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath }/download?filename=1.jpg">
    文件下载
</a>
<a href="${pageContext.request.contextPath }/download?filename=<%=URLEncoder.encode("壁纸.jpg","UTF-8")%>">
    中文文件下载
</a>
</body>
</html>
