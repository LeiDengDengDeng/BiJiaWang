<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>登录</title>
    <link href="../style/main.css" rel="stylesheet" type="text/css" />
    <link href="../style/style.css" rel="stylesheet" type="text/css" />
    <link href="../style/material-icons.css" rel="stylesheet" type="text/css" />
    <link href="../style/font-awesome.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="../js/jquery.js"></script>
    <script type="text/javascript" src="../js/jquery-3.1.1.js"></script>
    <script type="text/javascript" src="../js/activity.js"></script>


</head>
<body>
    <div class="container" id="navigationBar" role="navigation">
    <ul class="menu">
        <img src="images/logo.png" class="login-main-logo">
    </ul>
</div>

    <div class="all-elements">

        <div class="login-holder">
            <div class="login-left">
            </div>
            <div class="login-right">
                <img class="login-logo" src="images/logo_green.png">
                <input type="text" placeholder="用户名" id="userName">
                <input type="password" placeholder="密码" id="password">
                <div class="login-under-input">
                    <input type="checkbox">
                </div>
                <button onclick="login()">登录</button>
            </div>
        </div>

        <div class="footer">
            <div class="decoration-center"></div>
            <h1>
                Copyright &copy; 2016 - 2017 爱比价网. All Rights Reserved.
            </h1>
        </div>
    </div>
<script>
    function login() {
        var userName = document.getElementById("userName");
        var password = document.getElementById("password");
        $.ajax({
            url: "/userLogin",
            type: "POST",
            data: {
                userName: userName.value,
                userPassword: password.value,
            },
            dataType: 'JSON',
            async: false,
            success: function (data) {
                alert(data);
                if(data=="管理员"){
                    window.location.href="similarWords.html";
                }else if(data=="系统管理员"){
                    window.location.href="serverView.html";
                }else if(data=="小明"){
                    window.location.href="goods.html";
                }else{
                    alert("用户信息无效！请重试！");
                }

            }
        });

    }
</script>
</body>

</html>