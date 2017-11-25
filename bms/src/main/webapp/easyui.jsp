<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="base.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<%--<table id="dg" title="My Users" class="easyui-datagrid" style="width:550px;height:250px"--%>
       <%--url="#"--%>
       <%--toolbar="#toolbar"--%>
       <%--rownumbers="true" fitColumns="true" singleSelect="true">--%>
    <%--<thead>--%>
    <%--<tr>--%>
        <%--<th field="firstname" width="50">First Name</th>--%>
        <%--<th field="lastname" width="50">Last Name</th>--%>
        <%--<th field="phone" width="50">Phone</th>--%>
        <%--<th field="email" width="50">Email</th>--%>
    <%--</tr>--%>
    <%--</thead>--%>
    <%--<tbody>--%>
    <%--<tr>--%>
        <%--<td>mick</td><td>jackson</td><td>1234</td><td>123@qq.com</td>--%>
    <%--</tr>--%>
    <%--</tbody>--%>
<%--</table>--%>
<%--<div id="toolbar">--%>
    <%--<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New User</a>--%>
    <%--<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>--%>
    <%--<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>--%>
<%--</div>--%>

<!--给div指定class属性指定easy的easyui-layout样式，这样就可以通过div创建easyui的layout -->
<%--<div class="easyui-layout"  style="width:1200px;height:800px;margin:0 auto;">--%>
<div class="easyui-layout" data-options="fit:true" style="width:500px;height:50%;margin:0 auto;">
    <!-- 布局中如果不需要north这个面板，那么可以删掉这个div -->
    <div data-options="region:'north',title:'North Title',split:true" style="height:150px;"></div>
    <!-- 布局中如果不需要south这个面板，那么可以删掉这个div -->
    <div data-options="region:'south',title:'South Title',split:true" style="height:150px;"></div>
    <!-- 布局中如果不需要east这个面板，那么可以删掉这个div -->
    <%--<div data-options="region:'east',iconCls:'icon-reload',title:'East',split:true" style="width:100px;"></div>--%>
    <!-- 布局中如果不需要west这个面板，那么可以删掉这个div -->
    <div data-options="region:'west',title:'West',split:true" style="width:250px;"></div>
    <!--north，south， east，west这几个面板都可以删掉，唯有这个center面板一定不能删掉，否则使用easyui-layout就会出错 -->
    <div data-options="region:'center',title:'center title'" style="padding:5px;"></div>
</div>

</body>
</html>