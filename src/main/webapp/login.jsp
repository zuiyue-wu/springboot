<%--
  Created by IntelliJ IDEA.
  User: Kang
  Date: 2020/6/16
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>

<%--    <link rel="stylesheet" type="text/css" href="login.css"/>--%>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <style>
        body {
            background-image: url("image/login.jpg");;
            background-size: 100%;
            background-repeat: no-repeat;
        }

        #login_frame {
            width: 400px;
            height: 260px;
            padding: 13px;

            position: absolute;
            left: 50%;
            top: 50%;
            margin-left: -200px;
            margin-top: -200px;

            background-color: rgba(240, 255, 255, 0.5);

            border-radius: 10px;
            text-align: center;
        }

        form p > * {
            display: inline-block;
            vertical-align: middle;
        }

        #image_logo {
            margin-top: 22px;
        }

        .label_input {
            font-size: 14px;
            font-family: 宋体;

            width: 65px;
            height: 28px;
            line-height: 28px;
            text-align: center;

            color: white;
            background-color: #3CD8FF;
            border-top-left-radius: 5px;
            border-bottom-left-radius: 5px;
        }

        .text_field {
            width: 278px;
            height: 28px;
            border-top-right-radius: 5px;
            border-bottom-right-radius: 5px;
            border: 0;
        }

        #btn_login {
            font-size: 14px;
            font-family: 宋体;

            width: 120px;
            height: 28px;
            line-height: 28px;
            text-align: center;

            color: white;
            background-color: #3BD9FF;
            border-radius: 6px;
            border: 0;

            float: left;
        }

        #forget_pwd {
            font-size: 12px;
            color: white;
            text-decoration: none;
            position: relative;
            float: right;
            top: 5px;

        }

        #forget_pwd:hover {
            color: blue;
            text-decoration: underline;
        }

        #login_control {
            padding: 0 28px;
        }
    </style>
</head>

<body>
<div id="login_frame">
    <form method="post" id="loginForm">
        <p><label class="label_input">用户名</label><input type="text" id="name" class="text_field" name="name"/></p>
        <p><label class="label_input">密码</label><input type="text" id="password" class="text_field"name="password"/></p>
        <p><label class="label_input">身份</label><select id="position" class="text_field" name="position">

        </select></p>
        <div id="login_control">
            <input type="button" id="btn_login" value="登录" onclick="login();"/>
        </div>
    </form>
</div>

</body>
<script >
    $(document).ready(function(){
        $.ajax({
            url:"<%=request.getContextPath() %>/temp/selectPosition",
            success:function(data){
                var array="";
                for(var i=0; i<data.length; i++)
                {
                    array+=" <option value='"+data[i].position+"'>"+data[i].position+"</option>"
                }
                $("#position").append(array)
            }
        })

    });
    function login() {
        $.ajax({
            url:"<%=request.getContextPath() %>/temp/login",
            data:$("#loginForm").serialize(),
            success:function(data){
                console.log(data)
                if(data=="您输入的账户不存在"){
                    alert("您输入的账户不存在")
                }else if (data=="您的密码输入不正确"){
                    alert("您的密码输入不正确")
                }else if(data=="您的身份验证不正确"){
                    alert("您的身份验证不正确")
                }
                else{
                    if(data=="2"){
                        location.href="<%=request.getContextPath() %>/main2.jsp"
                    }

                }

            }
        })
    }
</script>
</html>