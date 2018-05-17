<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>首页</title>

    <%@ include file="/resource/public/common.jspf" %>

</head>
<body>
<div style="padding:0px; margin:0px;">
    <ul class="breadcrumb" style="  margin:0px; " >
        <li><a href="#">会员管理</a></li>
        <li><a href="${pageContext.request.contextPath }/user/list.action">会员列表</a></li>
        <li>添加会员</li>
    </ul>
</div>
<form action="${pageContext.request.contextPath}/user/add.action" class="form-horizontal" method="post">
    <h5 class="page-header alert-info" style="background-color: #fafafa; padding:10px; margin:0px; margin-bottom:5px;">会员信息</h5>
    <div class="row">
        <!-- 电话 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">电话</label>
            <div class="col-sm-2">
                <input type="text" name="userPhone" value="${user.userPhone}"  class="form-control input-sm col-xs-10 col-sm-5" placeholder="请输入电话"/>
            </div>
        </div>
        <!-- 身份证 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">身份证</label>
            <div class="col-sm-2">
                <input type="text" name="userId" value="${user.userId}" class="form-control input-sm" placeholder="请输入身份证"/>
            </div>
        </div>
        <!-- 姓名 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">姓名</label>
            <div class="col-sm-2">
                <input type="text" name="userName" value="${user.userName}"  class="form-control input-sm col-xs-10 col-sm-5" placeholder="请输入姓名"/>
            </div>
        </div>
         <!-- 会员 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">是否为会员</label>
            <div class="col-sm-2">
                <select class="form-control input-sm"  name="userIsVip">
                	<option value="3">是否为会员</option>
                    <option value="0" ${user.userIsVip=='0'?'selected':'' }>是</option>
                    <option value="1" ${user.userIsVip=='1'?'selected':'' }>否</option>  
                </select>
            </div>
        </div>
        <!-- 密码 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">密码</label>
            <div class="col-sm-2">
                <input type="password" name="userPassword" value="${user.userPassword}" class="form-control input-sm" />
            </div>
        </div>
       
        <!-- 余额 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">余额</label>
            <div class="col-sm-2">
                <input type="text" name="userBalance" value="${user.userBalance}"  class="form-control input-sm"/>
            </div>
        </div>
        <!-- 是否认证 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">认证</label>
            <div class="col-sm-2">
                <select class="form-control input-sm"  name="userAuthentication">
                    <option value="3">是否认证</option>
                    <option value="0" ${user.userAuthentication=='0'?'selected':'' }>是</option>
                    <option value="1" ${user.userAuthentication=='1'?'selected':'' }>否</option>
                </select>
            </div>
        </div>
        
        <!-- 用户状态 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">状态</label>
            <div class="col-sm-2">
                <select class="form-control input-sm"  name="userLockState">
                    <option value="3">状态</option>
                    <option value="0" ${user.userLockState=='0'?'selected':'' }>预约</option>
                    <option value="1" ${user.userLockState=='1'?'selected':'' }>未预约</option>
                </select>
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
            <a href="${pageContext.request.contextPath }/user/list.action"
               class="icon-arrow-left btn btn-link">返回上一级</a>
        </div>
    </div>
</form>
</body>
</html>
