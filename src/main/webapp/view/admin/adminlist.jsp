<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="cout" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <head>
        <title>Title</title>
        <%@ include file="/resource/public/common.jspf" %>
    </head>
</head>
<body>
<div style="padding: 0px; margin: 0px;">
    <ul class="breadcrumb" style="margin: 5px; " >
        <li>系统管理</li>
        <li class="active">管理员列表</li>
    </ul>
</div>
<p>${info}</p>
<form class="form-inline" action="${pageContext.request.contextPath }/admin/list.action">
    <div  style="margin: 0px; padding: 6px;">
        <div class="row alert alert-info " style="background-color: #fafafa" >
            <div class="form-group">
                <label >管理员Id：</label>
                <input type="text" name="aid" id="activename">
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-info btn-sm" style="margin-left:30px"value="查询" />
                <a href="${pageContext.request.contextPath }/view/admin/adminadd.jsp" class="btn btn-info btn-sm">添加</a>
            </div>
        </div>
    </div>
</form>
<div class="row alert alert-info " style="background-color: #fafafa" >
    <display:table class="table table-condensed table-striped" id="admin" name="adminList" pagesize="5"  export="true"  requestURI="${pageContext.request.contextPath }/admin/list.action">
        <display:column property="aid" title="管理员Id"></display:column>
        <display:column property="aname" title="用户名"></display:column>
        <display:column property="adminname" title="用户姓名"></display:column>
        <display:column property="adminphone" title="电话" ></display:column>
        <display:column property="adminemail" title="邮箱"></display:column>
        <display:column property="adminmess" title="备注" ></display:column>
        <display:column href="${pageContext.request.contextPath }/admin/load.action" paramId="aid" paramProperty="aid" value="修改" title="修改"></display:column>
        <display:column href="${pageContext.request.contextPath }/admin/delete.action" paramId="aid" paramProperty="aid" value="删除" title="删除"></display:column>
    </display:table>
</div>
</body>
</html>