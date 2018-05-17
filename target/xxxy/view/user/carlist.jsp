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
<body>
<div style="padding: 0px; margin: 0px;">
    <ul class="breadcrumb" style="margin: 0px;">
        <li><a href="#">会员管理</a></li>
        <li>汽车列表</li>
    </ul>
</div>
<p>${info}</p>
<form class="form-inline" action="${pageContext.request.contextPath }/user/carlist.action">
    <div  style="margin: 0px; padding: 6px;">
        <div class="row alert alert-info " style="background-color: #fafafa" >
        <div class="form-group">
            <label  for="activename">车牌号：</label>
            <input type="text" name="carId" id="activename">
        </div>
         <div class="form-group">
            <input type="submit" class="btn btn-info btn-sm" style="margin-left:30px"value="查询" />
         </div>
         </div>
        
    </div>
</form>
<div class="row alert alert-info " style="background-color: #fafafa" >
<display:table class="table table-condensed table-striped" id="car" name="carList" pagesize="5"  export="true" requestURI="${pageContext.request.contextPath }/user/carlist.action">
    <display:column title="编号"><cout:out value="${car_rowNum}"/></display:column>
    <display:column property="carId" title="车牌号"></display:column>
    <display:column property="carPhone" title="用户电话" href="${pageContext.request.contextPath }/user/show.action" paramId="carPhone" paramProperty="carPhone" ></display:column>
    <display:column property="carOwner" title="用户姓名"></display:column>
    <display:column property="carState_str" title="汽车状态"></display:column>
</display:table>
</div>
</body>
</html>
