//未登录状态头组件
let unLoginHeader =
    `<header>
        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="#" >ICT-产教融合</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="/">主页 <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="/talentShow.html">人才浏览 <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="/aboutus.html">关于我们 <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="/forum">论坛 <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="/test">测试 <span class="sr-only">(current)</span></a>
                    </li>
                </ul>
                <a class="btn btn-outline-success my-2 my-sm-0" href="/newlogin.jsp">登录</a>
            </div>
        </nav>
    </header>`

let studentLoginHeader =
    `<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
  <a class="navbar-brand" href="#">网络工程人才系统</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarsExampleDefault">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/">主页 <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="/talentShow.html">人才浏览 <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="/aboutus.html">关于我们 <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="/forum">论坛 <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">活动查看</a>
        <div class="dropdown-menu" aria-labelledby="dropdown01">
          <a class="dropdown-item" href="#">报名参与</a>
          <a class="dropdown-item" href="#">历史参与</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">消息管理</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/getinfo">个人信息管理</a>
      </li>
    </ul>
      <a class="btn btn-outline-success my-2 my-sm-0" href="/" onclick="clearCookie()">退出登录</a>
  </div>
</nav>`

let teacherLoginHeader =
    `<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
  <a class="navbar-brand" href="#">网络工程人才系统</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarsExampleDefault">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">首页 <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">活动查看</a>
        <div class="dropdown-menu" aria-labelledby="dropdown01">
          <a class="dropdown-item" href="#">报名参与</a>
          <a class="dropdown-item" href="#">历史参与</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">消息管理</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" >个人信息管理</a>
      </li>
    </ul>
      <a class="btn btn-outline-success my-2 my-sm-0" href="/">退出登录</a>
  </div>
</nav>`


//轮播图组件
let carouse =
    `<div id="myCarousel" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="images/welcome/saad-chaudhry-G25LeMV7fAw-unsplash.jpg">
                <div class="container">
                    <div class="carousel-caption text-left">
                        <h1>Example headline.</h1>
                        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                        <p><a class="btn btn-lg btn-primary" href="#" role="button">了解更多</a></p>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <img src="images/welcome/kristina-manchenko-9m91N6lLfhE-unsplash.jpg">
                <div class="container">
                    <div class="carousel-caption">
                        <h1>Another example headline.</h1>
                        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                        <p><a class="btn btn-lg btn-primary" href="#" role="button">了解更多</a></p>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <img src="images/welcome/jake-green-pxfeIzHuMfo-unsplash.jpg">
                <div class="container">
                    <div class="carousel-caption text-right">
                        <h1>One more for good measure.</h1>
                        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                        <p><a class="btn btn-lg btn-primary" href="#" role="button">了解更多</a></p>
                    </div>
                </div>
            </div>
        </div>
        <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>`


//未登录状态
Vue.component('header-component-unlogin', {
    template: unLoginHeader
})

//学生头组件
Vue.component('header-component-student', {
    template: studentLoginHeader
})
//轮播图
Vue.component('carouse-template', {
    template: carouse
})

var header = new Vue({
    el: ".header_template",
    methods: {
        status: function () {
            return $.cookie("status");
        }
    }
})

var carouser = new Vue({
    el: ".carouser_template"
})

function clearCookie() {
    $.cookie("status", -1)
    $.cookie("uid", null)
    console.log("清理成功");
}

