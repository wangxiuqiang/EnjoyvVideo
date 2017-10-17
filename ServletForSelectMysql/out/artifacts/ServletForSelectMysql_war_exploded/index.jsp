<%@ page import="test.ti" %><%--
  Created by IntelliJ IDEA.
  User: wangxiuqiang
  Date: 17-10-14
  Time: 下午9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>请选择</title>
  </head>
  <body>
   <%
     ti ti = new ti();
     request.setCharacterEncoding("UTF-8");
     String name = new String(request.getParameter("name").getBytes("ISO8859-1"),"UTF-8");
     ti.setName(name);
     request.setAttribute("ti", name);
     request.getRequestDispatcher("/Servlet/selectServlet").forward(request,response);
        %>
   <%=name%>
  <%--<a href="Servlet/selectServlet" > 跳转 </a>--%>
  </body>
</html>
