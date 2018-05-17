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
        <li>订单管理</li>
        <li class="active">充值记录</li>
    </ul>
</div>
<p>${info}</p>
<form class="form-inline" action="${pageContext.request.contextPath }/order/chargelist.action">
    <div  style="margin: 0px; padding: 6px;">
        <div class="row alert alert-info " style="background-color: #fafafa" >
            <div class="form-group">
                <label >用户电话：</label>
                <input type="text" name=" UserPhone" id="activename" >
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-info btn-sm" style="margin-left:30px"value="查询" />
            </div>
        </div>
    </div>
</form>
<div class="row alert alert-info " style="background-color: #fafafa" >
    <display:table class="table table-condensed table-striped" id="charge" name="charge_list" pagesize="10"  export="true" requestURI="${pageContext.request.contextPath }/order/chargelist.action">
        <display:column title="编号"><cout:out value="${charge_rowNum}"/></display:column>
        <display:column property="userPhone" title="用户电话" href="${pageContext.request.contextPath }/user/show.action" paramId="userPhone" paramProperty="userPhone"></display:column>
        <display:column property="chargeMoney" title="充值金额" ></display:column>
        <display:column property="userBalance" title="用户余额"></display:column>
        <display:column property="chargedate_str" title="充值日期" sortable="true" headerClass="sortable"></display:column>
        <display:column property="chargeMethod" title="充值方式" ></display:column>
    </display:table>
</div>
</body>
</html>
