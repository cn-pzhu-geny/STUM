<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script
      src="sign.js"
      crossorigin="anonymous"
    ></script>
    <link rel="stylesheet" href="css/login.css" />
    <title>Sign in & Sign up Form</title>
  </head>
  <body>
    <div class="container">
      <div class="forms-container">
        <div class="signin-signup">
          <form action="login" class="sign-in-form">
            <h2 class="title">登录</h2>
            <div class="input-field">
              <i class="fas fa-user"></i>
              <input type="text" placeholder="账号" name="userno"/>
            </div>
            <div class="input-field">
              <i class="fas fa-lock"></i>
              <input type="password" placeholder="密码" name="password"/>
            </div>
            <a href="">
              <img  src="validcode" />
              <input type="button" class="btn" value="换一张">
            </a>
            
            <div class="input-field" >
              <i class="fas fa-lock"></i>
              <input type="text" name="validcode" placeholder="验证码" />
            </div>
            <input type="submit" value="GO" class="btn solid" />
          </form>
          <form action="#" class="sign-up-form">
            <h2 class="title">Sign up</h2>
            <div class="input-field">
              <i class="fas fa-user"></i>
              <input type="text" placeholder="账号" />
            </div>
            <div class="input-field">
              <i class="fas fa-envelope"></i>
              <input type="email" placeholder="邮箱" />
            </div>
            <div class="input-field">
              <i class="fas fa-lock"></i>
              <input type="password" placeholder="密码" />
            </div>
            <input type="submit" class="btn" value="Sign up" />
          </form>
        </div>
      </div>

      <div class="panels-container">
        <div class="panel left-panel">
          <div class="content">
            <h3>还未加入我们?</h3>
            <p>
              使用您的学号，教职工号等，注册一个账号吧！
            </p>
            <button class="btn transparent" id="sign-up-btn">
              注册
            </button>
          </div>
          <img src="img/log.svg" class="image" alt="" />
        </div>
        <div class="panel right-panel">
          <div class="content">
            <h3>已拥有账号?</h3>
            <p>
              使用您的学号，教职工号等，登陆吧！
            </p>
            <button class="btn transparent" id="sign-in-btn">
              登录
            </button>
          </div>
          <img src="img/register.svg" class="image" alt="" />
        </div>
      </div>
    </div>

    <script src="app.js"></script>
  </body>
</html>
