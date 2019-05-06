<%@page import="entities.Products"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<div class="qq-title clear-fix">
	<div class="container">
		<div class="row">
			<div class="qq-page-bread">
				<ul>
					<li><a href="#" title="Trang chủ">Điện tử sáng tạo </a></li>
					<li>&rsaquo; Sản phẩm</li>
				</ul>
			</div>
			<div class="qq-title-cart">
				<strong>GIỎ HÀNG CỦA BẠN </strong><span class="extraText">( <span
					class="total">6</span> Sản phẩm )
				</span>
			</div>
		</div>
	</div>

</div>

<div class="qq-content clear-fix">
	<div class="container">
		<div class="row">
			<div class="qq-left col-xs-12 col-sm-7 col-md-8 col-lg-8">
				<div class="qq-address-order clear-fix">
					<span>
						<p class="col-xs-8 col-sm-9 col-md-10 col-lg-10">
							<i class="fa fa-map-marker" aria-hidden="true"></i> Địa chỉ nhận
							hàng
						</p>
						<p class="p2 col-xs-4 col-sm-3 col-md-2 col-lg-2">
							<a href="#">Thay đổi <i class="fa fa-caret-right"
								aria-hidden="true"></i></a>
						</p>
					</span>
					<p class="p3">
                                            <b><%= session.getAttribute("firstName")%> <%= session.getAttribute("lastName")%></b> | <%= session.getAttribute("phoneNumber")%>
					</p>
					<p class="p4"><%= session.getAttribute("address")%></p>
				</div>
				<div class="c20"></div>
				<div class="qq-box">
					<div class="table-responsive">
						<table class="table-pc-buis">
                                                    <%   float total = 0f;
                                                        String msg = (String) request.getAttribute("msg");
//                                                        if(!msg.isEmpty()){
//                                                     
//                                                        }
                                                        
                                                        if (request.getAttribute("productses") != null) {
                                                         
                                                           ArrayList<Products> al = (ArrayList) request.getAttribute("productses");
                                                           ArrayList<Integer> amounts = (ArrayList)request.getAttribute("amounts");
                                                           ArrayList<Products> productses = al;    
                                                            Products products = new Products();
                                                           
                                                      for(int i = 0; i < productses.size(); i++){
                                                          total += productses.get(i).getPrice()*amounts.get(i);
                                                    %>
							<tr class="buia" style="border-bottom: 1px solid #ccc;">
								<td class="bui1" style="padding-bottom: 5px !important;"><a
									href="#"> <img src="imgs/giohang1.png" alt=""
										style="width: 50px;"> <span><%=productses.get(i).getName()%></span>
								</a></td>
								<td class="bui2"><%=productses.get(i).getPrice()%></td>
                                                                <td class="bui3" style="width: 10%;"><input type="number" disabled="true"
                                                                                                            name="" class="form-control" value="<%=amounts.get(i)%>"></td>
                                                                <td class="bui2"><%=productses.get(i).getPrice()*amounts.get(i)%></td>
								<td class="bui4" style="padding: 0px 15px;"><a href="#">
										<i class="fa fa-trash-o" aria-hidden="true"></i>
								</a></td>
							</tr>
                                                        <%
                                                            }
}
                                                        %>


						</table>
                                                        <%  if(msg != null){
//                                                     
//                                                        %>
<span style="color: red; font-size: 20px"><%=msg%></span>
                                                        <% 
                                                        }%>

					</div>
					<!-- <div class="qq-giohang">
                                                        <div class="qq-gh-left">
                                                                
                                                        </div>
                                                        <div class="qq-gh-right">
                                                                <div class="qq-price">
                                                                        
                                                                </div>
                                                                <div class="qq-number">
                                                                        
                                                                </div>
                                                                <div class="qq-delete">
                                                                        
                                                                </div>
                                                        </div>
                                                </div> -->
					<div class="qq-descript-ship clear-fix">
						<img src="imgs/4B6MEO.png" alt=""> <span>Bạn được
							tặng 1 lần Miễn phí vận chuyển trong hôm nay.<br>Miễn phí
							vận chuyển cho đơn hàng có giá trị từ<b style="color: red;">
								149.000</b>, giảm tối đa <b style="color: #1cce4f;">30.000 VNĐ</b> (<a
							href="#">chi tiết xem tại đây</a>).<span>
					</div>
				</div>

			</div>
			<div class="qq-right col-xs-12 col-sm-5 col-md-4 col-lg-4 clear-fix"
				style="padding-top: 10px;">
				<div class="qq-ship clear-fix">
					<span>Đơn vị vận chuyển</span>
					<div class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
                                            	
					        <div class="pt-cod">
						<p>
                                                       <select> 
                                                           <option value="Quick"> <span>Chuyển phát thần tốc</span>
                                                          
                                                           <option value="Slow"><span>Chuyển phát chuẩn(chậm) </span> 
                                                            
                                                           
                                                       </select>
                                                
<!--							<img src="imgs/quang-check.png" width="10px" alt=""> Thanh
							toán khi nhận hàng<br>Phí thu :<b style="color: red">
								37,000đ</b><br>Thanh toán bằng tiền mặt khi nhận hàng-->
						</p>
					        </div>
						<img src="imgs/quang-check.png" width="10px" alt=""> Chuyển
						phát siêu chuẩn<br>
						<i style="font-size: 11px">Thời gian giao hàng : <b>3-5
								ngày</b></i>
					</div>
					<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
						Chi phí<br>
						<b style="color: red">20,000đ</b>
					</div>
				</div>

				<div class="c20"></div>

				<div class="qq-pay-method clear-fix">
					<span>Phương Thức thanh toán</span>
					<div class="pt-cod">
						<p>
                                                       <select> 
                                                           <option value="Cod"> <span>Thu hộ</span>
                                                          
                                                         
                                                            <option value="ChuyenKhoan"><span>Chuyển khoản</span> 
                                                             <option value="CreditCart"><span>Dùng thẻ creditCart</span> 
                                                           
                                                       </select>
                                                
<!--							<img src="imgs/quang-check.png" width="10px" alt=""> Thanh
							toán khi nhận hàng<br>Phí thu :<b style="color: red">
								37,000đ</b><br>Thanh toán bằng tiền mặt khi nhận hàng-->
						</p>
					</div>
					<div class="pt-payment">
						<p>
							<img src="imgs/quang-check.png" width="10px" alt=""> Thanh
							toán trực tuyến<br>Thanh toán bằng thẻ tín dụng theo hình
							thức chuyển khoản...
						</p>
					</div>
				</div>

				<div class="c20"></div>

				<div class="qq-order clear-fix">
					<div class="qq-infor clear-fix">
						<p>
							<img src="imgs/4B6MEO.png" alt=""> Chương trình miễn phí
							vận chuyển không áp dụng cho trường hợp đặt hộ.Để hưởng ưu đãi
							miễn phí vận chuyển bạn vui lòngdùng số điện thoại <b><%= session.getAttribute("phoneNumber")%></b>
							trong tài khoản để đặt và nhận hàng.<a href="#">Chi tiết
								chương trình tại đây</a>
						</p>
					</div>
					<div class="order-detail clear-fix">
						<div class="row">
							<div class="col-xs-7 col-sm-7 col-md-7 col-lg-7">
								<ul>
									<li>Tổng tiền hàng</li>
									<li>Phí vận chuyển</li>
									<li>Phí thu hộ COD</li>
									<li>SHOP hỗ trợ phí vận chuyển</li>
									<li>Sử dụng điểm SEN<br>
									<i>Bạn có <b style="color: red;">620 </b>điểm sen<br>(Nhập
											bội số của 1,000)
									</i>
									</li>
									<li class="mgs">Mã giảm giá</li>
								</ul>
							</div>
							<div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
								<ul>
                                                                    <li><b> <%=total%></b>  </li>
									<li><b>20,000đ</b></li>
									<li><b>0đ </b></li>
									<li><b>0đ</b></li>
									<li class="inp">
										<form action="">
											<input type="text" name="">
											<button type="submit">
												<i class="fa fa-long-arrow-right" aria-hidden="true"></i>
											</button>
										</form>
									</li>
									<li class="inp">
										<form action="">
											<input type="text" name="">
											<button type="submit">
												<i class="fa fa-long-arrow-right" aria-hidden="true"></i>
											</button>
										</form>
									</li>
								</ul>
							</div>
						</div>

					</div>
				</div>

				<div class="c20"></div>

				<div class="qq-note clear-fix">
					<span><i class="fa fa-sticky-note" aria-hidden="true"></i>
						Ghi chú</span>
					<textarea placeholder="Nhập thông tin ghi chú..."></textarea>
				</div>

				<div class="c20"></div>

				<div class="qq-total clear-fix">
					<div>
						<p class="p1">Tổng thanh toán</p>
						<p class="p2"><%=total+20000%></p>
					</div>
                                                <form method="post" name="form" action="<%=request.getContextPath()%>/PaymentServlet">
                                       
					<div class="button">
                                            
                                            
                                            <button type="submit" class="btn">THANH TOÁN
						</button>
					</div>
                                       </form>
				</div>
			</div>
			<div class="c20"></div>
		</div>
	</div>
</div>


<%@ include file="footer.jsp"%>