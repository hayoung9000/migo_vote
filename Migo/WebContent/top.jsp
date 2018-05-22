<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
ul {
	list-style: none;
}

nav ul li {
	display: inline;
	letter-spacing: 2px;
	padding: 0px 5px;
}

nav ul li a {
	text-decoration: none;
	color: black;
	font-weight: bold;
	font-size: 18px;
}

nav ul li a:hover {
	color: #ff5050;
	text-decoration: underline;
}
</style>
</head>
<body>
	<center>
		<a href="Index.jsp"><img src="image/logo.png"
			style="width: 190px; height: 80px;"></a>
		<nav>
		<ul>
			<li><a href="gosichon.jsp">전체목록</a></li>
			<li><a href="vote.jsp">투표</a></li>
		</ul>
		</nav>
	</center>
</body>
</html>