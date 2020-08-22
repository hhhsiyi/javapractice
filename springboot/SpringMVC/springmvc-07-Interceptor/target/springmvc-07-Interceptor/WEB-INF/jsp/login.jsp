<%--
  Created by IntelliJ IDEA.
  User: Hewen
  Date: 2020/8/19
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="color: cornflowerblue">登陆页面</h1>

<hr>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名：<input type="text" name="username"> <br>
    密  码:<input type="password" name="pwd"> <br>
    <input type="submit" value="提交">
</form>
<form action="/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/>
    <input type="submit" value="提交啊">
</form>

<a href="/download">点击下载</a>
</body>
</html>
