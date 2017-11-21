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
            debugger;
            var userName = $("#userName").val();
            var psd = $("#psd").val();
            var confirmPsd = $("#confirmPsd").val();
            if(psd==confirmPsd) {
                $.ajax({
                    url:"/register",
                    type:"POST",
                    data:{
                        "userName":userName,
                        "password":psd,
                    },
                    success:function (result) {
                        debugger;
                        if(JSON.parse(result).success){
                            alert("true");
                            var req = "http://" + window.location.host + "/toMain";
                            window.location.replace(req);
                        }else{
                            alert("server error");
                        }
                    }
                });
            }else {
                alert("password inconsistency");
            }
        }
    </script>
</head>
<body>

<%--<form>--%>
    <table>
        <tr>  <td>用户名：</td>  <td><input type="text" id="userName" name="userName" /></td> </tr>
        <tr>  <td>密码：</td>    <td><input type="password" id="psd"  name="password"></td></tr>
        <tr>  <td>确认密码</td>  <td><input type="password" id="confirmPsd" name="confirmPassword"></td></tr>
        <tr>  <td><button id="button1" onclick="register()">register</button></td>
    </table>
<%--</form>--%>


</body>
</html>