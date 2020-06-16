<%--
  Created by IntelliJ IDEA.
  User: Kang
  Date: 2020/6/16
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
</head>
<body>
<form id="addstaff">
<table>
    <tr>
        <td><span style="corlor:red">*</span>用户名</td>
        <td><input type="text" name="name"></td>
    </tr>
    <tr>
        <td>密码</td>
        <td><input type="password" name="password"></td>
    </tr>
    <tr>
        <td>性别</td>
        <td><input type="radio" name="sex" value="男">男
            <input type="radio" name="sex" value="女">女
        </td>
    </tr>
    <tr>
        <td>出生日期(yyyy-mm-dd)</td>
        <td><input type="text" name="birthday"></td>
    </tr>
    <tr>
        <td>入职时间(yyyy-mm-dd)</td>
        <td><input type="text" name="hireDate"></td>
    </tr>
    <tr>
        <td>职位</td>
        <td><input type="text" name="position"></td>
    </tr>
    <tr>
        <td>学历</td>
        <td>
            <select name="qualification">
                <option value="专科">专科</option>
                <option value="本科">本科</option>
            </select>
        </td>
    </tr>
    <tr>
        <td>工作经历</td>
        <td><input type="text" name="experience"></td>
    </tr>
    <tr>
        <td>身份标识</td>
        <td>
            <select name="flag">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
            </select>
        </td>
    </tr>
    <tr>
        <td><input type="button" value="提交"  onclick="add();"></td>
        <td><input type="reset" name="重置"></td>
    </tr>
</table>
</form>
</body>

<script>
    function add() {
        $.ajax({
            url:"<%=request.getContextPath() %>/temp/savePower",
            data:$("#addstaff").serialize(),
            success:function(data){

            }
        })
    }
</script>
</html>
