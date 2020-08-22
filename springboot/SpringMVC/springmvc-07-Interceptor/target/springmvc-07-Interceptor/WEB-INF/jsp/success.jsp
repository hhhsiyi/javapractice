<%--
  Created by IntelliJ IDEA.
  User: Hewen
  Date: 2020/8/19
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎欢迎热烈欢迎</title>
</head>
<body>
<div>
    <div style="width: 70%;float: left">
        <h1 style="color: cadetblue">登陆成功界面</h1>
    </div>
    <div style="width: 30%;float: right">
        <h1>${user}<a href="${pageContext.request.contextPath}/user/logout">注销</a></h1>
    </div>
    <hr>
</div>



</body>
</html>
