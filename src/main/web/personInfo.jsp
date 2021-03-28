<%--
Created by IntelliJ IDEA.
User: HydraOne
Date: 2021/3/7
Time: 21:53
To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.80.0">
    <title>Blog Template · Bootstrap v4.6</title>
    <link rel="canonical" href="https://getbootstrap.com/docs/4.6/examples/blog/">

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">


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
    <link href="https://fonts.googleapis.com/css?family=Playfair&#43;Display:700,900" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="customCSS/blog.css" rel="stylesheet">
</head>
<body>
<div class="header_template">
    <div v-if="status()==='3'">
        <header-component-student></header-component-student>
    </div>
    <div v-else>
        <header-component-unlogin></header-component-unlogin>
    </div>
</div>

<div class="card" style="width: 900px;margin: 79px auto;">
    <div class="card-header">
        个人信息
    </div>
    <div class="card-body">
        <form id="personinfo" action="/update" method="post">
            <div class="form-row" style="margin-bottom: 20px">
                <img src="files/header/${student.stuPhoto}.png" class="bd-placeholder-img" style="margin-right: 30px" width="200" height="250" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"/>
                <div class="form-group col-md-8">
                    <label for="inputStuInfo">简介</label>
                    <textarea type="text" class="form-control" id="inputStuInfo" style="height: 210px" form="personinfo" name="stuInfo">${student.stuInfo}</textarea>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="inputStuNo">学号</label>
                    <input type="text" class="form-control" id="inputstuNo" value="${student.stuNo}" readonly>
                </div>
                <div class="form-group col-md-6">
                    <label for="inputName">姓名</label>
                    <input type="text" class="form-control" id="inputName" value="${student.stuName}" readonly>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="inputStuId">身份证号码</label>
                    <input type="text" class="form-control" id="inputStuId" value="${student.stuId}" readonly>
                </div>
                <div class="form-group col-md-6">
                    <label for="inputStuClass">班级</label>
                    <input type="text" class="form-control" id="inputstuClass" value="${student.stuClass}" readonly>
                </div>
                <div class="form-group col-md-6">
                    <label for="inputStuContact">联系方式</label>
                    <input type="text" class="form-control" id="inputStuContact" value="${student.stuContact}" name="stuCont">
                </div>
                <div class="form-group col-md-4">
                    <label for="inputState">State</label>
                    <select id="inputState" class="form-control" readonly>
                        <option selected>${student.stuSex}</option>
                    </select>
                </div>
            </div>
            <button type="submit" class="btn btn-primary">提交</button>
        </form>
    </div>
</div>


<footer class="blog-footer">
    <p>Blog template built for <a href="https://getbootstrap.com/">Bootstrap</a> by <a href="https://twitter.com/mdo">@mdo</a>.
    </p>
    <p>
        <a href="#">Back to top</a>
    </p>
</footer>
<script src="js/jquery-3.6.0.js"></script>
<script src="js/vue.js"></script>
<script src="js/analysis.js"></script>
<script src="https://cdn.staticfile.org/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
<script src="js/Header.js"></script>
</body>
</html>

