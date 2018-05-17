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
        <li class="active">订单列表</li>
    </ul>
</div>
<p>${info}</p>
<form class="form-inline" action="${pageContext.request.contextPath }/order/list.action">
    <div  style="margin: 0px; padding: 6px;">
        <div class="row alert alert-info " style="background-color: #fafafa" >
            <div class="form-group">
                <label >充电桩ID：</label>
                <input type="text" name="pileId" id="activename">
            </div>
            <div class="form-group">
                <label >用户电话：</label>
                <input type="text" name="orderPhone" >
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-info btn-sm" style="margin-left:30px"value="查询" />
            </div>
        </div>
    </div>
</form>
<div class="row alert alert-info " style="background-color: #fafafa" >
    <display:table class="table table-condensed table-striped" decorator="org.displaytag.decorator.TotalTableDecorator" id="order" name="order_list" pagesize="10"  export="true"  requestURI="${pageContext.request.contextPath }/order/list.action">
        <display:column title="编号"><cout:out value="${order_rowNum}"/></display:column>
        <display:column property="pileId" title="充电桩ID" href="${pageContext.request.contextPath }/pile/show.action" paramId="pileId" paramProperty="pileId"></display:column>
        <display:column property="orderPhone" title="用户电话" href="${pageContext.request.contextPath }/user/show.action" paramId="orderPhone" paramProperty="orderPhone"></display:column>
        <display:column property="orderTime" title="时长（小时）"></display:column>
        <display:column property="orderMoney" title="费用（元）"></display:column>
        <display:column property="orderStatus" title="订单状态" ></display:column>
        <display:column property="orderMethod" title="支付方式" ></display:column>
        <display:column href="${pageContext.request.contextPath }/order/refund.action" paramId="orderId" paramProperty="orderId" value="退款" title="退款"></display:column>
        <display:column href="${pageContext.request.contextPath }/order/delete.action" paramId="orderId" paramProperty="orderId" value="删除" title="删除"></display:column>
    </display:table>
</div>
</body>
</html>
