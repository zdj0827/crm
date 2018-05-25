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
    <title>添加订单</title>
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
        <h1 class="panel-title" style="color: white"><b>添加订单</b></h1>
    </div>
    <div class="panel-body">
        <div>
            <div style="margin-top: 50px">
                <div style="width: 45%;float: left;text-align: right;">
                    <h4 style="border-right: 20px">客户名：</h4></div>
                <div style="width: 55%;float: left;text-align: left;">
                    <input type="text" id="customerName" placeholder="请输入客户名" style="height:39px;font-size: 18px;" size="20"/>
                    <input type="hidden" id="customerId"/>
                    <nobr><span style="font-size: 18px;color:red" id="error1"></span></nobr>
                </div>
            </div>
            <div style="margin-top: 50px">
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">订单名：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="title" placeholder="请输入订单名" style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error2"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">订单内容：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="content" placeholder="请输入订单内容" style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error3"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">订单价格：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <input type="text" id="totals" placeholder="请输入订单总价" style="height:39px;font-size: 18px;"size="20"/>
                    <nobr><span style="font-size: 18px;color:red" id="error4"></span></nobr>
                </div>
                <div style="width: 45%;float: left;text-align: right;margin-top: 40px">
                    <h4 style="border-right: 20px">订单状态：</h4>
                </div>
                <div style="width: 55%;float: left;text-align: left;margin-top: 40px">
                    <select id="status" style="height: 39px;font-size: 18px">
                        <option value="0">请选择订单状态</option>
                        <option value="1">已支付</option>
                        <option value="2">未支付</option>
                        <option value="3">取消</option>
                    </select>
                    <nobr><span style="font-size: 18px;color:red" id="error5" class="error"></span></nobr>
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
<script type="text/javascript">
    function add(){
        $('#error1').html("");
        $('#error2').html("");
        $('#error3').html("");
        $('#error4').html("");
        $('#error5').html("");
        var customerName = $('#customerName').val();
        var title = $('#title').val();
        var content = $('#content').val();
        var totals = $('#totals').val();
        var status = $('#status').val();
        if(customerName=="" || customerName==null){
            $('#error1').html("请输入客户名");
            return;
        }
        if(title=="" || title==null){
            $('#error2').html("请输入订单名");
            return;
        }
        if(content=="" || content==null){
            $('#error3').html("请输入订单内容");
            return;
        }
        if(totals==0 || totals==null){
            $('#error4').html("请输入订单总价");
            return;
        }
        if(status==0 || status==null){
            $('#error5').html("请选择订单状态");
            return;
        }
        $.ajax({
            url:"order/add",
            data:{"customerName":customerName,"title":title,"content":content,
                "totals":totals,"status":status
            },
            type:"post",
            dataType:"json",
            success:function(data){
                if(data.result){
                    alert("添加订单成功");
                    //self.location.href = "/bysj/orderList";
                    $('#pageload').load('orderList');
                }else{
                    if(data.code==-1){
                        alert("客户不存在");
                        return;
                    }
                    alert("添加订单失败");
                    return;
                }
            }
        })
    }

    function notDo(){
        $('#error1').html("");
        $('#error2').html("");
        $('#error3').html("");
        $('#error4').html("");
        $('#error5').html("");
        var customerName = $('#customerName').val();
        var title = $('#title').val();
        var content = $('#content').val();
        var totals = $('#totals').val();
        var status = $('#status').val(0);
    }
</script>
</html>
