<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <script type="text/javascript" src="js\jquery-1.12.2.js"></script>
    <script type="text/javascript">
        $(function(){
            $(a).onclick(function(){
                $("img").Attr("src","validcode?Data="+new Date().getTime());
            });

        });
    </script>

</head>

<body>
${error}
<form action="register" method="post" enctype="multipart/form-data">
    账号类型：<input type="radio" name="user"  value="1"  checked="checked">学生
    <input type="radio" name="user"  value="2"  checked="checked">老师
    <input type="radio" name="user" value="3" checked="checked"> 企业<br/>
    <table>
        <tr>
            <td>用户名：</td>
            <td colspan="2"><input type="text" name="userNo"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td colspan="2"><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>权限：</td>
            <td colspan="2"><input type="text" name="permission"></td>
        </tr>
        <tr>
            <td>头像：</td>
            <td colspan="2"><input type="file" name="headpath"></td>
        </tr>
        <tr>
            <td>验证码：</td>
            <td><input type="text" name="validcode"></td>
            <td><img  src="validcode" ><a href="reg.jsp">换一张</a></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"></td>
        </tr>
    </table>
</form>
</body>
</html>
