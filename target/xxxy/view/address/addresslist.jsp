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
        <li>充电桩管理</li>
        <li class="active">地址管理</li>
    </ul>
</div>
<p>${info}</p>
<form class="form-inline" action="${pageContext.request.contextPath }/address/list.action">
    <div  style="margin: 0px; padding: 6px;">
        <div class="row alert alert-info " style="background-color: #fafafa" >
            <div class="form-group">
                <label >地址编号：</label>
                <input type="text" name="areaid" id="activename">
            </div>
            <div class="form-group">
                <label >地址：</label>
                <input type="text" name="address" >
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-info btn-sm" style="margin-left:30px"value="查询" />
                <a href="${pageContext.request.contextPath }/view/address/addressadd.jsp" class="btn btn-info btn-sm">添加</a>
            </div>
        </div>
    </div>
</form>
<div class="row alert alert-info " style="background-color: #fafafa" >
    <display:table class="table table-condensed table-striped" id="address" name="address_list" pagesize="5"  export="true"  requestURI="${pageContext.request.contextPath }/address/list.action">
        <display:column title="编号"><cout:out value="${address_rowNum}"/></display:column>
        <display:column property="areaid" title="地址编号"></display:column>
        <display:column property="address" title="地址"></display:column>
        <display:column property="longitude" title="经度"></display:column>
        <display:column property="latitude" title="纬度"  ></display:column>
        <display:column href="${pageContext.request.contextPath }/address/load.action" paramId="areaid" paramProperty="areaid" value="修改" title="修改"></display:column>
        <display:column href="${pageContext.request.contextPath }/address/delete.action" paramId="areaid" paramProperty="areaid" value="删除" title="删除"></display:column>
    </display:table>
</div>
</body>
</html>