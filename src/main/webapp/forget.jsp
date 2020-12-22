<%--
  Created by IntelliJ IDEA.
  User: 18485
  Date: 2020/12/1
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="forget" method="post">
    账号:<input type="text" name="userNo" placeholder="请输入账号"><br/>
    账号类型：<input type="radio" name="userNo1"  value="1"  checked="checked">学生
                <input type="radio" name="userNo1"  value="2"  checked="checked">老师
                <input type="radio" name="userNo1" value="3" checked="checked"> 企业<br/>
    密码:<input type="password" name="password" placeholder="请输入新密码"/><br/>
    <input type="submit" value="提交"><br/>
</form>
</body>
</html>
