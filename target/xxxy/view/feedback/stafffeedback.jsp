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
        <li>反馈信息</li>
        <li>员工反馈列表</li>
    </ul>
</div>
<p>${info}</p>
<form class="form-inline" action="${pageContext.request.contextPath }/feedback/stafflist.action">
    <div  style="margin: 0px; padding: 6px;">
        <div class="row alert alert-info " style="background-color: #fafafa" >
            <div class="form-group">
                <label >员工ID：</label>
                <input type="text" name="staffId" id="activename">
            </div>
            <div class="form-group">
                <label >充电桩ID：</label>
                <input type="text" name="pileId" >
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-info btn-sm" style="margin-left:30px"value="查询" />
            </div>
        </div>
    </div>
</form>
<div class="row alert alert-info " style="background-color: #fafafa" >
    <display:table class="table table-condensed table-striped" id="staff" name="sf_list" pagesize="10"   requestURI="${pageContext.request.contextPath }/feedback/list.action">
        <display:column title="编号" ><cout:out value="${staff_rowNum}"/></display:column>
        <display:column property="staffId" title="员工ID"></display:column>
        <display:column property="adminId" title="管理员ID"></display:column>
        <display:column property="pileId" title="充电桩ID" href="${pageContext.request.contextPath }/pile/show.action" paramId="pileId" paramProperty="pileId"></display:column>
        <display:column property="feedbackInfo" title="反馈信息"></display:column>
        <display:column property="feedbackTime" title="反馈时间" ></display:column>
        <display:column property="feedbackResult" title="处理情况"></display:column>
        <display:column href="${pageContext.request.contextPath }/feedback/sfload.action" paramId="feedbackId" paramProperty="feedbackId" value="修改" title="修改"></display:column>
        <display:column href="${pageContext.request.contextPath }/feedback/sfdelete.action" paramId="feedbackId" paramProperty="feedbackId" value="删除" title="删除"></display:column>
    </display:table>
</div>
</body>
</html>
