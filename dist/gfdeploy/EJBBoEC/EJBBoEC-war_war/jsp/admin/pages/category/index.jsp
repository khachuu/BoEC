
<%@ page contentType="text/html" pageEncoding="UTF-8"
	errorPage="../pages/examples/404.jsp"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Data Tables</title>
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<link rel="stylesheet"
	href="../resources/bower_components/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="../resources/bower_components/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="../resources/bower_components/Ionicons/css/ionicons.min.css">
<link rel="stylesheet" href="../resources/dist/css/AdminLTE.min.css">
<link rel="stylesheet"
	href="../resources/dist/css/skins/_all-skins.min.css">
<link rel="stylesheet"
	href="../resources/bower_components/datatables.net-bs/css/dataTables.bootstrap.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">



</head>
<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">
		<%@ include file="../mainheader.jsp"%>
		<%@ include file="../sidebar.jsp"%>
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>Category</h1>
				<ol class="breadcrumb">
					<li><a href="/serverptit/admin"><i class="fa fa-dashboard"></i>
							Home</a></li>
					<li class="active">Manager Category</li>
				</ol>
			</section>
			<!-- Main content -->
			<section class="content">
				<div class="box">
					<div class="box-header">
						<button class="btn btn-info">
								<i class="glyphicon glyphicon-plus-sign">Add</i>
						</button>
					</div>
					<div class="box-body">
						<table id="table_id" class="table table-striped" cellspacing="0"
							width="100%">
							<thead>
								<tr>
									<th>ID</th>
									<th>Name</th>
									<th>Priority</th>
									<th>ROLES</th>
									<th>Edit</th>
									<th>Delete</th>
								</tr>
							</thead>
							<tbody id="tbodyContent1">

							</tbody>
						</table>
					</div>
				</div>
			</section>
			<!-- Main row -->
		</div>
	</div>
	<%@ include file="../footer.jsp"%>
	<script src="../resources/bower_components/jquery/dist/jquery.min.js"></script>
	<script src="../resources/bower_components/jquery-ui/jquery-ui.min.js"></script>
	<script>
		$.widget.bridge('uibutton', $.ui.button);
	</script>

	<script
		src="../resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	<script src="../resources/bower_components/raphael/raphael.min.js"></script>
	<script src="../resources/bower_components/morris.js/morris.min.js"></script>
	<script
		src="../resources/bower_components/jquery-sparkline/dist/jquery.sparkline.min.js"></script>
	<script
		src="../resources/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
	<script
		src="../resources/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
	<script
		src="../resources/bower_components/jquery-knob/dist/jquery.knob.min.js"></script>
	<script src="../resources/bower_components/moment/min/moment.min.js"></script>
	<script
		src="../resources/bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
	<script
		src="../resources/bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
	<script
		src="../resources/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
	<script
		src="../resources/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="../resources/bower_components/fastclick/lib/fastclick.js"></script>
	<script src="../resources/dist/js/adminlte.min.js"></script>
	<script src="../resources/dist/js/pages/dashboard.js"></script>
	<script
		src="../resources/bower_components/datatables.net/js/jquery.dataTables.min.js"></script>
	<script
		src="../resources/bower_components/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
	<script src="../resources/dist/js/demo.js"></script>
	<script src="../resources/js/boec/admin/category.js"></script>
</body>
</html>