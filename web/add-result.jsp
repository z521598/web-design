<%--
  Created by IntelliJ IDEA.
  User: zhaodonghui
  Date: 2022/2/23
  Time: 12:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello,加法</title>
</head>
<body>
<%=Integer.parseInt(request.getParameter("a")) + Integer.parseInt(request.getParameter("b"))  %>

</body>
</html>
