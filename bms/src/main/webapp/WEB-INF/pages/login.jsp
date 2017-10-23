<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script src="http://libs.baidu.com/jquery/2.1.1/jquery.min.js"></script>
    <script>
        var ipPort = "";
        function getVerifyCode() {
            $.ajax({
                url:ipPort + "nlost/ajax.html?" + "svc=core/getVerifyCode",
                type:"POST",
                data:{
                    params:"{\"email\":\"chenxiangming@gigaiot.com\", \"userName\":\"xiao44\"}"
                },
            });
        }
    </script>
</head>
<body>

<button onclick="getVerifyCode()">login</button>

</body>
</html>