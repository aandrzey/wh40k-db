<%--
  Created by IntelliJ IDEA.
  User: Andrzej
  Date: 20.11.2019
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p1>Hello</p1>

<form action="${pageContext.request.contextPath}/download/all">
    <input type="submit" value="Download Source XMLs">
</form>

<form action="${pageContext.request.contextPath}/load/tau">
    <input type="submit" value="Load Tau Data">
</form>

</body>
</html>
