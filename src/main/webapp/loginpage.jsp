<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            background-image: url("/img/bg.png");
            background-repeat: no-repeat;
            background-size: 100% 100%;
            background-attachment: fixed;
        }

        .login_container {
            width: 960px;
            height: 404px;
            position: relative;

        }

        #img {
            height: 400px;
            width: 960px;
            opacity: 0.8;
            filter: alpha(opacity=80);
        }

        .logo {
            position: absolute;
            margin-top: -390px;
            margin-left: 10px;
        }

        .logo img {
            width: 200px;
        }

        .word{
            font-family: 华文新魏, monospace;
            color: white;
            font-size: 40px;
            position: absolute;
            margin-top: -230px;
            margin-left: 60px;
            float: left;
        }

        #line{
            position: absolute;
            width: 0;
            height: 250px;
            border-left: 2px solid white;
            margin-left: 476px;
            margin-top: -320px;

        }

        .login{
            width: 400px;
            height: 200px;
            position: absolute;
            left:500px;
            top:120px;
            margin-left: 20px;
        }
        span{
            width: 70px;
            height: 26px;
            color: #FFFFFF;
            font-size: 20px;
            margin-right: 20px;
        }
        .input_1,.input_2{
            width: 200px;
            height: 26px;
            margin-right: 20px;
        }
       /* a{
            color: #FFFFFF;
            margin-left: 200px;
        }*/
        .button1,.button2{
            background-color: #169BD5;
            color: #FFFFFF;
            width: 96px;
            height: 25px;
        }
        .button2{
            margin-left: 70px;
        }
    </style>
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
<div class="login_container">
    <img src="img/blue.png" alt="" id="img">
    <div class="logo">
        <img src="img/logo.png" alt="">
    </div>
    <div class="word">
        <div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎登录！</div>
        <div>网络工程专业人才网</div>
    </div>
    <div id="line"></div>


    <form action="login" method="post" class="login">
        <span>账号:</span><input class="input_1" type="text" name="userno" placeholder="请输入账号"/><br/>
        <span>密码:</span><input type="password" class="input_2" name="password" placeholder="请输入密码"><br/>
        <span><input type="text" name="validcode" class="input_1"></span><img  src="validcode" ><a href="">换一张</a>
        <a href="#">忘记密码</a><br/><br/><br/>
        <a href="reg.jsp" class="button1">注册</a>
        <input type="submit" value="登录" class="button2"/>
    </form>
</div>
</body>
</html>