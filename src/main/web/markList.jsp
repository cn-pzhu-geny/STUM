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

<div class="container-fluid" style="margin-top: 79px">
    <div class="row-fluid">
        <div class="span12">
            <table class="table table-hover table-bordered">
                <thead>
                <tr>
                    <th>
                        活动编号
                    </th>
                    <th>
                        活动名称
                    </th>
                    <th>
                        活动详情
                    </th>
                    <th>
                        得分状况
                    </th>
                </tr>
                </thead>
                <tbody>
                    <c:forEach items="${list}" var="item">
                        <tr>
                            <td>${item.actId}</td>
                            <td>${item.actName}</td>
                            <td>${item.actDescr}</td>
                            <td>${item.scoreList[0].score}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
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
