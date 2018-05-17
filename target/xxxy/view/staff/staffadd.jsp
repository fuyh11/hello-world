<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="cout" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <li><a href="#">账户管理</a></li>
        <li>员工列表</li>
        <li>添加员工</li>
    </ul>
</div>
<form action="${pageContext.request.contextPath}/staff/add.action" class="form-horizontal" method="post">
    <h5 class="page-header alert-info" style="background-color: #fafafa; padding:10px; margin:0px; margin-bottom:5px;">个人信息</h5>
    <div class="row">
        <!-- 工号 -->
        <div class="form-group" style="display: none">
            <label class="col-sm-3 control-label">工号</label>
            <div class="col-sm-2">
                <input type="text" name="staffId"  class="form-control input-sm col-xs-10 col-sm-5" placeholder="工号"/>
            </div>
        </div>
        <!-- 姓名 -->
    </div>
	<div class="form-group">
            <label class="col-sm-3 control-label">姓名</label>
                <div class="col-sm-2">
                    <input type="text" name="staffName" class="form-control input-sm" placeholder="请输入姓名"/>
                </div>
     </div>
	 <div class="form-group">
            <label class="col-sm-3 control-label">性别</label>
            <div class="col-sm-2">
                <select class="form-control input-sm"  name="staffSex">
                     <option value="保密" ${staffSex=='保密'?'selected':'' }>保密</option>
                    <option value="男" ${staffSex=='男'?'selected':'' }>男</option>
                    <option value="女" ${staffSex=='女'?'selected':'' }>女</option>
                </select>
            </div>
        </div>
         <div class="form-group">
            <label class="col-sm-3 control-label">籍贯</label>
            <div class="col-sm-2">
                <input type="text" name="staffNativePlace" class="form-control input-sm" />
            </div>
        </div>
        <!-- 身份证 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">身份证</label>
            <div class="col-sm-2">
                <input type="text" name="staffIdcard" class="form-control input-sm"/>
            </div>
        </div>
        <!-- 出生日期 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">出生日期</label>
            <div class="col-sm-2">
                <input type="text" name="birthday_str" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" readonly="readonly" class="form-control input-sm" placeholder="请输入出生日期"/>
            </div>
        </div>
         <!-- 入职时间 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">入职时间</label>
            <div class="col-sm-2">
                <input type="text" name="entryTime_str"  onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" readonly="readonly" class="form-control input-sm" placeholder="请输入入职时间 "/>
            </div>
        </div>
         <!-- 教育水平 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">教育水平</label>
            <div class="col-sm-2">
                <select class="form-control input-sm" name="staffEducationLevel" >
                    <option value="保密" ${staffEducationLevel=='保密'?'selected':'' }>保密</option>
                  	<option value="博士" ${staffEducationLevel=='博士'?'selected':''}>博士</option>
                    <option value="硕士" ${staffEducationLevel=='硕士'?'selected':''}>硕士</option>
                    <option value="本科" ${staffEducationLevel=='硕士'?'selected':''}>本科</option>                
                </select>
            </div>
        </div>
 
    <h5 class="page-header alert-info" style="background-color: #fafafa; padding:10px; margin:0px; margin-bottom:5px;">联系方式</h5>
    <div class="row">
        <!-- QQ -->
        <div class="form-group">
            <label class="col-sm-3 control-label">QQ</label>
            <div class="col-sm-2">
                <input type="text" name="staffQq" class="form-control input-sm" placeholder="请输入QQ"/>
            </div>
        </div>
        <!-- 移动电话 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">移动电话</label>
            <div class="col-sm-2">
                <input type="text" name="staffPhone" class="form-control input-sm" placeholder="请输入办公电话"/>
            </div>
        </div>
        <!-- 邮箱地址 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">邮箱地址</label>
            <div class="col-sm-2">
                <input type="text" name="staffEmail" class="form-control input-sm" placeholder="请输入电子邮件"/>
            </div>
        </div>
        <!-- 家庭住址 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">家庭住址</label>
            <div class="col-sm-2">
                <input type="text" name="staffAddress" class="form-control input-sm" placeholder="请输入家庭住址 "/>
            </div>
        </div>
    </div>
    <h5 class="page-header alert-info" style="background-color: #fafafa; padding:10px; margin:0px; margin-bottom:5px;">分配区域</h5>
    <div class="row">
    <!-- 区域编号 -->
        <div class="form-group">
            <label class="col-sm-3 control-label">区域编号</label>
            <select id="staffAreaid" name="staffAreaid" class="col-xs-10 col-sm-2">
                <option value="">请选择</option>
                <c:forEach items="${address_list}" var="address">
                    <option value="${address.areaid}">${address.address}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group" style="display: none">
            <label class="col-sm-3 control-label">状态</label>
            <div class="col-sm-2">
                <input type="text" name="staffState" class="form-control input-sm"/>
            </div>
        </div>
        </div>
    <h5 class="page-header alert-info" style="background-color: #fafafa; padding:10px; margin:0px; margin-bottom:5px;">备注信息</h5>
    	<div class="row">
            <div class="form-group">
                <label class="col-sm-3 control-label">备注</label>
                <div class="col-sm-5">
                    <textarea class="form-control" name="staffRemark"></textarea>
                </div>
          </div>
          </div>
    <%--<h5 class="page-header alert-info" style="background-color: #fafafa ;padding:10px; margin:0px; margin-bottom:5px;">账号信息</h5>--%>
    <div class="row" style="display: none">
            <div class="form-group">
                <label class="col-sm-3 control-label">密码</label>
                <div class="col-sm-5">
                    <input type="text" name="staffPassword" class="form-control input-sm"/>
                </div>
          </div>
          </div>
    <div class="row">
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
        </div>
    </div>
</form>

</body>
</html>
