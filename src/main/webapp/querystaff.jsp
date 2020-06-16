<%--
  Created by IntelliJ IDEA.
  User: Kang
  Date: 2020/6/16
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
</head>
<body>
<table id="table">
    <tr >
        <td>员工编号</td>
        <td>密码</td>
        <td>真实姓名</td>
        <td>性别</td>
        <td>出生日期</td>
        <td>所属角色</td>
        <td>操作</td>
    </tr>
</table>
<table style="display: none" id="edit">

</table>
</body>
<script>
    $(document).ready(function(){
        $.ajax({
            url:"<%=request.getContextPath() %>/temp/listPosition",
            success:function(data){
                var array="";
                for(var i=0; i<data.length; i++)
                {
                    array+="<tr>\n" +
                        "        <td>"+data[i].username+"</td>\n" +
                        "        <td>"+data[i].password+"</td>\n" +
                        "        <td>"+data[i].name+"</td>\n" +
                        "        <td>"+data[i].sex+"</td>\n" +
                        "        <td>"+data[i].birthday+"</td>\n" +
                        "        <td>"+data[i].flag+"</td>\n" +
                        "        <td><input class=\"tab\" type=\"button\" name='"+data[i].username+"' value=\"查看\"/> <input class=\"del\" type=\"button\" name='"+data[i].username+"' value=\"删除\"/> " +
                        "    </tr> "
                }
            // <input type='button' onclick='deletestaff("+data[i].username+")'value='删除'> </td>\n
                $("#table").append(array)
            }
        })
    });
</script>
<script>
    $(document).on("click", ".tab",function () {
        // console.log($(this).attr("name"))
        $.ajax({
            url:"<%=request.getContextPath() %>/temp/selectTempsDateils",
            data:{username:$(this).attr("name")},
            success:function(data){
                console.log(data)
                if (data!="")
                {
                    $("#edit").removeAttr("style")
                    $("#table").attr("style","display: none")
                }
                var array="";
                for(var i=0; i<data.length; i++)
                {
                    array+="<tr>\n" +
                        "        <td><span style=\"corlor:red\">*</span>用户名</td>\n" +
                        "        <td><input type=\"text\" name=\"name\" value='"+data[i].username+"'></td>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td>密码</td>\n" +
                        "        <td><input type=\"password\" name=\"password\" value='"+data[i].password+"'></td>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td>性别</td>\n" +
                        "        <td>"+data[i].password+"" +
                        "        </td>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td>出生日期(yyyy-mm-dd)</td>\n" +
                        "        <td><input type=\"text\" name=\"birthday\" value='"+data[i].birthday+"'></td>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td>职位</td>\n" +
                        "        <td><input type=\"text\" name=\"position\"  value='"+data[i].position+"'></td>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td>学历</td>\n" +
                        "        <td>"+data[i].qualification+"" +
                        "        </td>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td>入职时间(yyyy-mm-dd)</td>\n" +
                        "        <td><input type=\"text\" name=\"flag\" value='"+data[i].hireDate+"'></td>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td>所属角色</td>\n" +
                        "        <td><input type=\"text\" name=\"flag\" value='"+data[i].flag+"'></td>\n" +
                        "    </tr>\n" +
                        "    </tr> "
                }
                array+="<tr  colspan=\"2\">\n" +
                    "\t<td><input class=\"returns\" type=\"button\"  value=\"返回\"/></td>\n" +
                    "  </tr>"
                $("#edit").append(array)
            }
        })
    })
</script>
<script>
    $(document).on("click", ".del",function () {
        $.ajax({
            url:"<%=request.getContextPath() %>/temp/deletePosition",
            data:{username:$(this).attr("name")},
            success:function(data){
                window.location.reload();

            }
        })
    })
</script>
</html>
