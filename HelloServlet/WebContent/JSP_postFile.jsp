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

 
	<%ArrayList<Bean> beans = (ArrayList<Bean>)request.getAttribute("bean_senntaku");%>
 
<table border = "1"> 

<tr>

<th>
試験名
</th>

<th>
料金
</th>

</tr> 
 
<%int sum = 0;%>
<%for(int i = 0; i < beans.size(); i++){%>
 <tr>
 <td>
<%=beans.get(i).getSikenn()%>
</td>

<td>

<%=beans.get(i).getRyoukinn()%>
<%sum +=Integer.parseInt(beans.get(i).getRyoukinn());%>
</td>
</tr>
 <%}%>
 <p>合計<%=sum%>円</p>
 
 
</table> 

<form action = "HelloServlet" method = "get">
<input type = "submit" name = "teisyutu" value = "最初に戻る">
</form>


</body>
</html>