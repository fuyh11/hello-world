<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="cout" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <title>add</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

    <%@ include file="/resource/public/common.jspf" %>
</head>

<body>
<div style="padding: 0px; margin: 0px;">
    <ul class="breadcrumb" style="margin: 0px;">
        <li><a href="#">设备管理</a></li>
        <li>设备基本信息</li>
        <li class="active">添加设备</li>
    </ul>
</div>
<div class="page-content">
       <div class="page-header">
           <h1>充电桩</h1>
       </div><!-- /.page-header -->
                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->
                        <form action="${pageContext.request.contextPath}/pile/add.action" class="form-horizontal">
                            <div class="form-group" style="display: none">
                                <label class="col-sm-3 control-label no-padding-right" readonly="true"> 充电桩编号 </label>
                                <div class="col-sm-9">
                                    <input type="text" name="pileId" value="${pile.pileId}" readonly="readonly"  class="col-xs-10 col-sm-5" />
                                </div>
                            </div><div class="space-4"></div>
                            
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right" >区域编号 </label>
                                <div class="col-sm-9">
                               
                                    <input type="text" id="pileAreaid" name="pileAreaid" class="col-xs-10 col-sm-5"  />
                                </div>
                            </div><div class="space-4"></div>
    <div class="form-group" style="display: none">
        <label class="col-sm-3 control-label no-padding-right" >密码 </label>
        <div class="col-sm-9">

            <input type="text" id="pilePassword" name="pilePassword" value="${pile.pilePassword}" class="col-xs-10 col-sm-5"  />
        </div>
    </div><div class="space-4"></div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right" > 地址 </label>
                                <div class="col-sm-9">
                                    <select id="pileAddress" name="pileAddress" class="col-xs-10 col-sm-5">
                                        <option value="">请选择</option>
                                        <c:forEach items="${address_list}" var="address">
                                            <option value="${address.address}">${address.address}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div><div class="space-4"></div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" > 经度 </label>
                                <div class="col-sm-9">
                            <input type="text" id ="pileLongitude" name="pileLongitude" value="${pile.pileLongitude}" class="col-xs-10 col-sm-5"  />
                            </div>
                            </div><div class="space-4"></div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right" > 纬度 </label>
                                <div class="col-sm-9">
                                    <input type="text" id ="pileLatitude" name="pileLatitude" value="${pile.pileLatitude}" class="col-xs-10 col-sm-5"  />
                                </div>
                            </div><div class="space-4"></div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right"  > 员工编号 </label>
                                <div class="col-sm-9">
                                 <input type="text"  id ="pileStaffid"  name="pileStaffid"  class="col-xs-10 col-sm-5"  />
                                
                                </div>
                            </div><div class="space-4"></div>
                            
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right" > 员工姓名</label>
                                <div class="col-sm-9">
                                    <select id="pileStaffname" name="pileStaffname" class="col-xs-10 col-sm-5" >
                                        <option value="">请选择</option>
                                        <c:forEach items="${staff_list}" var="staff">
                                            <option value="${staff.staffName}">${staff.staffName}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div><div class="space-4"></div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right" > 充电桩状态 </label>
                                <div class="col-sm-9">
                                    <select id="pileState" name="pileState"  class="col-xs-10 col-sm-5">
                                    <option value="0" ${pile.pileState=='0'?'selected':'' }>请选择状态</option>
                                    <option value="1" ${pile.pileState=='1'?'selected':'' }>使用中</option>
                                    <option value="2" ${pile.pileState=='2'?'selected':'' }>建设中</option>
                                    <option value="3" ${pile.pileState=='3'?'selected':'' }>维护中</option>
                                    <option value="4" ${pile.pileState=='4'?'selected':'' }>拆除</option>
                                    </select>
                                </div>
                            </div><div class="space-4"></div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right" > 充电桩使用情况 </label>
                                <div class="col-sm-9">
                                    <select id="pileUseState" name="pileUseState" class="col-xs-10 col-sm-5" >
                                    <option value="0" ${pile.pileUseState=='0'?'selected':'' }>充电桩使用状态</option>
                                    <option value="1" ${pile.pileUseState=='1'?'selected':'' }>未使用</option>
                                    <option value="2" ${pile.pileUseState=='2'?'selected':'' }>使用中</option>
                                    <option value="3" ${pile.pileUseState=='3'?'selected':'' }>被预约</option>
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
                                    <a href="${pageContext.request.contextPath }/pile/list.action"
                                       class="icon-arrow-left btn btn-link">返回上一级</a>
                                </div>
                            </div>
                        </form>
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content -->
<select id="areaid" name="areaid"  style="display:none">
    <c:forEach items="${address_list}" var="address" >
        <option value="${address.areaid}">${address.areaid}</option>
    </c:forEach>
</select>
<select id="longitude" name="longitude"  style="display:none" >
    <c:forEach items="${address_list}" var="address">
        <option value="${address.longitude}">${address.longitude}</option>
    </c:forEach>
</select>
<select id="latitude" name="latitude"  style="display:none">
    <c:forEach items="${address_list}" var="address">
        <option value="${address.latitude}">${address.latitude}</option>
    </c:forEach>
</select>
<select id="staffId" name="staffId" style="display:none">
    <c:forEach items="${staff_list}" var="staff">
        <option value="${staff.staffId}">${staff.staffId}</option>
    </c:forEach>
</select>

<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script>
    <script language="JavaScript" type="text/javascript">
        $(document).ready(function(){
            $("#pileAddress").change(function () {
                var index=$("#pileAddress").get(0).selectedIndex;
                var pileAreaid=$("#pileAreaid");
                var pileLongitude=$("#pileLongitude");
                var pileLatitude=$("#pileLatitude");
                var value1=$("#areaid").get(0).options[index-1].text;
                var value2=$("#longitude").get(0).options[index-1].text;
                var value3=$("#latitude").get(0).options[index-1].text;
                pileAreaid.val(value1);
                pileLongitude.val(value2);
                pileLatitude.val(value3);
            });
            $("#pileStaffname").change(function () {
                var index=$("#pileStaffname").get(0).selectedIndex;
                var pileStaffid=$("#pileStaffid");
                var value=$("#staffId").get(0).options[index-1].text;
                pileStaffid.val(value);
            });
        });
    </script>

</div>
</body>
</html>

