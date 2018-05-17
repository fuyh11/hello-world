<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <title>首页</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

    <%@ include file="/resource/public/common.jspf" %>
</head>

<body>
<div style="padding:0px; margin:0px;">
    <ul class="breadcrumb" style="  margin:15px; " >
        <h3>个人中心</h3>
    </ul>
</div>
<p>${info}</p>
<div class="profile-user-info profile-user-info-striped">
        <div class="profile-info-row">
            <div class="profile-info-name">编号 </div>
            <div class="profile-info-value">
                <span class="editable" id="aid">${admins.aid}</span>
            </div>
        </div>
        <div class="profile-info-row">
            <div class="profile-info-name">用户名 </div>

            <div class="profile-info-value">
                <span class="editable" id="aname">${admins.aname}</span>
            </div>
        </div>

        <div class="profile-info-row">
            <div class="profile-info-name">用户姓名 </div>

            <div class="profile-info-value">
                <span class="editable" id="adminname">${admins.adminname}</span>
            </div>
        </div>
        <div class="profile-info-row">
            <div class="profile-info-name">用户电话 </div>
            <div class="profile-info-value">
                <span class="editable" id="adminphone">${admins.adminphone}</span>
            </div>
        </div>
        <div class="profile-info-row">
            <div class="profile-info-name">用户邮箱 </div>
            <div class="profile-info-value">
                <span class="editable" id="adminemail">${admins.adminemail}</span>
            </div>
        </div>
        <div class="profile-info-row">
            <div class="profile-info-name">其他信息 </div>
            <div class="profile-info-value">
                <span class="editable" id="adminmess">${admins.adminmess}</span>
            </div>
        </div>
        <div class="row">
            <div style="margin-top:40px;margin-bottom:20px">
                <button class="btn btn-info"  data-toggle="modal" data-target="#modify_pass"  style="margin-left:30px" type="button">修改密码</button>
            </div>
        </div>
    </div>
<div  class="modal fade" id="modify_pass" tabindex="-1" role="dialog"  aria-hidden="true">
    <div class="modal-dialog" >
        <form action="${pageContext.request.contextPath}/admin/modifPass.action" method="post">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" >
                   	 修改密码
                </h4>
            </div>
            <div class="modal-body"  >
                <div style="margin-top:10px">
                    <span class="col-sm-4">原密码：</span><input type="password" name="oldpass" >
                </div>
                <div style="margin-top:10px">
                    <span class="col-sm-4">新密码：</span><input type="password" name="newpass" >
                </div>
                <div style="margin-top:10px">
                    <span class="col-sm-4">确认密码：</span><input type="password" name="configpass" >
                </div>
            </div>
            <div class="modal-footer">
                <button type="submit" class="btn btn-primary">确定</button>
                <button type="button" class="btn btn-default" data-dismiss="modal" >关闭</button>
            </div>
        </div>
        </form>
    </div>
</div>
<script type="text/javascript">
    function fun(){
        alert("被点击");
    }
</script>
</body>
</html>

