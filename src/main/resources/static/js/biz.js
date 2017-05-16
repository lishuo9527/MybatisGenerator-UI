function addTable() {
    var table = '<div class="column">'
        + '<div class="col-md-4" >'
        + '<label>表名称</label>'
        + '<input type="text" class="form-control" name="tablenames" placeholder="Enter test_table">'
        + '</div>'
        + '<div class="col-md-4" >'
        + '<label>模型名称</label>'
        + '<input type="text" class="form-control" name="tablemodels" placeholder="Enter TestTable">'
        + '</div>'
        + '<div class="col-md-4" >'
        + '<button type="button" class="btn btn-primary" onclick="addTable()" style="margin-top: 25px">添加表</button>'
        + '<button type="button" class="btn btn-danger" onclick="rmTable(this)" style="margin-top: 25px">删除</button>'
        + '</div>'
        + '</div>';

    $('#tables').append(table);
}

function rmTable(table) {
    var length = $('#tables').children().length;
    if (length > 1) {
        $(table).parent().parent().remove();
    } else {
        alert("table不得少于一个！！")
    }

}

function gen() {
    var inputs = document.getElementsByTagName("input");
    for (var i = 0; i < inputs.length; i++) {
        if (inputs[i].value == "" || inputs[i].value == null) {
            alert("信息输入不全");
            return false;
        }
    }

    $.ajax({
        type: 'post',
        url: '/gen',
        dataType: 'text',
        data: $('#mbg').serialize(),
        success: function (data) {
            window.open('result/mbg.zip')

        },

    });
}
