<%--
  Created by IntelliJ IDEA.
  User: hzhb
  Date: 2018/4/27
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN</title>
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap-theme.css">
    <script src="js/jquery-3.1.1.js/"></script>
    <style>
        #panel1{width: 75%;height:375px;margin-left: auto;margin-right: auto;margin-top: 150px}
    </style>
</head>
<body>
    <div class="panel panel-primary" id="panel1">
        <div class="panel-heading" style="height: 75px">
            <h1 class="panel-title"><p style="font-size: 25px;color: white"><b>登录</b></p></h1>
        </div>
        <div class="panel-body">
            <div id="choose" style="display: block;margin-top: 80px">
                <div style="width: 50%;float: left;text-align: center">
                    <div id="choose1" style="width: 50%;height: 80px;background-color: #0b6cbc;margin-left: auto;margin-right: auto">
                        <div>
                            <p style="font-size: 25px;color: white;padding-top: 20px" onclick="chooseUser()"><b>用户登录</b></p>
                        </div>
                    </div>
                </div>
                <div style="width: 50%;float: left;text-align: center">
                    <div id="choose2" style="width: 50%;height: 80px;background-color: #0b6cbc;margin-left: auto;margin-right: auto">
                        <div>
                            <p style="font-size: 25px;color: white;padding-top: 20px" onclick="chooseAdmin()"><b>管理员登录</b></p>
                        </div>
                    </div>
                </div>
            </div>
            <div id="login1" style="display: none">
                    <div style="margin-top: 50px">
                        <div style="width: 45%;float: left;text-align: right;">
                            <h4 style="border-right: 20px">工号：</h4>
                        </div>
                        <div style="width: 55%;float: left;text-align: left;">
                            <input type="text" id="jobNumber" placeholder="请输入工号" style="height:39px;font-size: 18px;" size="20"/>
                            <nobr><span style="font-size: 18px;color:red" id="error1"></span></nobr>
                        </div>
                    </div>
                    <div style="margin-top: 50px">
                        <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                            <h4 style="border-right: 20px">密码：</h4>
                        </div>
                        <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                            <input type="password" id="password1" placeholder="请输入密码" style="height:39px;font-size: 18px;"size="20"/>
                            <nobr><span style="font-size: 18px;color:red" id="error2"></span></nobr>
                        </div>
                    </div>
                <div style="width:100%;text-align: center;float: left;margin-top: 40px">
                    <button id="loginBtn1" style="width: 70px;height: 40px" onclick="login1()"><h5>登录</h5></button>
                    &nbsp;&nbsp;&nbsp;
                    <button id="loginBtn3" style="width: 70px;height: 40px" onclick="goBack()"><h5>返回</h5></button>
                </div>
            </div>
            <div id="login2" style="display: none">
                <div style="margin-top: 50px">
                    <div style="width: 45%;float: left;text-align: right;">
                        <h4 style="border-right: 20px">用户名：</h4>
                    </div>
                    <div style="width: 55%;float: left;text-align: left;">
                        <input type="text" id="name" placeholder="请输入管理员用户名" style="height:39px;font-size: 18px;" size="20"/>
                        <nobr><span style="font-size: 18px;color:red" id="error3"></span></nobr>
                    </div>
                </div>
                <div style="margin-top: 50px">
                    <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                        <h4 style="border-right: 20px">密码：</h4>
                    </div>
                    <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                        <input type="password" id="password2" placeholder="请输入密码" style="height:39px;font-size: 18px;"size="20"/>
                        <nobr><span style="font-size: 18px;color:red" id="error4"></span></nobr>
                    </div>
                </div>
                <div style="width:100%;text-align: center;float: left;margin-top: 40px">
                    <button id="loginBtn2" style="width: 70px;height: 40px" onclick="login2()"><h5>登录</h5></button>
                    &nbsp;&nbsp;&nbsp;
                    <button id="loginBtn4" style="width: 70px;height: 40px" onclick="goBack()"><h5>返回</h5></button>
                </div>
            </div>
     </div>
</div>
</body>

<script type="text/javascript">
    function chooseAdmin() {
        $('#choose').hide();
        $('#login2').show();
    }

    function chooseUser() {
        $('#choose').hide();
        $('#login1').show();
    }

    function goBack() {
        $('#login1').hide();
        $('#login2').hide();
        $('#choose').show();
    }

    function login1() {
        $('#error1').html("");
        $('#error2').html("");
        var jobNumber = $('#jobNumber').val();
        var password = $('#password1').val();
        if(jobNumber=="" || jobNumber==null){
            $('#error1').html("请输入工号");
            return;
        }
        if(password=="" || password==null){
            $('#error2').html("请输入密码");
            return;
        }
        $.ajax({
            url:"user/login",
            type:"post",
            data:{"jobNumber":jobNumber,"password":password},
            dataType:"json",
            success:function (data) {
                if(data.result==true){
                    alert("登陆成功！");
                    self.location.href="/bysj";
                }else{
                    $('#error3').html("用户名或密码错误");
                    return;
                }
            }
        })
    }

    function login2() {
        $('#error3').html("");
        $('#error4').html("");
        var name = $('#name').val();
        var password = $('#password2').val();
        if(jobNumber=="" || jobNumber==null){
            $('#error3').html("请输入用户名");
            return;
        }
        if(password=="" || password==null){
            $('#error4').html("请输入密码");
            return;
        }
        $.ajax({
            url:"admin/login",
            type:"post",
            data:{"name":name,"password":password},
            dataType:"json",
            success:function (data) {
                if(data.result==true){
                    alert("登陆成功！");
                    self.location.href="/bysj";
                }else{
                    $('#error3').html("用户名或密码错误");
                    return;
                }
            }
        })
    }
</script>
</html>
