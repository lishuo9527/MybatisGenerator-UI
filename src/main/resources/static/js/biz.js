function addTable() {
    var table = `<div class="column">
        <div class="col-md-4" >
        <label>表名称</label>
        <input type="text" class="form-control"  name="tablenames" placeholder="Enter test_table">
        </div>
        <div class="col-md-4" >
        <label>模型名称</label>
        <input type="text" class="form-control"  name="tablemodels" placeholder="Enter TestTable">
        </div>
        <div class="col-md-4" >
        <button type="button" class="btn btn-primary" onclick="addTable()" style="margin-top: 25px">添加表</button>
        <button type="button" class="btn btn-danger" onclick="rmTable(this)" style="margin-top: 25px">删除</button>
        </div>
        </div>`;

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
    // var inputs = document.getElementsByTagName("input");
    // for (var i = 0; i < inputs.length; i++) {
    //     if (inputs[i].value == "" || inputs[i].value == null) {
    //         alert("信息输入不全");
    //         return false;
    //     }
    // }

    $('input').each(function (i) {
        var text = $(this).val();
        if (text == "") {
            alert("信息输入不全");
            return false;
        }
    });

    $.ajax({
        type: 'post',
        url: '/gen',
        dataType: 'json',
        timeout: 3000, //超时时间设置，单位毫秒
        data: $('#mbg').serialize(),
        success: function (data) {
            if (data.code == "00") {
                window.open('result/mbg.zip')
            } else if (data.code == "01") {
                alert("01: 数据库连接异常! ");
            }
        },
        error: function (data) {
            alert("请检查配置信息是否有误!");
        }

    });
}

function saveConf() {
    var data = JSON.stringify($('#mbg').serialize());
    var key = $('#confname').val();

    localStorage.setItem(key, data);
    location.reload();
}

function readConf() {
//      <li><a href="#"><i class="fa fa-circle-o"></i>Conf 1</a></li>
    var storage = window.localStorage;
    var menu = '';
    for (var i = 0, len = storage.length; i < len; i++) {
        var key = storage.key(i);
        menu += '<li><a href="#" onclick="writeconf(this)"><i class="fa fa-circle-o"></i>' + key + '</a></li>';
    }
    $('#menu').append(menu);
}

function writeconf(ob) {
    var index = $(ob).index();
    var key = $(ob).eq(index).text();
    var value = localStorage.getItem(key);
    value = value.replace('"', '');
    var arrys = value.split('&');
    for (var i = 0, l = arrys.length; i < l; i++) {
        var tmp = arrys[i].split('=');
        if (tmp[0] == "tablemodels" || tmp[0] == "tablenames") {
            continue;
        }
        $('#' + tmp[0]).val(tmp[1]);
    }
}

function clearconf() {

    localStorage.clear();
    alert("清除成功!");
    location.reload();
}
