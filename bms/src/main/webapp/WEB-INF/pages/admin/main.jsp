<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script src="/jquery-easyui-1.4.1/jquery.min.js"></script>
    <script type="text/javascript">
        function userManage() {
            alert("hello");
            $.ajax({
                url:"/admin/"
            });
        }
    </script>
</head>
<body>
    <p>hello, ${sessionScope.user.userName}</p>
    <p>unit管理</p>
    <p id="userManage" onclick="userManage()">用户管理</p>
    <div id="content">

    </div>
</body>
</html>