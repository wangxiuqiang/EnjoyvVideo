<%@ page import="test.ti" %><%--
  Created by IntelliJ IDEA.
  User: wangxiuqiang
  Date: 17-10-15
  Time: 上午10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示</title>
</head>
<body>
     <%
         ti ti = (ti)request.getAttribute("ti");
     %>

<%=ti.getName()%>
</body>
</html>
