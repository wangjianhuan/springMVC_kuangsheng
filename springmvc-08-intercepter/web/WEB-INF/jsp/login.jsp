<%--
  Created by IntelliJ IDEA.
  User: wjh
  Date: 2022/1/9
  Time: 下午4:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h1>登录页面</h1>
<form action="${pageContext.request.contextPath}/User/login" method="post">
    用户名：<input type="text" name="username">
    密码：<input type="text" name="password">
    <input type="submit" value="提交">
</form>

</body>
</html>
