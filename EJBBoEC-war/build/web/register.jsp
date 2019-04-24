<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>--%>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>--%>
<%--<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>--%>
<%--<c:url var="actionUrl" value="/register/account" />--%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>BOEC</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<script
	src="js/jquery-3.1.1.min.js"></script>

<script src="js/boec/client/register.js"></script>
<link rel="stylesheet" type="text/css"
	href="css/font-awesome.min.css" />"
<link rel="stylesheet" type="text/css"
	href="css/bootstrap.min.css"/>"
<link rel="stylesheet" type="text/css"
	href="css/owl.carousel.min.css" />"
<link rel="stylesheet" type="text/css"
	href="css/owl.theme.default.min.css" />"
<link
	href="https://fonts.googleapis.com/css?family=Roboto:400,400i,500,500i,700,700i,900,900i&amp;subset=vietnamese"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/rangeslider.js/2.3.2/rangeslider.css">
<link rel="stylesheet" type="text/css"
	href="css/style.css" />"
<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}

.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}

#login-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
</style>
</head>

<body>
	<header class="hidden-xs hidden-sm">
		<div class="menu">
			<div class="container">
				<div class="row">
					<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
						<ul class="list-inline">
							<li><a href="#"><i class="fa fa-download"></i>Tải ứng
									dụng </a></li>
							<li><a href="#">Chăm sóc khách hàng</a></li>
							<li><a href="/serverptit/ordertrace">Kiểm tra đơn hàng</a></li>
						</ul>
					</div>
					<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 ">
						<ul class="list-inline pull-right">
                                                    <li><a href="index.jsp" class="login"><i
									class="fa fa-user-circle"></i>Đăng nhập</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!--    end row menu -->
		<div class="menu-search">
			<div class="container">
				<div class="row">
					<div class="col-xs-12 col-sm-4 col-md-3 col-lg-3">
						<div class="logo-wrapper">
							<div class="row">
								<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
									<div class="logo-head">
										<a href="/serverptit"><img src="resources/imgs/lhk.png"
											alt=""></a>
									</div>
								</div>
								<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
									<div class="cd-dropdown-wrapper">
										<a class="cd-dropdown-trigger" href="#0"><i
											class="fa fa-list"></i></a>
										<nav class="cd-dropdown">
											<h1 class="home-title hidden-md hidden-lg">Điện tử sáng
												tạo</h1>
											<!-- check nếu ở trang chủ thì để h1 còn không phải thì để h2 -->
											<a href="#0" class="cd-close">Close</a>
											<ul class="cd-dropdown-content">
												<li class="has-children"><a href="#">Link kiện điện
														tử</a>
													<ul class="cd-secondary-dropdown is-hidden">
														<li class="go-back"><a href="#0">Menu</a></li>
														<li class="has-children"><a href="#">Ic</a>
															<ul class="is-hidden">
																<li class="go-back"><a href="#0">Quay lại</a></li>
																<li class="see-all"><a href="#">Tất cả</a></li>
																<li class="has-children"><a href="#0">IC 2</a>
																	<ul class="is-hidden">
																		<li class="go-back"><a href="#0">Quay lại 2</a></li>
																		<li class="see-all"><a href="#">All Benies</a></li>
																		<li><a href="#">Caps &amp; Hats</a></li>
																		<li><a href="#">Gifts</a></li>
																		<li><a href="#">Scarves &amp; Snoods</a></li>
																	</ul></li>
																<li class="has-children"><a href="#0">Caps
																		&amp; Hats</a>
																	<ul class="is-hidden">
																		<li class="go-back"><a href="#0">Accessories</a></li>
																		<li class="see-all"><a href="#">All Caps
																				&amp; Hats</a></li>
																		<li><a href="#">Beanies</a></li>
																		<li><a href="#">Caps</a></li>
																		<li><a href="#">Hats</a></li>
																	</ul></li>
																<li><a href="#">Glasses</a></li>
																<li><a href="#">Gloves</a></li>
																<li><a href="#">Jewellery</a></li>
																<li><a href="#">Scarves</a></li>
															</ul></li>
														<li class="has-children"><a href="#">Bottoms</a>
															<ul class="is-hidden">
																<li class="go-back"><a href="#0">Clothing</a></li>
																<li class="see-all"><a href="#">All Bottoms</a></li>
																<li><a href="#">Casual Trousers</a></li>
																<li class="has-children"><a href="#0">Jeans</a>
																	<ul class="is-hidden">
																		<li class="go-back"><a href="#0">Bottoms</a></li>
																		<li class="see-all"><a href="#">All Jeans</a></li>
																		<li><a href="#">Ripped</a></li>
																		<li><a href="#">Skinny</a></li>
																		<li><a href="#">Slim</a></li>
																		<li><a href="#">Straight</a></li>
																	</ul></li>
																<li><a href="#0">Leggings</a></li>
																<li><a href="#0">Shorts</a></li>
															</ul></li>
														<li class="has-children"><a href="#">Jackets</a>
															<ul class="is-hidden">
																<li class="go-back"><a href="#0">Clothing</a></li>
																<li class="see-all"><a href="#">All Jackets</a></li>
																<li><a href="#">Blazers</a></li>
																<li><a href="#">Bomber jackets</a></li>
																<li><a href="#">Denim Jackets</a></li>
																<li><a href="#">Duffle Coats</a></li>
																<li><a href="#">Leather Jackets</a></li>
																<li><a href="#">Parkas</a></li>
															</ul></li>
														<li class="has-children"><a href="#">Tops</a>
															<ul class="is-hidden">
																<li class="go-back"><a href="#0">Clothing</a></li>
																<li class="see-all"><a href="#">All Tops</a></li>
																<li><a href="#">Cardigans</a></li>
																<li><a href="#">Coats</a></li>
																<li><a href="#">Polo Shirts</a></li>
																<li><a href="#">Shirts</a></li>
																<li class="has-children"><a href="#0">T-Shirts</a>
																	<ul class="is-hidden">
																		<li class="go-back"><a href="#0">Tops</a></li>
																		<li class="see-all"><a href="#">All T-shirts</a></li>
																		<li><a href="#">Plain</a></li>
																		<li><a href="#">Print</a></li>
																		<li><a href="#">Striped</a></li>
																		<li><a href="#">Long sleeved</a></li>
																	</ul></li>
																<li><a href="#">Vests</a></li>
															</ul></li>
													</ul> <!-- .cd-secondary-dropdown --></li>
												<!-- .has-children -->
												<li class="has-children"><a href="#">Gallery</a>
													<ul class="cd-secondary-dropdown is-hidden">
														<li class="go-back"><a href="#0">Menu</a></li>
														<li class="has-children"><a href="#">Ic</a>
															<ul class="is-hidden">
																<li class="go-back"><a href="#0">Quay lại</a></li>
																<li class="see-all"><a href="#">Tất cả</a></li>
																<li class="has-children"><a href="#0">IC 2</a>
																	<ul class="is-hidden">
																		<li class="go-back"><a href="#0">Quay lại 2</a></li>
																		<li class="see-all"><a href="#">All Benies</a></li>
																		<li><a href="#">Caps &amp; Hats</a></li>
																		<li><a href="#">Gifts</a></li>
																		<li><a href="#">Scarves &amp; Snoods</a></li>
																	</ul></li>
																<li class="has-children"><a href="#0">Caps
																		&amp; Hats</a>
																	<ul class="is-hidden">
																		<li class="go-back"><a href="#0">Accessories</a></li>
																		<li class="see-all"><a href="#">All Caps
																				&amp; Hats</a></li>
																		<li><a href="#">Beanies</a></li>
																		<li><a href="#">Caps</a></li>
																		<li><a href="#">Hats</a></li>
																	</ul></li>
																<li><a href="#">Glasses</a></li>
																<li><a href="#">Gloves</a></li>
																<li><a href="#">Jewellery</a></li>
																<li><a href="#">Scarves</a></li>
															</ul></li>
														<li class="has-children"><a href="#">Bottoms</a>
															<ul class="is-hidden">
																<li class="go-back"><a href="#0">Clothing</a></li>
																<li class="see-all"><a href="#">All Bottoms</a></li>
																<li><a href="#">Casual Trousers</a></li>
																<li class="has-children"><a href="#0">Jeans</a>
																	<ul class="is-hidden">
																		<li class="go-back"><a href="#0">Bottoms</a></li>
																		<li class="see-all"><a href="#">All Jeans</a></li>
																		<li><a href="#">Ripped</a></li>
																		<li><a href="#">Skinny</a></li>
																		<li><a href="#">Slim</a></li>
																		<li><a href="#">Straight</a></li>
																	</ul></li>
																<li><a href="#0">Leggings</a></li>
																<li><a href="#0">Shorts</a></li>
															</ul></li>
														<li class="has-children"><a href="#">Jackets</a>
															<ul class="is-hidden">
																<li class="go-back"><a href="#0">Clothing</a></li>
																<li class="see-all"><a href="#">All Jackets</a></li>
																<li><a href="#">Blazers</a></li>
																<li><a href="#">Bomber jackets</a></li>
																<li><a href="#">Denim Jackets</a></li>
																<li><a href="#">Duffle Coats</a></li>
																<li><a href="#">Leather Jackets</a></li>
																<li><a href="#">Parkas</a></li>
															</ul></li>
														<li class="has-children"><a href="#">Tops</a>
															<ul class="is-hidden">
																<li class="go-back"><a href="#0">Clothing</a></li>
																<li class="see-all"><a href="#">All Tops</a></li>
																<li><a href="#">Cardigans</a></li>
																<li><a href="#">Coats</a></li>
																<li><a href="#">Polo Shirts</a></li>
																<li><a href="#">Shirts</a></li>
																<li class="has-children"><a href="#0">T-Shirts</a>
																	<ul class="is-hidden">
																		<li class="go-back"><a href="#0">Tops</a></li>
																		<li class="see-all"><a href="#">All T-shirts</a></li>
																		<li><a href="#">Plain</a></li>
																		<li><a href="#">Print</a></li>
																		<li><a href="#">Striped</a></li>
																		<li><a href="#">Long sleeved</a></li>
																	</ul></li>
																<li><a href="#">Vests</a></li>
															</ul></li>
													</ul> <!-- .cd-secondary-dropdown --></li>
												<!-- .has-children -->
												<li class="has-children"><a href="#">Services</a>
													<ul class="cd-secondary-dropdown is-hidden">
														<li class="go-back"><a href="#0">Menu</a></li>
														<li class="has-children"><a href="#">Ic</a>
															<ul class="is-hidden">
																<li class="go-back"><a href="#0">Quay lại</a></li>
																<li class="see-all"><a href="#">Tất cả</a></li>
																<li class="has-children"><a href="#0">IC 2</a>
																	<ul class="is-hidden">
																		<li class="go-back"><a href="#0">Quay lại 2</a></li>
																		<li class="see-all"><a href="#">All Benies</a></li>
																		<li><a href="#">Caps &amp; Hats</a></li>
																		<li><a href="#">Gifts</a></li>
																		<li><a href="#">Scarves &amp; Snoods</a></li>
																	</ul></li>
																<li class="has-children"><a href="#0">Caps
																		&amp; Hats</a>
																	<ul class="is-hidden">
																		<li class="go-back"><a href="#0">Accessories</a></li>
																		<li class="see-all"><a href="#">All Caps
																				&amp; Hats</a></li>
																		<li><a href="#">Beanies</a></li>
																		<li><a href="#">Caps</a></li>
																		<li><a href="#">Hats</a></li>
																	</ul></li>
																<li><a href="#">Glasses</a></li>
																<li><a href="#">Gloves</a></li>
																<li><a href="#">Jewellery</a></li>
																<li><a href="#">Scarves</a></li>
															</ul></li>
														<li class="has-children"><a href="#">Jackets</a>
															<ul class="is-hidden">
																<li class="go-back"><a href="#0">Clothing</a></li>
																<li class="see-all"><a href="#">All Jackets</a></li>
																<li><a href="#">Blazers</a></li>
																<li><a href="#">Bomber jackets</a></li>
																<li><a href="#">Denim Jackets</a></li>
																<li><a href="#">Duffle Coats</a></li>
																<li><a href="#">Leather Jackets</a></li>
																<li><a href="#">Parkas</a></li>
															</ul></li>
														<li class="has-children"><a href="#">Tops</a>
															<ul class="is-hidden">
																<li class="go-back"><a href="#0">Clothing</a></li>
																<li class="see-all"><a href="#">All Tops</a></li>
																<li><a href="#">Cardigans</a></li>
																<li><a href="#">Coats</a></li>
																<li><a href="#">Polo Shirts</a></li>
																<li><a href="#">Shirts</a></li>
																<li class="has-children"><a href="#0">T-Shirts</a>
																	<ul class="is-hidden">
																		<li class="go-back"><a href="#0">Tops</a></li>
																		<li class="see-all"><a href="#">All T-shirts</a></li>
																		<li><a href="#">Plain</a></li>
																		<li><a href="#">Print</a></li>
																		<li><a href="#">Striped</a></li>
																		<li><a href="#">Long sleeved</a></li>
																	</ul></li>
																<li><a href="#">Vests</a></li>
															</ul></li>
													</ul> <!-- .cd-secondary-dropdown --></li>
												<!-- .has-children -->
											</ul>
											<!-- .cd-dropdown-content -->
										</nav>
										<!-- .cd-dropdown -->
									</div>
									<!-- .cd-dropdown-wrapper -->
								</div>
							</div>
						</div>


					</div>
					<div class="col-xs-10 col-sm-7 col-md-8 col-lg-8">
						<div class="search">
							<div class="input-group">
								<input type="search" class="form-control"
									placeholder="Nhập tên sản phẩm hoặc mã sản phẩm bạn muốn tìm kiếm...">
								<span class="input-group-btn"> <a
									href="/serverptit/search">
										<button class="btn btn-warning" type="button">
											<span class="glyphicon glyphicon-search" aria-hidden="true">
											</span> Tìm kiếm
										</button>
								</a>
								</span>
							</div>
						</div>
					</div>
					<div class="col-xs-2 col-sm-1 col-md-1 col-lg-1">
						<div class="cart pull-right">
							<a href="/serverptit/giohang"><i class="fa fa-shopping-cart"></i></a>
						</div>
					</div>
				</div>
			</div>
			<!-- end container menu-search -->
		</div>
	</header>
	<!-- end header -->
	<header class="hidden-lg hidden-md">
		<div class="menu-xs">
			<div class="container">
				<div class="row">
					<div class="col-xs-2 col-sm-2">
						<div class="logo-xs">
							<a href="#"><img src="resources/imgs/logo-trang.png" alt=""></a>
						</div>
					</div>
					<div class="col-xs-9 col-sm-9">
						<div class="search">
							<div class="input-group">
								<input type="search" class="form-control"
									placeholder="Nhập nội dung tìm kiếm..."> <span
									class="input-group-btn">
									<button class="btn btn-warning" type="button">
										<span class="glyphicon glyphicon-search" aria-hidden="true">
										</span>
									</button>
								</span>
							</div>
						</div>
					</div>
					<div class="col-sm-1 col-xs-1">
						<div class="pull-right logo-icon-xs">
							<a href="#"><i class="fa fa-fire" aria-hidden="true"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	<!-- /header -->

	<div class="content-wrapper">

		<div class="container">
			<div class="content-custom">
				<h1>Chào mừng bạn đến với LHK Market</h1>
				<form:form method="POST" action="${actionUrl}"
					modelAttribute="registerForm" name="registerForm">
					<div class="row">
						<div>
							<div class="form-group">
								<form:label path="customer">Fistname: </form:label>
								<input type="text" path="customer" class="form-control"
									id="firstname" name="firstname" />
								<form:errors path="customer" cssClass="error" />
							</div>
							<div class="form-group">
								<form:label path="customer">Lastname:</form:label>
								<input type="text" class="form-control" id="lastname"
									path="customer" name="lastname" />
								<form:errors path="customer" cssClass="error" />
							</div>


							<div class="form-group">
								<form:label path="city">Address:</form:label>
								<input type="text" path="city" class="form-control"
									id="city" name="city" />
								<form:errors path="city" cssClass="error" />
							</div>
							<div class="form-group">
								<form:label path="customer">Email: </form:label>
								<input type="text" path="customer" class="form-control"
									id="email" name="email" />
								<form:errors path="customer" cssClass="error" />
							</div>
							<div class="form-group">
								<form:label path="customer">Username: </form:label>
								<input type="text" path="customer" class="form-control"
									id="username" name="username" />
								<form:errors path="customer" cssClass="error" />
							</div>
							<div class="form-group">
								<form:label path="customer">Password: </form:label>
								<input type="password" path="customer" class="form-control"
									id="password" name="password" />
								<form:errors path="customer" cssClass="error" />
							</div>
						</div>
						<div class="button-login">
							<form:button type="submit" id="btnRegister" class="btn btn-login">Đăng
							ký</form:button>
						</div>

					</div>
				</form:form>
				
			</div>
		</div>
	</div>
	<%@ include file="/footer.jsp"%>