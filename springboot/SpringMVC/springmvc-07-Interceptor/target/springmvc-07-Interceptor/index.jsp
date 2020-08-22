<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="${pageContext.request.contextPath}/interceptor">拦截器测试</a>
<a href="${pageContext.request.contextPath}/user/jumpLogin">登陆</a>
<a href="/user/jumpLogin">登陆用那个</a>
<a href="${pageContext.request.contextPath}/user/jumpSuccess">成功页面</a>
</body>
</html>
