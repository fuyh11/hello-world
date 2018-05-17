<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="cout" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>首页</title>

    <%@ include file="/resource/public/common.jspf" %>

</head>
<div style="padding:0px; margin:0px;">
    <ul class="breadcrumb" style="  margin:15px; " >
        <h3>会员信息</h3>
    </ul>
</div>
<div class="profile-user-info profile-user-info-striped">
    <div class="profile-info-row">
        <div class="profile-info-name">电话 </div>
        <div class="profile-info-value">
            <span style="width: 400px" class="editable" id="userPhone">${user.userPhone}</span>
        </div>
    </div>
    <div class="profile-info-row">
        <div class="profile-info-name">身份证 </div>
        <div class="profile-info-value">
            <span class="editable" id="userId">${user.userId}</span>
        </div>
    </div>
    <div class="profile-info-row">
        <div class="profile-info-name">姓名 </div>
        <div class="profile-info-value">
            <span class="editable" id="userName">${user.userName}</span>
        </div>
    </div>
    <div class="profile-info-row">
        <div class="profile-info-name">是否为会员 </div>

        <div class="profile-info-value">
            <span class="editable" id="userVip">${user.userVip}</span>
        </div>
    </div>
    <div class="profile-info-row">
        <div class="profile-info-name">余额 </div>

        <div class="profile-info-value">
            <span class="editable" id="userBalance">${user.userBalance}</span>
        </div>
    </div>
    <div class="profile-info-row">
        <div class="profile-info-name">认证 </div>

        <div class="profile-info-value">
            <span class="editable" id="userAuthen">${user.userAuthen}</span>
        </div>
    </div>
    <div class="profile-info-row">
        <div class="profile-info-name">状态 </div>

        <div class="profile-info-value">
            <span class="editable" id="userLock">${user.userLock}</span>
        </div>
    </div>

</div>
<br><br>
<h5 class="page-header alert-info" style="background-color: #fafafa; padding:10px; margin:0px; margin-bottom:5px;">消费记录</h5>
<div class="row alert alert-info " style="background-color: #fafafa" >
    <display:table class="table table-condensed table-striped"  id="order" name="${order_list}" pagesize="5"  export="true"  requestURI="${pageContext.request.contextPath }/user/show.action">
        <display:column title="编号"><cout:out value="${order_rowNum}"/></display:column>
        <display:column property="pileId" title="充电桩ID" href="${pageContext.request.contextPath }/pile/show.action" paramId="pileId" paramProperty="pileId"></display:column>
        <display:column property="orderPhone" title="用户电话" href="${pageContext.request.contextPath }/user/show.action" paramId="orderPhone" paramProperty="orderPhone"></display:column>
        <display:column property="orderTime" title="时长（小时）"></display:column>
        <display:column property="orderMoney" title="费用（元）"></display:column>
        <display:column property="orderStatus" title="订单状态" ></display:column>
        <display:column property="orderMethod" title="支付方式" ></display:column>
    </display:table>
</div>

</body>
</html>
