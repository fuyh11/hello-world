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
<div class="card">
    <div style="margin:15px;width:97%;" class=" input-group">

        <span style="border-radius:5px;background-color:#ddeeff;padding:5px 10px 5px 10px;">管理员ID:</span><input type="text" id="input_aid" class="form-control" style="margin-right:30px;">

        <span style="border-radius:5px;background-color:#ddeeff;padding:5px 10px 5px 10px;">用户名:</span><input type="text" id="input_aname" class="form-control" style="margin-right:30px;">
        <span style="border-radius:5px;background-color:#ddeeff;padding:5px 10px 5px 10px;">电话:</span><input type="text" id="input_phone" class="form-control" style="">

        <!-- <span style="border-radius:5px;background-color:#ddeeff;padding:5px 10px 5px 10px;">单元:</span><select id="input_cid" class="form-control" style="margin-right:30px;"></select>

        <span style="border-radius:5px;background-color:#ddeeff;padding:5px 10px 5px 10px;">楼层:</span><select class="form-control" style="margin-right:30px;"></select>
        <span style="border-radius:5px;background-color:#ddeeff;padding:5px 10px 5px 10px;">房间:</span><select  class="form-control" style=""></select>
     -->

        <button class="btn btn-info" ng-click="search_user()" style="margin-left:30px" type="button"><span class="fa fa-search"></span></button>
        <button class="btn btn-success" ng-click="add_user()" data-toggle="modal" data-target="#add_user" style="margin-left:20px" type="button"><span class="fa fa-plus"></span></button>
        <button class="btn btn-secondary" ng-click="cancel_user()" style="width:100px;margin-left:20px" type="button">取消</button>
        <button class="btn btn-danger" ng-click="delete_user()" style="width:100px;margin-left:20px" type="button">删除</button>


    </div>

</div>
</body>
</html>
