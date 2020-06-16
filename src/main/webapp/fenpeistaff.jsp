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
<table id="table1">
    <tr >
        <td>员工编号</td>
        <td>密码</td>
        <td>姓名</td>
        <td>性别</td>
        <td>出生日期</td>
        <td>所属角色</td>
        <td>操作</td>
    </tr>
</table>
<form id="fp">
    <table style="display: none" id="edit1">

    </table>
</form>

</body>
<script>
    $(document).ready(function(){
        $.ajax({
            url:"<%=request.getContextPath() %>/temp/listUnassigned",
            success:function(data){
                console.log(data)
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
                        "        <td><input class=\"fenpei\" type=\"button\" name='"+data[i].username+"' bh='"+data[i].name+"' value=\"分配部门\"/> " +
                        "    </tr> "
                }
            // <input type='button' onclick='deletestaff("+data[i].username+")'value='删除'> </td>\n
                $("#table1").append(array)
            }
        })
    });
</script>
<script>
    $(document).on("click", ".fenpei",function () {

        $("#edit1").removeAttr("style")
        $("#table1").attr("style","display: none")

        var array="";
            array+="<tr>\n" +
                "        <td><span style=\"corlor:red\">*</span>用户ID</td>\n" +
                "       <td>真实姓名</td>\n" +
                "        <td>主管</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td><input type=\"text\" name=\"username\" value='"+$(this).attr("name")+"'></td>\n" +
                "        <td><input type=\"name\" name=\"name\" value='"+$(this).attr("bh")+"'></td>\n" +
                "        <td> " +
                "           <select id='zhuguan' name='superId'>" +
                "           </select>" +
                "        </td>\n" +
                "    </tr>\n"
        array+="<tr  colspan=\"2\">\n" +
            "\t<td><input class=\"submit\" type=\"button\"  value=\"提交\"/></td>\n" +
            "  </tr>"
        $("#edit1").append(array)

        $.ajax({
            url:"<%=request.getContextPath() %>/temp/listflag",
            success:function(data){
                var array1="";
                for(var i=0; i<data.length; i++)
                {
                    array1+="<option value='"+data[i].username+"'>"+data[i].name+"</option>"
                }
                $("#zhuguan").append(array1)
            }
        })

    })
</script>
<script>
    $(document).on("click", ".submit",function () {
        console.log($("#fp").serialize());
        $.ajax({
            url:"<%=request.getContextPath() %>/temp/updateflag",
            data:$("#fp").serialize(),
            success:function(data){
                window.location.reload();
            }
        })
    })
</script>
</html>
