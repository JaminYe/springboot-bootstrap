//修改前回显
function edit(data) {
    location.href = "/userUpload?userId=" + data;
}


//删除
function del(userId) {
    $.ajax({
        url: '/userDelete',
        data: {"userId": userId},
        dataType: 'json',
        type: 'post',
        success: function (data) {
            if (data > 0) {
                alert("删除成功");
                location.href = "/getUserPage2";
            } else {
                alert("删除失败")
            }
        }


    })
}

function toAddUser() {
    location.href = "/toAddUser";
}


function updateSubmit() {
    var formData = new FormData();
    formData.append("userId", $("#userId").val());
    formData.append("userName", $("#userName").val());
    formData.append("userPassword", $("#userPassword").val());
    formData.append("userAccount", $("#userAccount").val());
    formData.append("userEmail", $("#userEmail").val());
    formData.append("userTel", $("#userTel").val());
    $.ajax({
        url: '/userUpdate',
        dataType: 'json',
        data: formData,
        type: 'post',
        processData: false,
        contentType: false,
        success: function (data) {
            if (data > 0) {
                alert("修改成功");
                location.href = "getUserPage2";
            } else {
                alert("修改失败");
            }
        }


    });

}
