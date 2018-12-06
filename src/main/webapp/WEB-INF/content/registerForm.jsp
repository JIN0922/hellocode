<%--
  Created by IntelliJ IDEA.
  User: jinzhao
  Date: 2018/10/28
  Time: 9:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/ConverTest/register" method="post">
    <table>
        <tr>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td><input type="text" id="birthday" name="birthday"></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" name="login"></td>
        </tr>
    </table>
</form>
</body>
</html>
