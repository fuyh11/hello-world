<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>首页</title>

    <%@ include file="/resource/public/common.jspf" %>

</head>
<head>
    <title>Title</title>
</head>
<body>
<div style="padding:0px; margin:0px;">
    <ul class="breadcrumb" style="  margin:0px; " >
        <li><a href="#">系统管理</a></li>
        <li>价格管理</li>
    </ul>
</div>
${info}
<form action="${pageContext.request.contextPath}/price/update.action" class="form-horizontal" >
    <h5 class="page-header alert-info" style="background-color: #fafafa; padding:10px; margin:0px; margin-bottom:5px;">价格管理</h5>
    <!-- 编号 -->
    <div class="form-group" style="display: none">
        <label class="col-sm-3 control-label" >编号</label>
        <div class="col-sm-2">
            <input type="text" name="priceId" value="${price.priceId}" readonly="readonly" class="form-control input-sm col-xs-10 col-sm-5" />
        </div>
    </div>
    <!-- 价格 -->
    <div class="form-group">
        <label class="col-sm-3 control-label">价格(元/小时)</label>
        <div class="col-sm-2">
            <input type="text" name="price" value="${price.price}"  class="form-control input-sm col-xs-10 col-sm-5" />
        </div>
    </div>
    <!-- 会员折扣 -->
    <div class="form-group">
        <label class="col-sm-3 control-label">会员折扣</label>
        <div class="col-sm-2">
            <input type="text" name="discount" value="${price.discount}"  class="form-control input-sm col-xs-10 col-sm-5" />
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
        </div>
    </div>
</form>
</body>
</html>
