<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
String str = request.getParameter("send");
if(str.equals("ok"))
	out.println("<font color='red'>식당<b>요청</b></font>이 전송되었습니다.");
else 
	out.println("<font color='red'><b>쓰기 오류 발생</b></font>");
%>
	<meta http-equiv='refresh' content='3; url=main.jsp'>
</body>
</html>