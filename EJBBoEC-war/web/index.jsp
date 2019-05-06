<%@page contentType="text/html" pageEncoding="UTF-8"
    %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%@ include file="header.jsp"%>
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
<div class="content-wrapper"
     onload='document.loginForm.username.focus();'>

  <div class="container">
    <div class="content-custom">
      <h1>Chào Mừng đến với  LHK Market</h1>
   
      <form name="form" action="<%=request.getContextPath()%>
/LoginServlet" method="post">
        <div class="row">
          <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
            <div class="form-group">
              <label for="">Tài Khoản</label> <input type="text"
                                                         class="form-control" id="username" name="username">
            </div>
            <div class="form-group">
              <label for="">Mật Khẩu</label> <input type="password"
                                                    class="form-control" id="password" name="password">
              <div class="get-pass">
                <a href ="register.jsp">Đăng Ký?</a>
                
              </div>
            </div>
            <div class="form-group">
              <c:if test="${not empty error}">
                <div class="error">${error}</div>
              </c:if>
              <c:if test="${not empty msg}">
                <div class="msg">${msg}</div>
              </c:if>
            </div>
          </div>
          <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
            <div class="button-login">

              <button type="submit" id="btnDangNhap" class="btn btn-login">Đăng Nhập</button>
              <button type="button" class="btn btn-fb" id="btnDangNhapFB">
                <i class="fa fa-facebook"></i> Facebook
              </button>
              <button type="button" class="btn btn-gg" id="btnDangNhapGG">
                <i class="fa fa-google"></i> Google
              </button>
            </div>
          </div>
          <div>
            <input type="hidden" name="${_csrf.parameterName}"
                   value="${_csrf.token}" />
          </div>

        </div>
      </form>
    </div>
  </div>
</div>
<%@ include file="/footer.jsp"%>

