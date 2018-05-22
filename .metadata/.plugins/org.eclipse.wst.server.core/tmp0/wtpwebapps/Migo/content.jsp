<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.slide {
	margin-left: 300px;
	margin-bottom: 30px;
}

#intro {
	margin-left: 500px;
	color: coral;
	font-weight: bold;
	font-size: 18px;
}
</style>
</head>
<body>
	<div class="slide">
		<img class="mySlides" src="image/hong_f.jpg" style="width: 650px;">
		<img class="mySlides" src="image/hong_f2.jpg" style="width: 650px;">
		<img class="mySlides" src="image/sam_f2.jpg" style="width: 650px;">
	</div>

	<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>
	<span id="intro">"당신의 고시촌 최애를 고르세요"</span>
</body>
</html>