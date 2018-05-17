<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        <li ><a href="${pageContext.request.contextPath }/admin/update.action">管理员列表</a></li>
        <li class="active">修改管理员信息</li>
    </ul>
</div>
<form action="${pageContext.request.contextPath}/admin/update.action" class="form-horizontal" method="post">
    <h5 class="page-header alert-info" style="background-color: #fafafa; padding:10px; margin:0px; margin-bottom:5px;">管理员信息</h5>
    <div class="row">
    <!-- 用户 Id-->
        <div class="form-group">
            <label class="col-sm-3 control-label">用户Id</label>
            <div class="col-sm-2">
                <input type="text" name="aid" value="${admins.aid}" readonly="readonly" class="form-control input-sm col-xs-10 col-sm-5" placeholder="ID"/>
            </div>
        </div>
        <!-- 用户 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">用户名</label>
            <div class="col-sm-2">
                <input type="text" name="aname" value="${admins.aname}"  class="form-control input-sm col-xs-10 col-sm-5" placeholder="请输入用户名"/>
            </div>
        </div>
        <!-- 用户姓名 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">用户姓名</label>
            <div class="col-sm-2">
                <input type="text" name="adminname" value="${admins.adminname}"  class="form-control input-sm col-xs-10 col-sm-5" placeholder="请输入姓名"/>
            </div>
        </div>
        <!-- 用户电话 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">电话</label>
            <div class="col-sm-2">
                <input type="text" name="adminphone" value="${admins.adminphone}"  class="form-control input-sm col-xs-10 col-sm-5" placeholder="请输入电话"/>
            </div>
        </div>
        <!-- 邮箱 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">邮箱</label>
            <div class="col-sm-2">
                <input type="text" name="adminemail" value="${admins.adminemail}"  class="form-control input-sm col-xs-10 col-sm-5" placeholder="请输入邮箱"/>
            </div>
        </div>
        <!-- 备注 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">备注</label>
            <div class="col-sm-2">
                <input type="text" name="adminmess" value="${admins.adminmess}"  class="form-control input-sm col-xs-10 col-sm-5" placeholder="请输入备注"/>
            </div>
        </div>
        <!-- 角色 -->
        <div class="form-group" style="display: none">
            <label class="col-sm-3 control-label">角色</label>
            <div class="col-sm-2">
                <input type="password" name="adminroleid" value="${admins.adminroleid}"  class="form-control input-sm col-xs-10 col-sm-5" placeholder="请输入密码"/>
           </div>
        </div>
        <!-- 密码-->
        <div class="form-group" style="display: none">
            <label class="col-sm-3 control-label" style="display: none">密码</label>
            <div class="col-sm-2">
                <input type="text" name="adminname" value="${admins.apass}"  class="form-control input-sm col-xs-10 col-sm-5" placeholder="请输入电话"/>
           </div>
        </div>
      </div>
      <div class="space-4"></div>
    <div class="clearfix form-actions">
        <div class="col-md-offset-3 col-md-9">
            <button class="btn btn-info" type="submit">
                <i class="icon-ok bigger-110"></i>
                保存
            </button>
            &nbsp; &nbsp; &nbsp;
            <button class="btn" type="reset">
                <i class="icon-undo bigger-110"></i>
                Reset
            </button>
            &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; &nbsp; &nbsp;&nbsp;
            <a href="${pageContext.request.contextPath }/admin/list.action"
               class="icon-arrow-left btn btn-link">返回上一级</a>
        </div>
    </div>
</form>
</body>
</html>