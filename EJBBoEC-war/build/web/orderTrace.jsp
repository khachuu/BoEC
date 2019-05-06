<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="headerOrderTrace.jsp"%>
<div class="container">
	<div class="row">
		<ol class="breadcrumb">
			<li><a href="#">Home</a></li>
			<li><a href="#">Library</a></li>
			<li class="active">Data</li>
		</ol>
		<div class="cart-content">
			<div class="col-xs-12 col-sm-4 col-md-3 col-lg-3">
				<div class="profile">
					<img
						src="https://media3.scdn.vn/img3/2019/3_1/u2025929059_simg_8b3ef4_40x40_maxb.jpg"
						alt="">
					<p>Bùi Đô</p>
					<small><a href="#">Chỉnh sửa tài khoản</a></small>
					<button class="btn btn-show-menu hidden-md hidden-lg">
						<i class="fa fa-bars"></i>
					</button>
				</div>
				<!-- end profile -->
				<div class="box-ql">
					<div class="bo-list">
						<h3>Quản lý giao dịch</h3>
					</div>
					<ul>
						<li><i class="glyphicon glyphicon-list-alt"></i><a href="#">Đơn
								hàng</a></li>
						<li><i class="glyphicon glyphicon-user"></i><a href="#">Tài
								khoản senpay</a></li>
						<li><i class="glyphicon glyphicon-map-marker"></i><a
							href="user-diachinhanhang.jsp">Địa chỉ nhận hàng</a></li>
						<li><i class="glyphicon glyphicon-heart"></i><a
							href="user-sanphamyeuthich.jsp">Sản phẩm yêu thích</a></li>
					</ul>
					<div class="bo-list">
						<h3>Quản lý tài khoản</h3>
						<ul>
							<li><i class="glyphicon glyphicon-edit"></i><a href="#">Thông
									tin tài khoản</a></li>
							<li><i class="glyphicon glyphicon-usd"></i><a href="#">Ví
									tiền SEN</a></li>
							<li><i class="glyphicon glyphicon-envelope"></i><a href="#">Hộp
									thư</a></li>
							<li><i class="glyphicon glyphicon-heart"></i><a href="#">Shop
									yêu thích</a></li>
							<li><i class="glyphicon glyphicon-qrcode"></i><a href="#">Mã
									giảm giá của bạn</a></li>
							<li><i class="glyphicon glyphicon-comment"></i><a href="#">Hỏi
									đáp</a></li>
							<li><i class="glyphicon glyphicon-link"></i><a href="#">Liên
									kết mạng xã hội</a></li>
						</ul>
					</div>
				</div>
				<!-- end box-ql -->
			</div>
			<div class="col-xs-12 col-sm-8 col-md-9 col-lg-9">
				<div class="box-content">
					<h2>Quản lý đơn hàng</h2>
					<div class="thongke">
						<div class="form-group">
							<select class="form-control" id="sel1">
								<option>Trong 30 ngày</option>
								<option>Tất cả</option>
								<option>7 ngày</option>
								<option>1 năm</option>
							</select>
						</div>
					</div>
					<div>
						<!-- Nav tabs -->
						<ul class="nav nav-tabs" role="tablist">
							<li role="presentation" class="active"><a href="#home"
								aria-controls="home" role="tab" data-toggle="tab">Chờ xác
									nhận</a></li>
							<li role="presentation"><a href="#profile"
								aria-controls="profile" role="tab" data-toggle="tab">Đã xác
									nhận</a></li>
							<li role="presentation"><a href="#messages"
								aria-controls="messages" role="tab" data-toggle="tab">Đang
									vận chuyển</a></li>
							<li role="presentation"><a href="#settings"
								aria-controls="settings" role="tab" data-toggle="tab">Đã
									giao hàng</a></li>
							<li role="presentation"><a href="#cancel"
								aria-controls="settings" role="tab" data-toggle="tab">Hủy</a></li>
						</ul>


						<!-- Tab panes -->
						<div class="tab-content">
							<div role="tabpanel" class="tab-pane active" id="home">Bạn
								chưa có đơn hàng trong 30 ngày gần đây. Xem tất cả đơn hàng của
								bạn</div>
							<div role="tabpanel" class="tab-pane" id="profile">...</div>
							<div role="tabpanel" class="tab-pane" id="messages">...</div>
							<div role="tabpanel" class="tab-pane" id="settings">...</div>
							<div role="tabpanel" class="tab-pane" id="cancel">...</div>
						</div>
					</div>
				</div>
				<!-- end box content -->
			</div>
		</div>
	</div>
</div>
<%--<%@ include file="footer.jsp"%>--%>