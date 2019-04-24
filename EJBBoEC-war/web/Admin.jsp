
<%@page contentType="text/html" pageEncoding="UTF-8"
    %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center"><a href="<%=request.getContextPath()%>/LogoutServlet">Logout</a></div>
<td>Lay Username trong session : </td>
<td><input disabled="true" type="text" value="${userName}" /></td>
<td>Lay role trong session : </td>
<td><input disabled="true" type="text" value="${role}" /></td>
<h1>Day la trang Admin</h1>

</body>
</html>
