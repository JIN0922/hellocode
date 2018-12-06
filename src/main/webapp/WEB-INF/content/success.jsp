<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: jinzhao
  Date: 2018/10/29
  Time: 10:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
登录名：${requestScope.user.loginname}<br>
生日:<fmt:formatDate value="${requestScope.user.birthday}"  pattern="yyyy年MM月dd日"/>
</body>
</html>
