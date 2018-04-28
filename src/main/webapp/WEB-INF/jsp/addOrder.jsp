<%--
  Created by IntelliJ IDEA.
  User: zxmlzz
  Date: 2018/4/27
  Time: 0:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加管理员</title>
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap-theme.css">
    <script src="js/jquery-3.1.1.js/"></script>
    <style>
        #panel1{width: 75%;height:575px;margin-left: auto;margin-right: auto;margin-top: 50px}
    </style>
</head>
<body>
<div class="panel panel-primary" id="panel1">
    <div class="panel-heading" style="height: 75px">
        <h1 class="panel-title" style="color: white"><b>添加管理员</b></h1>
    </div>
    <div class="panel-body">
        <div>
            <div style="margin-top: 50px">
                <div style="width: 45%;float: left;text-align: right;">
                    <h4 style="border-right: 20px">用户名：</h4></div>
                <div style="width: 55%;float: left;text-align: left;">
                    <input type="text" id="name" placeholder="请输入管理员用户名" style="height:39px;font-size: 18px;" size="20"/>
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
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">确认密码：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="password" id="password2" placeholder="请再次输入密码" style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error3"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">权限：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <select id="level" style="height: 39px;font-size: 18px">
                        <option value="0">请选择管理员权限</option>
                        <option value="1">普通管理员</option>
                    </select>
                    <nobr><span style="font-size: 18px;color:red" id="error4"></span></nobr>
                </div>
            </div>
            <div style="width:100%;text-align: center;float: left;margin-top: 40px">
                <button id="loginBtn1" style="width: 70px;height: 40px" onclick="add()"><h5>添加</h5></button>
                &nbsp;&nbsp;&nbsp;
                <button id="loginBtn3" style="width: 70px;height: 40px" onclick="notDo()"><h5>取消</h5></button>
            </div>
        </div>
    </div>
</div>
</body>
</html>
