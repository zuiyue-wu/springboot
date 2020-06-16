<%--
  Created by IntelliJ IDEA.
  User: Kang
  Date: 2020/6/16
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <style>
        .item{
            height: 10%;
            width: 100%;
            margin-top: 10%;
            margin-left: 10%;
        }
    </style>
</head>
<body>
    <div class="item" ><a href="<%=request.getContextPath() %>/addstaff.jsp" target="right">添加员工</a></div>
    <div class="item" ><a href="<%=request.getContextPath() %>/querystaff.jsp" target="right">查询员工</a></div>
    <div class="item" ><a href="<%=request.getContextPath() %>/fenpeistaff.jsp" target="right">分配人员</a></div>
</body>
<script>

    // $(document).ready(function(){
    //     $("div").each(function (e) {
    //         $(this).click(function () {
    //             console.log($(this).text());
    //             location.href=""
    //         });
    //
    //     });
    //
    // });
</script>
</html>
