<%@page import ="def.Bean"%>
<%@page import ="helloPackage.HelloServlet"%>
<%@page import ="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/style.css">
</head>
<body>

 

<%ArrayList<Bean> beans = (ArrayList<Bean>)request.getAttribute("beans");%>

<table border = "1">

<form action = "HelloServlet" method = "post">

<tr>

<th>
試験名
</th>

<th>
料金
</th>

<th>
チェック
</th>

</tr>

<%for(int i =0;i < 4;i++){ ;%>
<tr>
<td>
<%=beans.get(i).getSikenn()%>
</td>

<td>
<%=beans.get(i).getRyoukinn()%>
</td>

<td>
<input type = "checkbox" name = "senntaku" value = "<%=i%>">
</td>

</tr>
<%}%>

</table>

<input type = "submit" name = "teisyutu" value = "提出">


</form>



</body>



</html>