<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script src="http://libs.baidu.com/jquery/2.1.1/jquery.min.js"></script>
    <script>
        function login() {
            $("#form1").submit();
        }
    </script>
</head>
<button onclick="getVerifyCode()">发送验证码</button><br>

<form id="form1" action="/login" method="post">
用户:<input type="text"  name="userName" />
密码:<input type="password"  name="password">
     <button id="button1" onclick="login()">login</button>
</form>
</body>
</html>