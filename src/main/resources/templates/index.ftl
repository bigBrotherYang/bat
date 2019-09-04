<!DOCTYPE html>
<html lang="en">
<#assign base=request.contextPath />
<head>
    <meta charset="UTF-8"/>
    <title>首页</title>
    <script src="jquery-3.4.1.min.js"></script>
</head>
<body>


欢迎[<@shiro.principal/>]登录，<a href="#">退出</a>


    <a href="javascript:checklogin('userMsg/add')">add</a>

<@shiro.hasPermission name="user:del">
<a href="javascript:checklogin('userMsg/del')">del</a>
</@shiro.hasPermission>
<a href="javascript:checklogin('userMsg/upd')">upd</a>

<a href="javascript:checklogin('userMsg/query')">query</a>
<script type="text/javascript">

    function checklogin(url) {
        alert(123);
        debugger
        $.ajax({
            url: "${base}/" + url,
            dataType: "json",
            type: "post",
            success: function (data) {
                console.log(data);
            }
        })
    }
</script>
</body>
</html>