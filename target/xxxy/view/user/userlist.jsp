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
        <li>会员管理</li>
        <li class="active">会员列表</li>
    </ul>
</div>
<p>${info}</p>
<form class="form-inline" action="${pageContext.request.contextPath }/user/list.action">
    <div  style="margin: 0px; padding: 6px;">
        <div class="row alert alert-info " style="background-color: #fafafa" >
            <div class="form-group">
                <label >会员电话：</label>
                <input type="text" name="userPhone" id="activename">
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-info btn-sm" style="margin-left:30px"value="查询" />
                <a href="${pageContext.request.contextPath }/view/user/useradd.jsp" class="btn btn-info btn-sm">添加</a>
            </div>
        </div>
    </div>
</form>
<div class="row alert alert-info " style="background-color: #fafafa" >
    <display:table class="table table-condensed table-striped" id="user" name="userList" pagesize="5"  export="true" requestURI="${pageContext.request.contextPath }/user/list.action">
        <display:column property="userPhone" title="电话" href="${pageContext.request.contextPath }/user/show.action" paramId="userPhone" paramProperty="userPhone"></display:column>
        <display:column property="userId" title="身份证"></display:column>
        <display:column property="userName" title="姓名"></display:column>
        <display:column property="userVip" title="会员"></display:column>
        <display:column property="userBalance" title="余额"></display:column>
        <display:column property="userAuthen" title="认证" ></display:column>
        <display:column property="userLock" title="状态" ></display:column>
        <display:column href="${pageContext.request.contextPath }/user/load.action" paramId="userPhone" paramProperty="userPhone" value="修改" title="修改"></display:column>
        <display:column href="${pageContext.request.contextPath }/user/delete.action" paramId="userPhone" paramProperty="userPhone" value="删除" title="删除"></display:column>
    </display:table>
</div>
</body>
</html>
