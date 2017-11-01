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
            var userName = $("#userName").val();
            var password = $("#password").val();
            $.ajax({
                url:"/login",
                type:"post",
                data:{
                    "userName":userName,
                    "password":password,
                },
                success:function (result) {
                    if(JSON.parse(result).success){
                        window.location.href = "/toMain";
                    }else{
                        alert("User name or password is wrong");
                    }
                }
            });
        }
        function toRegister() {
            window.location.href = "/toRegister";
        }
    </script>
</head>
<button onclick="getVerifyCode()">发送验证码</button><br>

    <table>
        <tr> <td>用户:</td> <td><input type="text"  id="userName" name="userName" /></td> </tr>
        <tr> <td>密码:</td> <td><input type="password" id="password" name="password"></td> </tr>
        <tr> <td><button id="button1" type="button" onclick="login()">login</button></td>
             <td><button id="button2" type="button" onclick="toRegister()">register</button></td> </tr>
    </table>

</body>
</html>