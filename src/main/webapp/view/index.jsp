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
	<div class="navbar navbar-default" id="navbar">
		<script type="text/javascript">
			try {
				ace.settings.check('navbar', 'fixed')
			} catch (e) {
			}
		</script>

		<div class="navbar-container" id="navbar-container">
			<div class="navbar-header pull-left">
				<a href="#" class="navbar-brand">
					<small><i class="icon-leaf green"></i> 充电桩后台管理系统</small>
				</a>
			</div>

			<div class="navbar-header pull-right" >
				<nav class="navbar navbar-default" role="navigation">
					<div class="container-fluid">
						<div>
							<ul class="nav navbar-nav">
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">
										用户
										<b class="caret"></b>
									</a>
									<ul class="dropdown-menu">
										<li><a href="${pageContext.request.contextPath}/admin/profile.action?aname=${sessionScope.aname}" target="mainframe"><i class="icon-user">个人中心</i></a></li>
										<li><a href="${pageContext.request.contextPath}/view/login.jsp"><i class="icon-off">退出</i></a></li>
									</ul>
								</li>
							</ul>
						</div>
					</div>
				</nav>
			</div>
			</div>
		</div>
	</div>

	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.check('main-container', 'fixed')
			} catch (e) {
			}
		</script>

		<div class="main-container-inner">
			<a class="menu-toggler" id="menu-toggler" href="#"> 
				<span class="menu-text"></span>
			</a>
			<div class="sidebar" id="sidebar">
				<script type="text/javascript">
					try {
						ace.settings.check('sidebar', 'fixed')
					} catch (e) {
					}
				</script>

				<div class="sidebar-shortcuts" id="sidebar-shortcuts">
					<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
						<span class="btn btn-success"></span> <span class="btn btn-info"></span>
						<span class="btn btn-warning"></span> <span class="btn btn-danger"></span>					</div>
					</div>
					<ul class="nav nav-list">
						<li class="active">
							<a href="view/bootm.jsp" target="mainframe">
								<i class="icon-dashboard"></i> <span class="menu-text">主页 </span>
							</a>
						</li>

			    		<li>
			    			<a href="javascript:void(0)" target="mainframe" class="dropdown-toggle">
			    				<i class="icon-desktop"></i> 
			    				<span class="menu-text"> 充电桩管理 </span>
			    				<b class="arrow icon-angle-down"></b>
							</a>
							<ul class="submenu">
                            	<li>
                            		<a href="${pageContext.request.contextPath}/pile/list.action" target="mainframe">
                            			<i class="icon-double-angle-right"></i> 设备信息管理
									</a>
								</li>
                            	<li>
                            		<a href="${pageContext.request.contextPath}/pile/getParam.action" target="mainframe">
                            			<i class="icon-double-angle-right"></i>添加设备
									</a>
								</li>
							</ul>
						</li>
               			<li>
               				<a href="javascript:void(0)" target="mainframe" class="dropdown-toggle"> 
               					<i class="icon-desktop"></i> <span class="menu-text"> 会员管理 </span>
               					<b class="arrow icon-angle-down"></b>
							</a>
							<ul class="submenu">
							<li>
                            	<a href="${pageContext.request.contextPath}/user/list.action" target="mainframe">
                            		<i class="icon-double-angle-right"></i> 会员列表
								</a>
							</li>
								<li>
		                            <a href="view/user/useradd.jsp" target="mainframe">
		                            	<i class="icon-double-angle-right"></i> 添加会员
									</a>
								</li>
								<li>
								  	<a href="${pageContext.request.contextPath}/user/carlist.action" target="mainframe">
								  		<i class="icon-double-angle-right"></i> 汽车列表
								  	</a>
								 </li>
							</ul>
						</li>
						<li>
							<a href="javascript:void(0)" target="mainframe" class="dropdown-toggle">
								<i class="icon-desktop"></i> <span class="menu-text"> 订单管理 </span>
								<b class="arrow icon-angle-down"></b>
							</a>
							<ul class="submenu">
								<li>
									<a href="${pageContext.request.contextPath}/order/list.action" target="mainframe">
										<i class="icon-desktop"></i> 订单列表
									</a>
								</li>
								<li>
									<a href="${pageContext.request.contextPath}/order/chargelist.action" target="mainframe">
										<i class="icon-desktop"></i> 充值记录
									</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="javascript:void(0)" target="mainframe" class="dropdown-toggle">
								<i class="icon-desktop"></i> <span class="menu-text"> 系统管理 </span>
								<b class="arrow icon-angle-down"></b>
							</a>
							<ul class="submenu">
								<li>
									<a href="${pageContext.request.contextPath}/price/load.action" target="mainframe">
										<i class="icon-desktop"></i> 价格管理
									</a>
								</li>
								<li>
									<a href="${pageContext.request.contextPath}/address/list.action" target="mainframe">
									<i class="icon-double-angle-right"></i> 地址管理
									</a>
								</li>
								<li>
									<a href="view/address/addressadd.jsp" target="mainframe">
									<i class="icon-double-angle-right"></i> 添加地址
								</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="javascript:void(0)" target="mainframe" class="dropdown-toggle">
								<i class="icon-desktop"></i> <span class="menu-text"> 账户管理 </span>
								<b class="arrow icon-angle-down"></b>
							</a>
							<ul class="submenu">
								<li>
									<a href="${pageContext.request.contextPath}/staff/list.action" target="mainframe">
										<i class="icon-double-angle-right"></i> 员工列表
									</a>
								</li>
								<li>
									<a href="${pageContext.request.contextPath}/staff/getParam.action" target="mainframe">
										<i class="icon-double-angle-right"></i> 添加员工
									</a>
								</li>
								<li>
									<a href="${pageContext.request.contextPath}/admin/list.action" target="mainframe">
										<i class="icon-double-angle-right"></i> 管理员列表
									</a>
								</li>
								<li>
									<a href="view/admin/adminadd.jsp" target="mainframe">
										<i class="icon-double-angle-right"></i> 添加管理员
									</a>
								</li>
							</ul>

						</li>
							<li>
							<a href="javascript:void(0)" target="mainframe" class="dropdown-toggle">
								<i class="icon-desktop"></i> <span class="menu-text"> 反馈信息 </span>
								<b class="arrow icon-angle-down"></b>
							</a>
							<ul class="submenu">
								<li>
									<a href="${pageContext.request.contextPath }/feedback/stafflist.action" target="mainframe">
										<i class="icon-double-angle-right"></i> 员工反馈
									</a>
								</li>
								<li>
									<a href="${pageContext.request.contextPath }/feedback/userlist.action" target="mainframe">
										<i class="icon-double-angle-right"></i> 用户反馈
									</a>
								</li>
							</ul>
							</li>
                    </ul>
				<div class="sidebar-collapse" id="sidebar-collapse">
					<i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
				</div>

				<script type="text/javascript">
					try {
						ace.settings.check('sidebar', 'collapsed')
					} catch (e) {
					}
				</script>
			</div>

			<div class="main-content" id="mains">
				<iframe id="mainframe" name="mainframe" src="view/bootm.jsp"
					style="width: 100%;border: 0px;"> </iframe>
			</div>

			<script type="text/javascript">
				var height = jQuery(window).height() - 50;
				jQuery("#mainframe").attr("height", "" + height + "px;");
			</script>

		</div>
			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse"> 
				<i class="icon-double-angle-up icon-only bigger-110"></i>		
			</a>	
		</div>

	<script type="text/javascript">
		if ("ontouchend" in document)
			document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"
							+ "<"+"script>");
	</script>
</body>
</html>