
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户信息</title>
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap-theme.css">
    <script src="js/jquery-3.1.1.js/"></script>
    <style>
        #panel1{width: 75%;height:675px;margin-left: auto;margin-right: auto;margin-top: 50px}
    </style>
</head>
<body>
<div class="panel panel-primary" id="panel1">
    <div class="panel-heading" style="height: 75px">
        <h1 class="panel-title" style="color: white"><b>修改用户信息</b></h1>
    </div>
    <div class="panel-body">
        <div>
            <div style="margin-top: 50px">
                <div style="width: 45%;float: left;text-align: right;">
                    <h4 style="border-right: 20px">用户名：</h4></div>
                <div style="width: 55%;float: left;text-align: left;">
                    <input type="hidden" id="id" value="${sessionScope.user.id}">
                    <input type="text" id="name" placeholder="请输入用户名"
                           style="height:39px;font-size: 18px;" size="20" value="${sessionScope.user.name}"/>
                    <input type="hidden" id="jobNumber" value="${sessionScope.user.jobNumber}"/>
                    <nobr><span style="font-size: 18px;color:red" id="error1"></span></nobr>
                </div>
            </div>
            <div style="margin-top: 50px">
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">密码：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="password" id="password1" placeholder="请输入密码"
                           value="${sessionScope.user.password}" style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error2"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">确认密码：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="password" id="password2" placeholder="请再次输入密码"
                           value="${sessionScope.user.password}" style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error3"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">部门：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="deptName" value="${sessionScope.user.deptName}" style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error4"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">职位：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="role" value="${sessionScope.user.role}" style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error5"></span></nobr>
                </div>
            </div>
            <div style="width:100%;text-align: center;float: left;margin-top: 40px">
                <button id="loginBtn1" style="width: 70px;height: 40px" onclick="add()"><h5>保存</h5></button>
                &nbsp;&nbsp;&nbsp;
                <button id="loginBtn3" style="width: 70px;height: 40px" onclick="notDo()"><h5>取消</h5></button>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    function add(){
        $('#error1').html("");
        $('#error2').html("");
        $('#error3').html("");
        $('#error4').html("");
        $('#error5').html("");

        var id = $('#id').val();
        var name = $('#name').val();
        var jobNumber = $('#jobNumber').val();
        var password1 = $('#password1').val();
        var password2 = $('#password2').val();
        var deptName = $('#deptName').val();
        var role = $('#role').val();

        if(name==null || name==""){
            $('#error1').html("请输入用户名");
            return;
        }

        if(password1==null || password1==""){
            $('#error2').html("请输入密码");
            return;
        }

        if(password2==null || password2==""){
            $('#error3').html("请再次输入密码");
            return;
        }

        if(password2!=password1){
            $('#error3').html("两次密码不匹配，请再次输入");
            return;
        }

        if(deptName==null || deptName==""){
            $('#error4').html("请输入部门");
            return;
        }

        if(role==null || role==""){
            $('#error5').html("请输入职位");
            return;
        }

        $.ajax({
            url:"user/update",
            data:{"id":id,"name":name,"password":password1,"deptName":deptName,"role":role,"jobNumber":jobNumber},
            type:"post",
            dataType:"json",
            success:function (data) {
                if(data.result){
                    alert("修改用户信息成功!");
                    self.location.href = "/bysj"
                }else{
                    alert("修改用户信息失败!");
                }
            }
        })
    }

    function notDo() {
        self.location.href = "/bysj";
    }

    $(function () {
        $('#level').val('${sessionScope.admin.level}');
    })
</script>
</html>
