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
<%
    String a = request.getParameter("a");
    String b = request.getParameter("b");
    try {
        Integer a1 = Integer.parseInt(a);
        Integer b1 = Integer.parseInt(b);
        request.getRequestDispatcher("add-result.jsp").forward(request, response);
    } catch (Exception e) {
        response.sendRedirect("error.jsp?msg=a/b_is_null");
    }
%>

</body>
</html>
