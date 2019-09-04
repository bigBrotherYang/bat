<!DOCTYPE html>
<html lang="en">
<#assign base=request.contextPath />
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <form action="${base}/login/checkLogin" method="post" >
        <input type="text" name="username">
        <input type="password" name="userpwd">
        <input type="submit" value="提交">
        <span colro="red">${msg!}</span>
    </form>

</body>
</html>