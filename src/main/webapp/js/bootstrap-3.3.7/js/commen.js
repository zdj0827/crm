var cpic = {

// 得到承保年龄列表
   getAge: function(){
    $.ajax({
        url:'age',
        data:{"cid":$('#cid').val()},
        success:function (data) {
            console.log(data);
            for(var i=0;i<data.length;i++){
                var $op=$("<option value="+data[i].age+">"+data[i].age+"</option>")
                $("#insAge").append($op);
            }
        }
    })
},

// 得到保单期限列表
    getTime:function () {
    $.ajax({
        url:'time',
        data:{"cid":$('#cid').val()},
        success:function (data) {
            console.log(data);
            for(var i=0;i<data.length;i++){
                var $op=$("<option value="+data[i].time+">"+data[i].time+"</option>")
                $("#insTime").append($op);
            }
        }
    })
},

// 得到保单内容列表
    getContent:function () {
    $.ajax({
        url:'content',
        data:{"cid":$('#cid').val()},
        success:function (data) {
            console.log(data);
            for(var i=0;i<data.length;i++){
                var $op=$("<option value="+data[i].content+">"+data[i].content+"</option>")
                $("#insContent").append($op);
            }
        }
    })
},

// 得到保单特色列表
    getCharacter:function () {
    $.ajax({
        url:'character',
        data:{"cid":$('#cid').val()},
        success:function (data) {
            console.log(data);
            for(var i=0;i<data.length;i++){
                var $op=$("<option value="+data[i].chara+">"+data[i].chara+"</option>")
                $("#insCharacter").append($op);
            }
        }
    })
},

// 得到分类列表
    searchCategory:function (){
    $.ajax({
        url:'categoryList',
        success:function (data) {
            console.log(data);
            for(var i=0;i<data.length;i++){
                var $op=$("<option value="+data[i].cid+">"+data[i].cName+"</option>")
                $("#cid").append($op);
            }
        }
    });
},
};