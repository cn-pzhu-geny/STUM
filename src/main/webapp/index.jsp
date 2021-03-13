<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.0.1">
    <title>Carousel Template · Bootstrap</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/carousel/">

    <!-- Bootstrap core CSS -->
<link href="css/bootstrap.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="customCSS/carousel.css" rel="stylesheet">
  </head>
  <body>
<jsp:include page="header_index.jsp"/>
<main role="main">
  <jsp:include page="carouse.jsp"/>


  <!-- Marketing messaging and featurettes
  ================================================== -->
  <!-- Wrap the rest of the page in another container to center all the content. -->

  <div class="container marketing">

    <!-- Three columns of text below the carousel -->
    <div class="row">
      <div class="col-lg-4">
        <img class="bd-placeholder-img rounded-circle" width="140" height="140" src="images/welcome/lbw.jpg">
        <h2>卢本伟</h2>
        <p>1993年8月11日出生于香港，前皇族电子竞技俱乐部英雄联盟分部中单，在获得S3全球决赛亚军后退役。曾获2011TGA成都区冠军、2011TGA总决赛冠军、2011WCG中国区冠军、2013S3全球总决赛中国区冠军、2013S3全球总决赛亚军等荣誉。</p>
        <p><a class="btn btn-secondary" href="#" role="button">查看更多 &raquo;</a></p>
      </div><!-- /.col-lg-4 -->
      <div class="col-lg-4">
        <img class="bd-placeholder-img rounded-circle" width="140" height="140" src="images/welcome/mht.jpg">
        <h2>马化腾</h2>
        <p>1993年毕业于深圳大学计算机专业，进入深圳润迅通信发展有限公司工作，从软件工程师一直做到开发部主管。1998年创办腾讯计算机系统有限公司。在他的带领下，腾讯公司发展成为中国营业收入最高的互联网企业，是中国所有境外上市互联网企业中市值最高的公司。</p>
        <p><a class="btn btn-secondary" href="#" role="button">查看更多 &raquo;</a></p>
      </div><!-- /.col-lg-4 -->
      <div class="col-lg-4">
        <img class="bd-placeholder-img rounded-circle" width="140" height="140" src="images/welcome/mbg.jpg">
        <h2>马宝国</h2>
        <p>生于1952年，英国混元太极拳协会创始人，浑元形意太极门掌门人，马保国的一些言行，实际上就是哗众取宠、招摇撞骗，说到底是一场闹剧。口口声声弘扬传统武术，实际上做的都是伤害传统武术的事。斥责年轻人不讲武德，他本身却毫无正大光明、谨言慎行、尊崇敬畏传统的武德。</p>
        <p><a class="btn btn-secondary" href="#" role="button">查看更多 &raquo;</a></p>
      </div><!-- /.col-lg-4 -->
    </div><!-- /.row -->


    <!-- START THE FEATURETTES -->

    <hr class="featurette-divider">

    <div class="row featurette">
      <div class="col-md-7">
        <h2 class="featurette-heading">关于网络工程</h2>
        <p class="lead">
          培养目标：培养德智体全面发展的，掌握网络工程领域及网络开发所必须的基本理论、基本知识和基本技能及接受计算机技术等方面的基本训练，具备良好的综合素质、科学素养和创新能力，能够在网络工程技术、通信工程、网络开发等领域中，从事网络编程、网络开发以及网络规划、网络工程设计和建设、运行维护及管理、安全防护和性能分析等方面的高素质应用型人才。<br>
          主干课程：微机原理与接口技术、网络设备配置与管理、网络测试与优化、Windows网络编程、TCP/IP网络编程技术、JAVA程序设计等。<br>
          就业去向：国际国内大型IT企业、企事业单位、国防部门、金融机构、事业单位等，也可继续深造，报考相关专业硕士研究生。<br>
        </p>
      </div>
      <div class="col-md-5">
        <img class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto" width="500" height="500" src="images/welcome/major.png">
      </div>
    </div>

    <hr class="featurette-divider">

    <div class="row featurette">
      <div class="col-md-7 order-md-2">
        <h2 class="featurette-heading">关于我们</h2>
        <p class="lead">略</p>
      </div>
      <div class="col-md-5 order-md-1">
        <img class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto" width="500" height="500" src="images/welcome/about.png">
      </div>
    </div>




    </div>

    <hr class="featurette-divider">

    <!-- /END THE FEATURETTES -->

  </div><!-- /.container -->


  <!-- FOOTER -->
  <footer class="container">
    <p class="float-right"><a href="#">Back to top</a></p>
    <p>&copy; 2017-2020 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
  </footer>
</main>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>

      <script>window.jQuery || document.write('<script src="js/vendor/jquery.slim.min.js"><\/script>')</script><script src="js/bootstrap.bundle.js"></script></body>
</html>
