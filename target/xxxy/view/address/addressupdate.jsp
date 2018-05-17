<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>充电桩管理系统</title>

    <%@ include file="/resource/public/common.jspf" %>
    <style type="text/css">
        body{
            margin:4%;
            height:50%;
            width:100%;
            position:absolute;
            font-size:12px;
        }
        #mapContainer{
            position: absolute;
            top: 0;
            left: 50%;
            right:0;
            bottom:0;
        }

        #tip{
            background-color:#fff;
            border:1px solid #ccc;
            padding-left:10px;
            padding-right:2px;
            position:absolute;
            min-height:65px;
            top:10px;
            font-size:12px;
            right:10px;
            border-radius:3px;
            overflow:hidden;
            line-height:20px;
            min-width:400px;
        }
        #tip input[type="button"]{
            background-color: #0D9BF2;
            height:25px;
            text-align:center;
            line-height:25px;
            color:#fff;
            font-size:12px;
            border-radius:3px;
            outline: none;
            border:0;
            cursor:pointer;
        }

        #tip input[type="text"]{
            height:25px;
            border:1px solid #ccc;
            padding-left:5px;
            border-radius:3px;
            outline:none;
        }
        #pos{
            height: 70px;
            background-color: #fff;
            padding-left: 10px;
            padding-right: 10px;
            position:absolute;
            font-size: 12px;
            right: 10px;
            bottom: 30px;
            border-radius: 3px;
            line-height: 30px;
            border:1px solid #ccc;
        }
        #pos input{
            border:1px solid #ddd;
            height:23px;
            border-radius:3px;
            outline:none;
        }

        #result1{
            max-height:300px;
        }
    </style>
</head>
<body>
<div style="padding:0px; margin:0px;">
    <ul class="breadcrumb" style="  margin:0px; " >
        <li><a href="#">充电桩管理</a></li>
        <li><a href="${pageContext.request.contextPath }/address/list.action">地址管理</a></li>
        <li class="active">添加地址</li>
    </ul>
</div>
<form action="${pageContext.request.contextPath}/address/update.action" class="form-horizontal" method="post">
    <h5 class="page-header alert-info" style="background-color: #fafafa; padding:10px; margin:0px; margin-bottom:5px;">地址信息</h5>
    <div class="row">
        <!-- 地址编号 -->
        <div class="form-group">
            <label class="col-sm-1 control-label">地址编号</label>
            <div class="col-sm-3">
                <input type="text" name="areaid" value="${address.areaid}" readonly="readonly" class="form-control input-sm col-xs-10 col-sm-5" placeholder="请输入地址编号"/>
            </div>
        </div>
        <!-- 地址 -->
        <div class="form-group">
            <label class="col-sm-1 control-label">地址</label>
            <div class="col-sm-3">
                <input type="text" name="address" id = "address" value="${address.address}"  class="form-control input-sm col-xs-10 col-sm-5" placeholder="请输入地址"/>
            </div>
        </div>
        <!-- 经度-->
        <div class="form-group">
            <label class="col-sm-1 control-label">经度</label>
            <div class="col-sm-3">
                <input type="text" name="longitude" id ="longitude"  value="${address.longitude}"  class="form-control input-sm col-xs-10 col-sm-5" placeholder="请输入经度"/>
            </div>
        </div>
        <!--纬度 -->
        <div class="form-group">
            <label class="col-sm-1 control-label">纬度</label>
            <div class="col-sm-3">
                <input type="text" name="latitude" id ="latitude" value="${address.latitude}"  class="form-control input-sm col-xs-10 col-sm-5" placeholder="请输入纬度"/>
            </div>
        </div>
     </div>
     <div class="space-4"></div>
    <div class="clearfix form-actions  ">
        <div class="col-md-offset-1 col-md-9">
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
            <a href="${pageContext.request.contextPath }/address/list.action"
               class="icon-arrow-left btn btn-link">返回上一级</a>
        </div>
    </div>
 </form>
<div id="mapContainer" ></div>
<div id="tip">
    <b>请输入关键字：</b>
    <input type="text" id="keyword" name="keyword" value="" onkeydown='keydown(event)' style="width: 95%;"/>
    <div id="result1" name="result1"></div>
</div>
<div id="pos">
    <b>鼠标左键在地图上单击获取坐标</b>
    <br><div>X：<input type="text" id="lngX" name="lngX" value=""/>&nbsp;Y：<input type="text" id="latY" name="latY" value=""/></div>
</div>

<script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=651d177c2434a653899efee411df92dd"></script>
<script type="text/javascript">
    var windowsArr = [];
    var marker = [];
    var mapObj = new AMap.Map("mapContainer", {
        resizeEnable: true,
        view: new AMap.View2D({
            resizeEnable: true,
            zoom:13//地图显示的缩放级别
        }),
        keyboardEnable:false
    });
    var clickEventListener=AMap.event.addListener(mapObj,'click',function(e){
        document.getElementById("lngX").value=e.lnglat.getLng();
        document.getElementById("latY").value=e.lnglat.getLat();
        document.getElementById("longitude").value=e.lnglat.getLng();
        document.getElementById("latitude").value=e.lnglat.getLat();
    });


    document.getElementById("keyword").onkeyup = keydown;
    //输入提示
    function autoSearch() {
        var keywords = document.getElementById("keyword").value;
        var auto;
        //加载输入提示插件
        AMap.service(["AMap.Autocomplete"], function() {
            var autoOptions = {
                city: "" //城市，默认全国
            };
            auto = new AMap.Autocomplete(autoOptions);
            //查询成功时返回查询结果
            if ( keywords.length > 0) {
                auto.search(keywords, function(status, result){
                    autocomplete_CallBack(result);
                });
            }
            else {
                document.getElementById("result1").style.display = "none";
            }
        });
    }

    //输出输入提示结果的回调函数
    function autocomplete_CallBack(data) {
        var resultStr = "";
        var tipArr = data.tips;
        if (tipArr&&tipArr.length>0) {
            for (var i = 0; i < tipArr.length; i++) {
                resultStr += "<div id='divid" + (i + 1) + "' onmouseover='openMarkerTipById(" + (i + 1)
                    + ",this)' onclick='selectResult(" + i + ")' onmouseout='onmouseout_MarkerStyle(" + (i + 1)
                    + ",this)' style=\"font-size: 13px;cursor:pointer;padding:5px 5px 5px 5px;\"" + "data=" + tipArr[i].adcode + ">" + tipArr[i].name + "<span style='color:#C1C1C1;'>"+ tipArr[i].district + "</span></div>";
            }
        }
        else  {
            resultStr = " π__π 亲,人家找不到结果!<br />要不试试：<br />1.请确保所有字词拼写正确<br />2.尝试不同的关键字<br />3.尝试更宽泛的关键字";
        }
        document.getElementById("result1").curSelect = -1;
        document.getElementById("result1").tipArr = tipArr;
        document.getElementById("result1").innerHTML = resultStr;
        document.getElementById("result1").style.display = "block";
    }

    //输入提示框鼠标滑过时的样式
    function openMarkerTipById(pointid, thiss) {  //根据id打开搜索结果点tip
        thiss.style.background = '#CAE1FF';
    }

    //输入提示框鼠标移出时的样式
    function onmouseout_MarkerStyle(pointid, thiss) {  //鼠标移开后点样式恢复
        thiss.style.background = "";
    }

    //从输入提示框中选择关键字并查询
    function selectResult(index) {
        if(index<0){
            return;
        }
        if (navigator.userAgent.indexOf("MSIE") > 0) {
            document.getElementById("keyword").onpropertychange = null;
            document.getElementById("keyword").onfocus = focus_callback;
        }
        //截取输入提示的关键字部分
        var text = document.getElementById("divid" + (index + 1)).innerHTML.replace(/<[^>].*?>.*<\/[^>].*?>/g,"");
        var cityCode = document.getElementById("divid" + (index + 1)).getAttribute('data');
        document.getElementById("keyword").value = text;
        document.getElementById("address").value = text;
        document.getElementById("result1").style.display = "none";
        //根据选择的输入提示关键字查询
        mapObj.plugin(["AMap.PlaceSearch"], function() {
            var msearch = new AMap.PlaceSearch();  //构造地点查询类
            AMap.event.addListener(msearch, "complete", placeSearch_CallBack); //查询成功时的回调函数
            msearch.setCity(cityCode);
            msearch.search(text);  //关键字查询查询
        });
    }

    //定位选择输入提示关键字
    function focus_callback() {
        if (navigator.userAgent.indexOf("MSIE") > 0) {
            document.getElementById("keyword").onpropertychange = autoSearch;
        }
    }

    //输出关键字查询结果的回调函数
    function placeSearch_CallBack(data) {
        //清空地图上的InfoWindow和Marker
        windowsArr = [];
        marker     = [];
        mapObj.clearMap();
        var resultStr1 = "";
        var poiArr = data.poiList.pois;
        var resultCount = poiArr.length;
        for (var i = 0; i < resultCount; i++) {
            resultStr1 += "<div id='divid" + (i + 1) + "' onmouseover='openMarkerTipById1(" + i + ",this)' onmouseout='onmouseout_MarkerStyle(" + (i + 1) + ",this)' style=\"font-size: 12px;cursor:pointer;padding:0px 0 4px 2px; border-bottom:1px solid #C1FFC1;\"><table><tr><td><img src=\"http://webapi.amap.com/images/" + (i + 1) + ".png\"></td>" + "<td><h3><font color=\"#00a6ac\">名称: " + poiArr[i].name + "</font></h3>";
            resultStr1 += TipContents(poiArr[i].type, poiArr[i].address, poiArr[i].tel) + "</td></tr></table></div>";
            addmarker(i, poiArr[i]);
        }
        mapObj.setFitView();
    }

    //鼠标滑过查询结果改变背景样式，根据id打开信息窗体
    function openMarkerTipById1(pointid, thiss) {
        thiss.style.background = '#CAE1FF';
        windowsArr[pointid].open(mapObj, marker[pointid]);
    }

    //添加查询结果的marker&infowindow
    function addmarker(i, d) {
        var lngX = d.location.getLng();
        var latY = d.location.getLat();
        var markerOption = {
            map:mapObj,
            icon:"http://webapi.amap.com/images/" + (i + 1) + ".png",
            position:new AMap.LngLat(lngX, latY)
        };
        var mar = new AMap.Marker(markerOption);
        marker.push(new AMap.LngLat(lngX, latY));

        var infoWindow = new AMap.InfoWindow({
            content:"<h3><font color=\"#00a6ac\">  " + (i + 1) + ". " + d.name + "</font></h3>" + TipContents(d.type, d.address, d.tel),
            size:new AMap.Size(300, 0),
            autoMove:true,
            offset:new AMap.Pixel(0,-30)
        });
        windowsArr.push(infoWindow);
        var aa = function (e) {
            var nowPosition = mar.getPosition(),
                lng_str = nowPosition.lng,
                lat_str = nowPosition.lat;
            infoWindow.open(mapObj, nowPosition);
            document.getElementById("lngX").value = lng_str;
            document.getElementById("latY").value = lat_str;
        };
        AMap.event.addListener(mar, "mouseover", aa);
    }

    //infowindow显示内容
    function TipContents(type, address, tel) {  //窗体内容
        if (type == "" || type == "undefined" || type == null || type == " undefined" || typeof type == "undefined") {
            type = "暂无";
        }
        if (address == "" || address == "undefined" || address == null || address == " undefined" || typeof address == "undefined") {
            address = "暂无";
        }
        if (tel == "" || tel == "undefined" || tel == null || tel == " undefined" || typeof address == "tel") {
            tel = "暂无";
        }
        var str = "  地址：" + address + "<br />  电话：" + tel + " <br />  类型：" + type;
        return str;
    }
    function keydown(event){
        var key = (event||window.event).keyCode;
        var result = document.getElementById("result1")
        var cur = result.curSelect;
        if(key===40){//down
            if(cur + 1 < result.childNodes.length){
                if(result.childNodes[cur]){
                    result.childNodes[cur].style.background='';
                }
                result.curSelect=cur+1;
                result.childNodes[cur+1].style.background='#CAE1FF';
                document.getElementById("keyword").value = result.tipArr[cur+1].name;
            }
        }else if(key===38){//up
            if(cur-1>=0){
                if(result.childNodes[cur]){
                    result.childNodes[cur].style.background='';
                }
                result.curSelect=cur-1;
                result.childNodes[cur-1].style.background='#CAE1FF';
                document.getElementById("keyword").value = result.tipArr[cur-1].name;
            }
        }else if(key === 13){
            var res = document.getElementById("result1");
            if(res && res['curSelect'] !== -1){
                selectResult(document.getElementById("result1").curSelect);
            }
        }else{
            autoSearch();
        }
    }
</script>
</body>
</html>