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
    <title>修改员工信息</title>
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap-theme.css">
    <script src="js/jquery-3.1.1.js/"></script>
    <style>
        #panel1{width: 75%;height:1075px;margin-left: auto;margin-right: auto;margin-top: 50px}
    </style>
</head>
<body>
<div class="panel panel-primary" id="panel1">
    <div class="panel-heading" style="height: 75px">
        <h1 class="panel-title" style="color: white"><b>修改员工信息</b></h1>
    </div>
    <div class="panel-body">
        <div>
            <div style="margin-top: 50px">
                <div style="width: 45%;float: left;text-align: right;">
                    <h4 style="border-right: 20px">姓名：</h4></div>
                <div style="width: 55%;float: left;text-align: left;">
                    <input type="hidden" id="id" value="${sessionScope.employee.id}"/>
                    <input type="text" id="name"
                           value="${sessionScope.employee.name}" placeholder="请输入员工姓名" style="height:39px;font-size: 18px;" size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error1" class="error"></span></nobr>
                </div>
            </div>
            <div style="margin-top: 50px">
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">身份证号：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="idCardNumber" placeholder="请输入员工身份证号"
                           value="${sessionScope.employee.idCardNumber}"style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error2" class="error"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">联系电话：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="phone" placeholder="请输入员工联系电话"
                           value="${sessionScope.employee.phone}"style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error3" class="error"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">联系地址：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="address" placeholder="请输入员工联系地址"
                           value="${sessionScope.employee.address}"style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error4" class="error"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">紧急联系人：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="linkedName" placeholder="请输入员工紧急联系人"
                           value="${sessionScope.employee.linkedName}"style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error5" class="error"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">紧急联系人电话：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="linkedPhone" placeholder="请输入紧急联系人电话"
                           value="${sessionScope.employee.linkedPhone}"style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error6" class="error"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">紧急联系人地址：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="linkedAddress" placeholder="请输入紧急联系人地址"
                           value="${sessionScope.employee.linkedAddress}"style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error7" class="error"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">部门：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="deptName" placeholder="请输入员工所属部门"
                           value="${sessionScope.employee.deptName}"style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error8" class="error"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">职位：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="role" placeholder="请输入员工职位"
                           value="${sessionScope.employee.role}"style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error9" class="error"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">工资：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="wages" placeholder="请输入员工工资"
                           value="${sessionScope.employee.wages}"style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error10" class="error"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">学历：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <select id="qualification" style="height: 39px;font-size: 18px">
                        <option value="0">请选择员工学历</option>
                        <option value="1">本科及以上</option>
                        <option value="2">大专</option>
                        <option value="3">高中及以下</option>
                    </select>
                    <nobr><span style="font-size: 18px;color:red" id="error11" class="error"></span></nobr>
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
        $('#error8').html("");
        $('#error9').html("");
        $('#error10').html("");
        $('#error11').html("");
        $('#error12').html("");
        var id = $('#id').val();
        var name = $('#name').val();
        var idCardNumber = $('#idCardNumber').val();
        var phone = $('#phone').val();
        var address = $('#address').val();
        var linkedName = $('#linkedName').val();
        var linkedPhone = $('#linkedPhone').val();
        var linkedAddress = $('#linkedAddress').val();
        var deptName = $('#deptName').val();
        var role = $('#role').val();
        var wages = $('#wages').val();
        var qualification = $('#qualification').val();
        if(name=="" || name==null){
            $('#error1').html("请输入员工姓名");
            return;
        }
        if(idCardNumber=="" || idCardNumber==null){
            $('#error2').html("请输入员工身份证号");
            return;
        }
        if(phone=="" || phone==null){
            $('#error3').html("请输入员工联系电话");
            return;
        }
        if(address=="" || address==null){
            $('#error4').html("请输入员工联系地址");
            return;
        }
        if(linkedName=="" || linkedName==null){
            $('#error5').html("请输入员工紧急联系人");
            return;
        }
        if(linkedPhone=="" || linkedPhone==null){
            $('#error6').html("请输入紧急联系人电话");
            return;
        }
        if(linkedAddress=="" || linkedAddress==null){
            $('#error7').html("请输入紧急联系人地址");
            return;
        }
        if(deptName=="" || deptName==null){
            $('#error8').html("请输入员工所属部门");
            return;
        }
        if(role=="" || role==null){
            $('#error9').html("请输入员工职位");
            return;
        }
        if(wages=="" || wages==null){
            $('#error10').html("请输入员工工资");
            return;
        }
        if(qualification=="" || qualification==null){
            $('#error11').html("请选择员工学历");
            return;
        }
        $.ajax({
            url:"employee/update",
            data:{"id":id,"name":name,"idCardNumber":idCardNumber,"phone":phone,"address":address,
                "linkedName":linkedName,"linkedPhone":linkedPhone,"linkedAddress":linkedAddress,
                "deptName":deptName,"wages":wages,"qualification":qualification,"role":role
            },
            type:"post",
            dataType:"json",
            success:function(data){
                if(data.result){
                    alert("修改员工信息成功！");
                    $('#pageload').load("employeeList");
                }else{
                    alert("修改员工信息失败！");
                    return;
                }
            }
        })
    }

    function notDo(){
        $("#pageload").load("emploeeList");
    }

    $(function(){
        $("#qualification").val('${sessionScope.employee.qualification}');
    })
</script>
</html>
