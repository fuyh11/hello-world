<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="cout" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
    <%@ include file="/resource/public/common.jspf" %>
</head>
<body>
<div style="padding: 0px; margin: 0px;">
    <ul class="breadcrumb" style="margin: 0px;">
        <li><a href="#">账户管理</a></li>
        <li>员工列表</li>
    </ul>
</div>
<form class="form-inline"  action="${pageContext.request.contextPath }/staff/list.action">
    <div  style="margin: 0px; padding: 6px;">
        <div class="row alert alert-info " style="background-color: #fafafa" >
            <div class="form-group">
                <label  for="activename">员工ID：</label>
                <input type="text" name="staffId" id="activename">
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-info btn-sm" style="margin-left:30px"value="查询" />
                <a href="${pageContext.request.contextPath }/staff/getParam.action" class="btn btn-info btn-sm">添加</a>
            </div>
        </div>
    </div>
</form>
${info}
<div class="row alert alert-info " style="background-color: #fafafa" >
    <display:table class="table table-condensed table-striped" id="staff" name="staff_list" pagesize="10"  export="true" requestURI="${pageContext.request.contextPath}/staff/list.action">
        <display:column title="编号"><cout:out value="${staff_rowNum}"/></display:column>
        <display:column property="staffId" title="ID"></display:column>
        <display:column property="staffName" title="姓名"></display:column>
        <display:column property="staffSex" title="性别"></display:column>
        <display:column property="staffIdcard" title="身份证"></display:column>
        <display:column property="staffPhone" title="电话"></display:column>
        <display:column property="staffAreaid" title="区域编号"></display:column>
        <display:column property="staffNativePlace" title="出生地"></display:column>
        <display:column property="birthday_str" title="生日"></display:column>
        <display:column property="entryTime_str" title="加入时间"></display:column>
        <display:column property="staffEducationLevel" title="教育水平"></display:column>
        <display:column href="${pageContext.request.contextPath }/staff/load.action" paramId="staffId" paramProperty="staffId" value="修改" title="修改"></display:column>
        <display:column href="${pageContext.request.contextPath }/staff/delete.action" paramId="staffId" paramProperty="staffId" value="删除" title="删除"></display:column>
    </display:table>
</div>
</body>
</html>
