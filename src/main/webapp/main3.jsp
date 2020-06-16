<%--
  Created by IntelliJ IDEA.
  User: Kang
  Date: 2020/6/16
  Time: 23:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <style>
        #left{
            height: 100%;
            width: 20%;
            display:inline-block;
        }
        #right{
            height: 100%;
            width: 80%;
            display:inline-block;
            float: right;
        }
    </style>
</head>
<body>
<div id="left">
    <iframe src="/left3.jsp" width="100%" height="100%"></iframe>
</div>
<div id="right">
    <iframe src="/right.jsp" width="100%" height="100%" name="right"></iframe>
</div>
</body>
</html>
