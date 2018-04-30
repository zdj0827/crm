<%--
  Created by IntelliJ IDEA.
  User: zxmlzz
  Date: 2018/4/27
  Time: 0:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改潜在客户信息</title>
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap-theme.css">
    <script src="js/jquery-3.1.1.js/"></script>
    <style>
        #panel1{width: 75%;height:775px;margin-left: auto;margin-right: auto;margin-top: 50px}
    </style>
</head>
<body>
<div class="panel panel-primary" id="panel1">
    <div class="panel-heading" style="height: 75px">
        <h1 class="panel-title" style="color: white"><b>修改潜在客户信息</b></h1>
    </div>
    <div class="panel-body">
        <div>
            <div style="margin-top: 50px">
                <div style="width: 45%;float: left;text-align: right;">
                    <h4 style="border-right: 20px">客户名：</h4></div>
                <div style="width: 55%;float: left;text-align: left;">
                    <input type="hidden" id="id" value="${sessionScope.pCustomer.id}"/>
                    <input type="text" id="name" placeholder="请输入客户名"
                           value="${sessionScope.pCustomer.name}"style="height:39px;font-size: 18px;" size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error1" class="error"></span></nobr>
                </div>
            </div>
            <div style="margin-top: 50px">
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">客户电话：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="phone" placeholder="请输入客户电话"
                           value="${sessionScope.pCustomer.phone}"style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error2" class="error"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">联系地址：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="address" placeholder="请输入联系地址"
                           value="${sessionScope.pCustomer.address}"style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error3" class="error"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">公司名称：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="companyName" placeholder="请输入公司名称"
                           value="${sessionScope.pCustomer.companyName}"style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error4" class="error"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">公司电话：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="companyTel" placeholder="请输入公司电话"
                           value="${sessionScope.pCustomer.companyTel}"style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error5" class="error"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">公司地址：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="companyAddress" placeholder="请输入公司地址"
                           value="${sessionScope.pCustomer.companyAddress}"style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error6" class="error"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">等级：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <select id="level" style="height: 39px;font-size: 18px">
                        <option value="0">请选择客户等级</option>
                        <option value="1">普通</option>
                        <option value="2">重要</option>
                    </select>
                    <nobr><span style="font-size: 18px;color:red" id="error7" class="error"></span></nobr>
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
        $('#error6').html("");
        $('#error7').html("");
        var id=$('#id').val();
        var name = $('#name').val();
        var phone = $('#phone').val();
        var address = $('#address').val();
        var companyName = $('#companyName').val();
        var companyTel = $('#companyTel').val();
        var companyAddress = $('#companyAddress').val();
        var level = $('#level').val();
        if(name=="" || name==null){
            $('#error1').html("请输入客户名");
            return;
        }
        if(phone=="" || phone==null){
            $('#error2').html("请输入客户电话");
            return;
        }
        if(address=="" || address==null){
            $('#error3').html("请输入客户联系地址");
            return;
        }
        if(companyName=="" || companyName==null){
            $('#error4').html("请输入客户公司名");
            return;
        }
        if(companyTel=="" || companyTel==null){
            $('#error5').html("请输入客户公司电话");
            return;
        }
        if(companyAddress=="" || companyAddress==null){
            $('#error6').html("请输入客户公司地址");
            return;
        }
        if(level==0 || level==null){
            $('#error7').html("请选择客户等级");
            return;
        }
        $.ajax({
            url:"potentialCustomer/update",
            data:{"id":id,"name":name,"phone":phone,"address":address,"companyName":companyName,
                "companyTel":companyTel,"companyAddress":companyAddress,"level":level
            },
            type:"post",
            dataType:"json",
            success:function(data){
                if(data.result){
                    alert("修改潜在客户信息成功");
                    $('#pageload').load("potentialCustomerList");
                }else{
                    alert("修改潜在客户信息失败");
                    return;
                }
            }
        })
    }

    function notDo(){
        $('#pageload').load("potentialCustomerList");

    }

    $(function () {
        $('#level').val('${sessionScope.pCustomer.level}');
    })
</script>
</html>
