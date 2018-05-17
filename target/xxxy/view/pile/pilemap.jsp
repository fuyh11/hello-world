<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>首页</title>
    <%@ include file="/resource/public/common.jspf" %>
</head>

<body>
<head>
    <meta charset="utf-8">
    <meta name="keywords" content="高德地图,DIY地图,高德地图生成器">
    <meta name="description" content="高德地图，DIY地图，自己制作地图，生成自己的高德地图">
    <title></title>
    <style>
        body { margin: 0; font: 13px/1.5 "Microsoft YaHei", "Helvetica Neue", "Sans-Serif"; min-height: 960px; min-width: 600px; }
        .my-map { margin: 0 auto; width: 600px; height: 600px; }
        .my-map .icon { background: url(http://lbs.amap.com/console/public/show/marker.png) no-repeat; }
        .my-map .icon-cir { height: 31px; width: 28px; }
        .my-map .icon-cir-blue { background-position: -11px -55px; }
        .amap-container{height: 100%;}
    </style>
</head>
<body>
<div id="wrap" class="my-map">
    <div id="mapContainer"></div>
</div>
<script src="//webapi.amap.com/maps?v=1.3&key=651d177c2434a653899efee411df92dd"></script>
<script>
    !function(){
        var infoWindow, map, level = 11,
            center = {lng: 120.36353, lat: 30.29649},
            features = [{type: "Marker", name: "CD001001", desc: "杭州下沙电子商务园", color: "blue", icon: "cir", offset: {x: -9, y: -31}, lnglat: {lng: 120.36353, lat: 30.29649}},
                {type: "Marker", name: "CD002001", desc: "杭州萧山国际机场", color: "blue", icon: "cir", offset: {x: -9, y: -31}, lnglat: {lng: 120.43524, lat: 30.23698}},
                {type: "Marker", name: "CD003001", desc: "杭州上城区市民学校", color: "blue", icon: "cir", offset: {x: -9, y: -31}, lnglat: {lng: 120.17017, lat: 30.24786}},
                {type: "Marker", name: "CD003001", desc: "杭州东站东广场", color: "blue", icon: "cir", offset: {x: -9, y: -31}, lnglat: {lng: 120.20911, lat: 30.28942}}];


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
</script>
</body>

</body>
</html>