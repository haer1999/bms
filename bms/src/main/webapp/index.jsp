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
        function toRegister() {
            window.location.href = "/toRegister";
        }
    </script>
</head>
<button onclick="getVerifyCode()">发送验证码</button><br>

<form id="form1" action="/login" method="post">
    <table>
        <tr> <td>用户:</td> <td><input type="text"  name="userName" /></td> </tr>
        <tr> <td>密码:</td> <td><input type="password"  name="password"></td> </tr>
        <tr> <td><button id="button1" type="button" onclick="login()">login</button></td>
             <td><button id="button2" type="button" onclick="toRegister()">register</button></td> </tr>
    </table>

</form>
</body>
</html>