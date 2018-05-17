<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<%@ include file="/resource/public/common.jspf" %>

	<meta name="viewport" content="width=device-width, initial-scale=1.0" />

	<meta charset="utf-8">
	<!-- 引入 echarts.js -->
	<script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/echarts-all-3.js"></script>
	<meta charset="utf-8">
	<meta name="keywords" content="高德地图,DIY地图,高德地图生成器">
	<meta name="description" content="高德地图，DIY地图，自己制作地图，生成自己的高德地图">
	<title></title>
	<style>
		body { margin: 0; font: 13px/1.5 "Microsoft YaHei", "Helvetica Neue", "Sans-Serif"; min-height: 960px; min-width: 1160px; }
		.my-map { margin: 0 auto; width: 1160px; height: 600px; right: auto}
		.my-map .icon { background: url(http://lbs.amap.com/console/public/show/marker.png) no-repeat; right: 10px}
		.my-map .icon-cir { height: 31px; width: 28px; }
		.my-map .icon-cir-blue { background-position: -11px -55px; }
		.amap-container{height: 100%;}
	</style>
</head>
<body>
<div class="row">
	<div id="wrap" class="my-map">
		<div id="mapContainer"></div>
		<script src="//webapi.amap.com/maps?v=1.3&key=651d177c2434a653899efee411df92dd"></script>
	</div>
	<br><br>
	<div align="center" id="main2" style="width: 1000px;height:400px;"></div>
</div>

			<script>
                !function(){
                    var infoWindow, map, level = 11,
                        center = {lng: 120.36353, lat: 30.29649},
                        features = [{type: "Marker", name: "001", desc: "杭州下沙电子商务园", color: "blue", icon: "cir", offset: {x: -9, y: -31}, lnglat: {lng: 120.36353, lat: 30.29649}},
                            {type: "Marker", name: "002", desc: "杭州萧山国际机场", color: "blue", icon: "cir", offset: {x: -9, y: -31}, lnglat: {lng: 120.43524, lat: 30.23698}},
                            {type: "Marker", name: "003", desc: "杭州上城区市民学校", color: "blue", icon: "cir", offset: {x: -9, y: -31}, lnglat: {lng: 120.17017, lat: 30.24786}},
                            {type: "Marker", name: "004", desc: "杭州东站东广场", color: "blue", icon: "cir", offset: {x: -9, y: -31}, lnglat: {lng: 120.20911, lat: 30.28942}}];


                    function loadFeatures(){
                        for(var feature, data, i = 0, len = features.length, j, jl, path; i < len; i++){
                            data = features[i];
                            switch(data.type){
                                case "Marker":
                                    feature = new AMap.Marker({ map: map, position: new AMap.LngLat(data.lnglat.lng, data.lnglat.lat),
                                        zIndex: 3, extData: data, offset: new AMap.Pixel(data.offset.x, data.offset.y), title: data.name,
                                        content: '<div class="icon icon-' + data.icon + ' icon-'+ data.icon +'-' + data.color +'"></div>' });
                                    break;
                                case "Polyline":
                                    for(j = 0, jl = data.lnglat.length, path = []; j < jl; j++){
                                        path.push(new AMap.LngLat(data.lnglat[j].lng, data.lnglat[j].lat));
                                    }
                                    feature = new AMap.Polyline({ map: map, path: path, extData: data, zIndex: 2,
                                        strokeWeight: data.strokeWeight, strokeColor: data.strokeColor, strokeOpacity: data.strokeOpacity });
                                    break;
                                case "Polygon":
                                    for(j = 0, jl = data.lnglat.length, path = []; j < jl; j++){
                                        path.push(new AMap.LngLat(data.lnglat[j].lng, data.lnglat[j].lat));
                                    }
                                    feature = new AMap.Polygon({ map: map, path: path, extData: data, zIndex: 1,
                                        strokeWeight: data.strokeWeight, strokeColor: data.strokeColor, strokeOpacity: data.strokeOpacity,
                                        fillColor: data.fillColor, fillOpacity: data.fillOpacity });
                                    break;
                                default: feature = null;
                            }
                            if(feature){ AMap.event.addListener(feature, "click", mapFeatureClick); }
                        }
                    }

                    function mapFeatureClick(e){
                        if(!infoWindow){ infoWindow = new AMap.InfoWindow({autoMove: true}); }
                        var extData = e.target.getExtData();
                        infoWindow.setContent("<h5>" + extData.name + "</h5><div>" + extData.desc + "</div>");
                        infoWindow.open(map, e.lnglat);
                    }

                    map = new AMap.Map("mapContainer", {center: new AMap.LngLat(center.lng, center.lat), level: level});

                    loadFeatures();

                    map.on('complete', function(){
                        map.plugin(["AMap.ToolBar", "AMap.OverView", "AMap.Scale"], function(){
                            map.addControl(new AMap.ToolBar);
                            map.addControl(new AMap.OverView({isOpen: true}));
                            map.addControl(new AMap.Scale);
                        });
                    })

                }();
                var myChart2 = echarts.init(document.getElementById('main2'));
                myChart2.setOption({
                    title: {
                        text: '充电桩金额',
                        x:'center'
                    },
                    tooltip : {
                        show: true,
                        trigger: 'item',
                        formatter: "{a} <br/>{b} : {c} ({d}%)"
                    },
                    legend: {
                        orient: 'vertical',
                        left: 'left',
                        data: []
                    },
                    series : [
                        {
                            name: '访问来源',
                            type: 'pie',
                            radius : '55%',
                            center: ['50%', '60%'],
                            data: [],
                            itemStyle: {
                                emphasis: {
                                    shadowBlur: 10,
                                    shadowOffsetX: 0,
                                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                                }
                            }
                        }
                    ]
                });
                myChart2.showLoading();
                var names=[];    //类别数组（实际用来盛放X轴坐标值）
                var nums=[];    //销量数组（实际用来盛放Y坐标值）
                $.ajax({
                    type : "post",
                    async : false,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
                    url : "${pageContext.request.contextPath}/chart/pile.action",    //请求发送到TestServlet处
                    data : {},
                    dataType : "json",        //返回数据形式为json
                    success : function(result) {
                        //请求成功时执行该函数内容，result即为服务器返回的json对象
                        if (result) {
                            for(var i=0;i<result.length;i++){
                                names.push(result[i].pileId);    //挨个取出类别并填入类别数组
                            }
                            for(var i=0;i<result.length;i++){
                                nums.push(result[i].orderMoney);    //挨个取出销量并填入销量数组
                            }
                            var array = [];

                            for(i = 0 ;i<result.length;i++ ){
                                //alert(names[i]+",,,,,"+nums[i])
                                var map ={};
                                map.name = names[i];
                                map.value =nums[i];
                                array[i]=map;
                            }
                            myChart2.hideLoading();    //隐藏加载动画
                            myChart2.setOption({//加载数据图表
                                legend: {
                                    data: names
                                },

                                series: [{
                                    // 根据名字对应到相应的系列
                                    name: '访问来源',
                                    type: 'pie',
                                    data: array
                                }]
                            });

                        }

                    },
                    error : function(errorMsg) {
                        //请求失败时执行该函数
                        alert("图表请求数据失败!");
                        myChart2.hideLoading();
                    }
                });
			</script>



</body>
</html>