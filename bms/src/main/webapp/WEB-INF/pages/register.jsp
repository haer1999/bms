<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script src="http://libs.baidu.com/jquery/2.1.1/jquery.min.js"></script>
    <script>
        function register() {
            window.location.href = "/register";
        }
    </script>
</head>
<body>

<form>
    <table>
        <tr>  <td>用户名：</td>  <td><input type="text"  name="userName" /></td> </tr>
        <tr>  <td>密码：</td>    <td><input type="password"  name="password"></td></tr>
        <tr>  <td>确认密码</td>  <td><input type="password"  name="password"></td></tr>
        <tr>  <td><button id="button1" onclick="register()">register</button></td>
    </table>
</form>


</body>
</html>