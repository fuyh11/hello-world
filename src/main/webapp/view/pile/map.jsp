<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <title>高德地图展示多个信息窗口</title>
    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>
    <script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=651d177c2434a653899efee411df92dd"></script>
    <script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script>

</head>
<body>
<div id="container"></div>
<script type="text/javascript">
    //初始化地图对象，加载地图
    var map = new AMap.Map("container", {
        resizeEnable: true,
        zoom:10
    });

    //经度纬度
    var lnglats = [
        [114.069919,30.564255],
        [114.461307,30.618634],
        [114.509372,30.492096],
        [114.525165,30.742646],
        [114.620609,30.712543],
        [114.547138,30.412779],
        [113.902378,30.396789],
        [114.15163,30.779228],
        [114.676227,30.857067],
        [114.162616,30.96782]
    ];

    //人员信息
    var student = [
        {name:"张思",age:"22",sex:"女"},
        {name:"李磊",age:"21",sex:"男"},
        {name:"吴雪",age:"22",sex:"女"},
        {name:"思雨",age:"23",sex:"女"},
        {name:"赵华",age:"24",sex:"男"},
        {name:"孙杨",age:"26",sex:"男"},
        {name:"钱思思",age:"20",sex:"女"},
        {name:"郑武",age:"22",sex:"男"},
        {name:"胡迪",age:"21",sex:"男"},
        {name:"司马云",age:"22",sex:"女"}
    ];

    //初始化信息窗口
    var infoWindow = new AMap.InfoWindow({offset: new AMap.Pixel(0, -30)});

    //循环遍历
    for (var i = 0, marker; i < lnglats.length; i++)
    {
        var marker = new AMap.Marker({
            position: lnglats[i],
            map: map
        });
        marker.content = "人员位置<br><br>姓名："+student[i].name+"<br>年龄："+student[i].age+"<br>性别："+student[i].sex;
        marker.on('click', markerClick);
        marker.emit('click', {target: marker});
    }

    //点击事件
    function markerClick(e)
    {
        infoWindow.setContent(e.target.content);
        infoWindow.open(map, e.target.getPosition());
    }
    map.setFitView();
</script>
</body>
</html>