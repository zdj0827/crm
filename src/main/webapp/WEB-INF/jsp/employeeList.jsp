<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/6
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <title>员工列表</title>
<%--<link href="css/bootstrap-table.min.css" rel="stylesheet"/>
<link href="css/bootstrap.css" rel="stylesheet"/>--%>

<div id="toolbar" class="btn-group">

    <form  id="search_cus">
        <div class="panel-body search_box" >
            员工名<input type="text" id="name" name="name" >
            工号 <input type="text"  id="jobNumber" name="jobNumber" >
            <input type="button"  value="搜索" onclick="serachCus()"/>
        </div>

    </form>

    <button id="btn_add" type="button" class="btn btn-default" onclick="addVideoShow();">
        <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
    </button>
    <button id="btn_edit" type="button" class="btn btn-default" onclick="editMemberInfoShow();">
        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>选择修改
    </button>
    <button id="btn_delete" type="button" class="btn btn-default" onclick="delMemberVideo();">
        <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>选择删除
    </button>
</div>
</div>
<table id="customerListDg"></table>


<script src="js/jquery-3.1.1.js"></script>
<script src="js/bootstrap-3.3.7/js/bootstrap.js"/>
<script src="js/bootstrap-3.3.7/js/bootstrap-table.js"></script>
<script src="js/bootstrap-3.3.7/js/bootstrap-table-zh-CN.js"></script>

<script>
    //新增
    function addVideoShow() {
        $("#pageload").load('addEmployeePage');
        $('#toolbar').hide();
    }
    //修改
    function editMemberInfoShow() {
        var rows = $("#customerListDg").bootstrapTable('getSelections');
        if(rows.length==0){
            alert("请选择要修改的员工！");
            return;
        }
        if(rows.length>1){
            alert("无法同时修改多个员工！");
            return;
        }
        $("#pageload").load('updateEmployeePage/'+rows[0].id);
        $('#toolbar').hide();
    }
    //批量删除
    function delMemberVideo() {
        //获取所有被选中的记录
        var rows = $("#customerListDg").bootstrapTable('getSelections');
        if (rows.length== 0) {
            alert("请先选择要删除的记录!");
            return;
        }
        var msg = "您真的确定要删除吗？";
        if(confirm(msg)==true){

            var ids=[];
            for(var i=0;i<rows.length;i++){
                ids.push(rows[i].cusId)
            }
            $.ajax({
                url: "employee/delete",
                type: "post",
                data: {
                    ids: ids
                },
                success: function (data) {
                    //alert(data.msg);
                    //重新加载记录
                    //重新加载数据
                    $("#customerListDg").bootstrapTable('refresh', {url: 'employee/allEmployees'});
                }
            });
        }
    }
    //查询分页
    function serachCus() {
        $("#customerListDg").bootstrapTable('refresh');
    }

    $(function () {
        $('#customerListDg').bootstrapTable({
            toolbar : "#toolbar",
            contentType: "application/x-www-form-urlencoded",
            method: 'post',
            striped: true,      //是否显示行间隔色--%>
            cache: false,      //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）--%>
            pagination: true,     //是否显示分页（*）--%>
            pageNumber:1,      //初始化加载第一页，默认第一页--%>
            pageSize: 5,      //每页的记录行数（*）--%>
            smartDisplay:false,
            pageList:[5,10,20,30],  //可供选择的每页的行数（*）--%>
            url: "employee/allEmployees",//这个接口需要处理bootstrap table传递的固定参数--%>
            //queryParamsType:'', //默认值为 'limit' ,在默认情况下 传给服务端的参数为：offset,limit,sort--%>
                                <%--// 设置为 ''  在这种情况下传给服务器的参数为：pageSize,pageNumber--%>

            queryParams: queryParams,//前端调用服务时，会默认传递上边提到的参数，如果需要添加自定义参数，可以自定义一个函数返回请求参数--%>
            sidePagination: "server",   //分页方式：client客户端分页，server服务端分页（*）--%>
            //search: true,      //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大--%>
            strictSearch: true,
            //showColumns: true,     //是否显示所有的列
           // showRefresh: true,     //是否显示刷新按钮
            minimumCountColumns: 2,    //最少允许的列数
            clickToSelect: true,    //是否启用点击选中行
            searchOnEnterKey: true,

            columns: [
                {field:'ck',checkbox:true},
                {
               field: 'id',
               title: '员工编号',
                align: 'center'
            }, {
                field: 'name',
                title: '员工姓名',
                align: 'center'
            },{
                field: 'jobNumber',
                title: '员工工号',
                align: 'center'
            }, {
                field: 'idCardNumber',
                title: '员工身份证号',
                align: 'center'
            }, {
                field: 'qualification',
                title: '员工学历',
                align: 'center',
                formatter:function (v) {
                    switch (v){
                        case 1:return '本科及以上';break;
                        case 2:return '大专';break;
                        case 3:return '高中';break;
                        case 4:return '高中以下';break;
                    }
                }
            },{
                field: 'phone',
                title: '员工手机号',
                align: 'center'
            },{
                field: 'address',
                title: '员工联系地址',
                align: 'center'
            },{
                field: 'deptName',
                title: '员工部门',
                align: 'center'
            },{
                field: 'role',
                title: '员工职位',
                align: 'center'
            },{
                field: 'wages',
                title: '员工工资',
                align: 'center',
                formatter:function(v){
                   return v.toFixed(2);
                }
            }],
        });
    });
    function queryParams (params) {
        var temp = {  //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            pageSize: params.limit,  //页面大小
            pageNumber: params.pageNumber, //页码
            name: $("#name").val(),
            jobNumber:$("#jobNumber").val(),
        };
        return temp;
    };
</script>
