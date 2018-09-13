<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link type="text/css" rel="stylesheet" href="static/css/yyz.css">
    <link rel="stylesheet" href="static/js/layui/css/layui.css">
</head>
<body>
    <div class="login_main">
        账号:<input id="use_use" placeholder="请输入账号"/>
        密码:<input id="use_password" placeholder="请输入密码"/>
        <input type="button" value="登录" onclick="login()"></input>
        <input type="button"  value="注册"></input>
    </div>
</body>
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="static/js/layui/layui.all.js"></script>
<script src="../static/js/jsall.js"></script>

<script>
function login() {
    var use_use = $("#use_use").val();
    var use_password = $("#use_password").val();
    $.ajax({
        url: url + "user/login",
        data: "use_use=" + use_use + "&use_password=" + use_password,
        dataType: "json",
        type: "post",
        success: function (data) {
            if (data.code == "200") {
                if(data.data!=null){
                    window.location.href = url + "index";
                }
            }else {
                layer.alert(data.msg);
            }
        }
    })
}
</script>
</html>