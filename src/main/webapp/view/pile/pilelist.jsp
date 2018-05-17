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
        <li><a href="#">设备管理</a></li>
        <li>设备基本信息</li>
    </ul>
</div>
<p>${info}</p>
<form class="form-inline" action="${pageContext.request.contextPath }/pile/list.action">
    <div  style="margin: 0px; padding: 6px;">
        <div class="row alert alert-info " style="background-color: #fafafa" >
        <div class="form-group">
            <label  for="activename">充电桩ID：</label>
            <input type="text" name="pileId" id="activename">
        </div>
        <div class="form-group">
                <label >地址编号：</label>
                <input type="text" name="pileAreaid" >
       </div>
        <div class="form-group">
            <label >充电桩地址：</label>
            <input type="text" name="pileAddress" >
        </div>
         <div class="form-group">
            <input type="submit" class="btn btn-info btn-sm" style="margin-left:30px"value="查询" />
            <a href="${pageContext.request.contextPath }/pile/getParam.action" class="btn btn-info btn-sm">添加</a>
         </div>
         </div>
        <div>
</div>
    </div>
</form>
<div class="row alert alert-info " style="background-color: #fafafa" >
<display:table class="table table-condensed table-striped" id="pile" name="pile_list" pagesize="10"  export="true" requestURI="${pageContext.request.contextPath }/pile/list.action">
    <display:column title="编号"><cout:out value="${pile_rowNum}"/></display:column>
    <display:column property="pileId" title="ID" href="${pageContext.request.contextPath }/pile/show.action" paramId="pileId" paramProperty="pileId"></display:column>
    <display:column property="pileAreaid" title="区域编号"></display:column>
    <display:column property="pileAddress" title="地址"></display:column>
    <display:column property="pileLongitude" title="经度"></display:column>
    <display:column property="pileLatitude" title="纬度"></display:column>
    <display:column property="pileStaffid" title="员工编号"></display:column>
    <display:column property="pileStaffname" title="员工姓名"></display:column>
    <display:column property="statestr" title="状态"></display:column>
    <display:column property="usestatestr" title="使用情况"></display:column>
    <display:column href="${pageContext.request.contextPath }/pile/load.action" paramId="pileId" paramProperty="pileId" value="修改" title="修改"></display:column>
    <display:column href="${pageContext.request.contextPath }/pile/delete.action" paramId="pileId" paramProperty="pileId" value="删除" title="删除"></display:column>
    <display:setProperty name="export.excel" value="true" />
    <display:setProperty name="export.excel.filename" value="export.xls" />
</display:table>
</div>
</body>
</html>
