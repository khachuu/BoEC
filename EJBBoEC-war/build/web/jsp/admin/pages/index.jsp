<%@ page contentType="text/html" pageEncoding="UTF-8"
	errorPage="../pages/examples/404.jsp"%>
<%@page session="true"%>
<%@ include file="../pages/header.jsp"%>

<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">

		<header class="main-header">
			<!-- Logo -->
			<a href="/serverptit/admin" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
				<span class="logo-mini"><b>A</b>LT</span> <!-- logo for regular state and mobile devices -->
				<span class="logo-lg"><b>Admin</b>BOEC</span>
			</a>
			<!-- Header Navbar: style can be found in header.less -->
			<nav class="navbar navbar-static-top">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="push-menu"
					role="button"> <span class="sr-only">Toggle navigation</span>
				</a>
				<div class="navbar-custom-menu">
					<ul class="nav navbar-nav">
						<!-- User Account: style can be found in dropdown.less -->
						<li class="dropdown user user-menu"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown"> <img
								src="resources/dist/img/user2-160x160.jpg" class="user-image"
								alt="User Image"> <span class="hidden-xs">KienBT</span>
						</a>
							<ul class="dropdown-menu">
								<!-- User image -->
								<li class="user-header"><img
									src="resources/dist/img/user2-160x160.jpg" class="img-circle"
									alt="User Image">
									<p>KIENBT - PTIT</p></li>
								<!-- Menu Footer-->
								<li class="user-footer">
									<div class="pull-left">
										<a href="#" class="btn btn-default btn-flat">Profile</a>
									</div>
									<div class="pull-right">
										<a href="/serverptit/logout" class="btn btn-default btn-flat">Sign
											out</a>
									</div>
								</li>
							</ul></li>
						<!-- Control Sidebar Toggle Button -->

					</ul>
				</div>
			</nav>
		</header>

		<aside class="main-sidebar">
			<!-- sidebar: style can be found in sidebar.less -->
			<section class="sidebar">
				<!-- Sidebar user panel -->
				<div class="user-panel">
					<div class="pull-left image">
						<img src="resources/dist/img/user2-160x160.jpg" class="img-circle"
							alt="User Image">
					</div>
					<div class="pull-left info">
						<p>BTK</p>
						<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
					</div>
				</div>
				<!-- search form -->
				<form action="#" method="get" class="sidebar-form">
					<div class="input-group">
						<input type="text" name="q" class="form-control"
							placeholder="Search..."> <span class="input-group-btn">
							<button type="submit" name="search" id="search-btn"
								class="btn btn-flat">
								<i class="fa fa-search"></i>
							</button>
						</span>
					</div>
				</form>
				<!-- /.search form -->
				<!-- sidebar menu: : style can be found in sidebar.less -->
				<ul class="sidebar-menu" data-widget="tree">
					<li class="header">MENU</li>
					<li class="active treeview"><a href="/admin"> <i
							class="fa fa-dashboard"></i> <span>Dashboard</span>
					</a></li>
					<li><a href="/serverptit/admin/order"> <i
							class="fa fa-table"></i><span>Order List</span>
					</a></li>
					<li>
					<a href="/serverptit/admin/product"> <i
							class="fa fa-edit"></i><span>Product</span> <span
							class="pull-right-container"> <i
								class="fa fa-angle-left pull-right"></i></span>
					</a>
					</li>
					<li><a href="/serverptit/admin/category"> <i
							class="fa fa-folder"></i><span>Category</span>
					</a></li>
					<li><a href="/serverptit/admin/news"> <i
							class="fa fa-edit"></i><span>News Info</span>
					</a></li>
					<li><a href="/serverptit/admin/shipping"> <i
							class="fa fa-table"></i><span>Shipping</span>
					</a></li>
					<li><a href="/serverptit/admin/app"> <i
							class="fa fa-folder"></i><span>App</span>
					</a></li>
					<li><a href="/serverptit/admin/account"> <i
							class="fa fa-edit"></i><span>Settings</span>
					</a></li>
					<li><a href="/serverptit/admin/about"> <i
							class="fa fa-table"></i><span>About</span>
					</a></li>
				</ul>
			</section>
			<!-- /.sidebar -->
		</aside>
		<!-- Left side column. contains the logo and sidebar -->

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>Dashboard</h1>
				<ol class="breadcrumb">
					<li><a href="/serverptit/admin"><i class="fa fa-dashboard"></i>
							Home</a></li>
					<li class="active">Dashboard</li>
				</ol>
			</section>
			<!-- Main content -->
			<section class="content">
				<!-- Small boxes (Stat box) -->
				<div class="row">
					<div class="col-lg-3 col-xs-6">
						<!-- small box -->
						<div class="small-box bg-aqua">
							<div class="inner" style="text-align: center">
								<h3>Setting</h3>
							</div>

							<a href="/serverptit/admin/account" class="small-box-footer">More
								info <i class="fa fa-arrow-circle-right"></i>
							</a>
						</div>
					</div>
					<!-- ./col -->
					<div class="col-lg-3 col-xs-6">
						<!-- small box -->
						<div class="small-box bg-aqua">
							<div class="inner" style="text-align: center">
								<h3>Order</h3>
							</div>

							<a href="/serverptit/admin/order" class="small-box-footer">More
								info <i class="fa fa-arrow-circle-right"></i>
							</a>
						</div>
					</div>
					<!-- ./col -->
					<div class="col-lg-3 col-xs-6">
						<!-- small box -->
						<div class="small-box bg-aqua">
							<div class="inner" style="text-align: center">
								<h3>Product</h3>
							</div>

							<a href="/serverptit/admin/product" class="small-box-footer">More
								info <i class="fa fa-arrow-circle-right"></i>
							</a>
						</div>
					</div>
					<!-- ./col -->
					<div class="col-lg-3 col-xs-6">
						<!-- small box -->
						<div class="small-box bg-aqua">
							<div class="inner" style="text-align: center">
								<h3>Category</h3>
							</div>

							<a href="/serverptit/admin/category" class="small-box-footer">More
								info <i class="fa fa-arrow-circle-right"></i>
							</a>
						</div>
					</div>
					<!-- ./col -->
					<div class="col-lg-3 col-xs-6">
						<!-- small box -->
						<div class="small-box bg-aqua">
							<div class="inner" style="text-align: center">
								<h3>News</h3>
							</div>

							<a href="/serverptit/admin/new" class="small-box-footer">More
								info <i class="fa fa-arrow-circle-right"></i>
							</a>
						</div>
					</div>
					<div class="col-lg-3 col-xs-6">
						<!-- small box -->
						<div class="small-box bg-aqua">
							<div class="inner" style="text-align: center">
								<h3>Shipping</h3>
							</div>

							<a href="/serverptit/admin/shipping" class="small-box-footer">More
								info <i class="fa fa-arrow-circle-right"></i>
							</a>
						</div>
					</div>
					<div class="col-lg-3 col-xs-6">
						<!-- small box -->
						<div class="small-box bg-aqua">
							<div class="inner" style="text-align: center">
								<h3>App</h3>
							</div>

							<a href="/serverptit/admin/app" class="small-box-footer">More
								info <i class="fa fa-arrow-circle-right"></i>
							</a>
						</div>
					</div>
				</div>
				<!-- /.row -->
			</section>
			<!-- Main row -->
		</div>
	</div>
	<!-- /.content-wrapper -->
	<%@ include file="../pages/footer.jsp"%>
	<!-- ./wrapper -->
	<!-- jQuery 3 -->
	<script src="resources/bower_components/jquery/dist/jquery.min.js"></script>
	<!-- jQuery UI 1.11.4 -->
	<script src="resources/bower_components/jquery-ui/jquery-ui.min.js"></script>
	<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
	<script>
		$.widget.bridge('uibutton', $.ui.button);
	</script>
	<!-- Bootstrap 3.3.7 -->
	<script
		src="resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- Morris.js charts -->
	<script src="resources/bower_components/raphael/raphael.min.js"></script>
	<script src="resources/bower_components/morris.js/morris.min.js"></script>
	<!-- Sparkline -->
	<script
		src="resources/bower_components/jquery-sparkline/dist/jquery.sparkline.min.js"></script>
	<!-- jvectormap -->
	<script
		src="resources/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
	<script
		src="resources/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
	<!-- jQuery Knob Chart -->
	<script
		src="resources/bower_components/jquery-knob/dist/jquery.knob.min.js"></script>
	<!-- daterangepicker -->
	<script src="resources/bower_components/moment/min/moment.min.js"></script>
	<script
		src="resources/bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
	<!-- datepicker -->
	<script
		src="resources/bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
	<!-- Bootstrap WYSIHTML5 -->
	<script
		src="resources/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
	<!-- Slimscroll -->
	<script
		src="resources/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<!-- FastClick -->
	<script src="resources/bower_components/fastclick/lib/fastclick.js"></script>
	<!-- AdminLTE App -->
	<script src="resources/dist/js/adminlte.min.js"></script>
	<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
	<script src="resources/dist/js/pages/dashboard.js"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="resources/dist/js/demo.js"></script>

</body>
</html>