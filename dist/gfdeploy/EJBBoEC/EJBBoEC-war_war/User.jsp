<%@page contentType="text/html" pageEncoding="UTF-8"
    %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: right"><a href="<%=request.getContextPath()%>/LogoutServlet">Logout</a></div>
<td>Lay Username trong session : </td>
<td><input disabled="true" type="text" value="<%= session.getAttribute("userName") %>" /></td>
<td>Lay Role trong session : </td>
<td><input disabled="true" type="text" value="<%= session.getAttribute("role") %>" /></td>
<h1>Day la trang User thuong</h1>

</body>
</html>