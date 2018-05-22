</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="boardProc.jsp" method="post">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>가게명</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td colspan="2"><textarea row="10" cols="40" name="content">
	</textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="글작성"></td>
		</table>
	</form>
</body>
</html>