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
        <li>反馈信息</li>
        <li><a href="${pageContext.request.contextPath}/feedback/userlist.action">用户反馈信息</a></li>
        <li>信息处理</li>
    </ul>
</div>
<form action="${pageContext.request.contextPath}/feedback/ufupdate.action" class="form-horizontal" >
    <h5 class="page-header alert-info" style="background-color: #fafafa; padding:10px; margin:0px; margin-bottom:5px;">用户反馈信息处理</h5>
    <!-- 反馈编号 -->
    <div class="form-group">
        <label class="col-sm-3 control-label">反馈编号</label>
        <div class="col-sm-2">
            <input type="text" name="feedbackId"  readonly = "readonly"value="${userFeedback.feedbackId}"  class="form-control input-sm col-xs-10 col-sm-5"/>
        </div>
    </div>
    <!-- 用户电话 -->
    <div class="form-group">
        <label class="col-sm-3 control-label">用户电话</label>
        <div class="col-sm-2">
            <input type="text" name="userId"  readonly = "readonly" value="${userFeedback.userId}" class="form-control input-sm" />
        </div>
    </div>
    <!-- 充电桩ID -->
    <div class="form-group">
        <label class="col-sm-3 control-label">充电桩ID</label>
        <div class="col-sm-2">
            <input type="text" name="pileId"  readonly = "readonly" value="${userFeedback.pileId}" class="form-control input-sm" />
        </div>
    </div>
    <!-- 反馈信息 -->
    <div class="form-group">
        <label class="col-sm-3 control-label">反馈信息</label>
        <div class="col-sm-2">
            <input type="text" name="feedbackInfo" readonly = "readonly" value="${userFeedback.feedbackInfo}"  class="form-control input-sm col-xs-10 col-sm-5"/>
        </div>
    </div>
    <!-- 反馈时间 -->
    <div class="form-group">
        <label class="col-sm-3 control-label">反馈时间</label>
        <div class="col-sm-2">
            <input type="text" name="feedbackTime" readonly = "readonly" value="${userFeedback.feedbackTime}"  class="form-control input-sm col-xs-10 col-sm-5"/>
        </div>
    </div>
    <!-- 反馈信息处理 -->
    <div class="form-group">
        <label class="col-sm-3 control-label">反馈信息处理</label>
        <div class="col-sm-2">
            <select class="form-control input-sm"  name="feedbackResult">
                <option value="意见提交" ${feedbackResult=='意见提交'?'selected':'' }>意见提交</option>
                <option value="意见审核" ${feedbackResult=='意见审核'?'selected':'' }>意见审核</option>
                <option value="审核通过" ${feedbackResult=='审核通过'?'selected':'' }>审核通过</option>
            </select>
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
            <a href="${pageContext.request.contextPath }/feedback/userlist.action"
               class="icon-arrow-left btn btn-link">返回上一级</a>
        </div>
    </div>
</form>
</body>
</html>
