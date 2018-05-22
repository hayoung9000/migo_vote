<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
.box {
	display: inline-block;
	background-color: white;
	width: 340px;
	margin: 5px;
}

img {
	width: 340px;
	height: 300px;
	display: block;
	margin-bottom: 10px;
}

ul {
	list-style: none;
}

a {
	text-decoration: none;
}

span {
	display: block;
	padding-left: 7px;
}

#name {
	font-size: 17px;
	line-height: 19px;
	font-weight: 900;
	color: #404040;
	margin-bottom: 3px;
}

#explain {
	font-size: 13px;
	line-height: 13px;
	color: #757575;
}

#time {
	margin-top: 5px;
	line-height: 19px;
	font-weight: 900;
	color: #ff9933;
}
</style>
</head>
<body>
	<ul>
		<li class="box"><a href="dabuzzi.jsp"> <img
				src="image/dabuzzi_f.jpg"> <span id="name">다부찌</span> <span
				id="explain">얼큰한 부대찌개와 바삭한 감자튀김의 조화</span> <span id="time">10분</span>
		</a></li>
		<li class="box"><a href="sam.jsp"> <img src="image/sam_f.jpg">
				<span id="name">삼동이</span> <span id="explain">퓨전 삼겹살 덮밥</span> <span
				id="time">13분</span>
		</a></li>
		<li class="box"><a href="hong.jsp"> <img
				src="image/hong_f.jpg"> <span id="name">홍오로</span> <span
				id="explain">불맛 가득 퓨전 중화 음식</span> <span id="time">10분</span>
		</a></li>
		<li class="box"><a href="sambong.jsp"> <img
				src="image/sambong_f.jpg"> <span id="name">삼봉</span> <span
				id="explain">밥이 무한리필인 김치찌개 메뉴가 대표</span> <span id="time">11분</span>
		</a></li>
		<li class="box"><a href="dduck.jsp"> <img
				src="image/dduck_f.jpg"> <span id="name">빨강떡볶이</span> <span
				id="explain">매운맛 단계가 있는 저렴한 떡볶이</span> <span id="time">11분</span>
		</a></li>
		<li class="box"><a href="hot.jsp"> <img
				src="image/hot_f2.jpg"> <span id="name">엽기떡볶이</span> <span
				id="explain">대한민국 대표 매운 떡볶이</span> <span id="time">15분</span>
		</a></li>
		<li class="box"><a href="mom.jsp"> <img src="image/mom_f.jpg">
				<span id="name">큰엄마네떡볶이아울렛</span> <span id="explain">넓은 인원 회식
					가능한 떡볶이집</span> <span id="time">2분</span>
		</a></li>
		<li class="box"><a href="mirim.jsp"> <img
				src="image/mirim_f.JPG"> <span id="name">미림분식</span> <span
				id="explain">이름부터 미림인 즉석떡볶이집</span> <span id="time">2분</span>
		</a></li>
		<li class="box"><a href="pork.jsp"> <img
				src="image/pork_f.jpg"> <span id="name">이쁜돼지고기</span> <span
				id="explain">삼겹살과 목살 무한리필</span> <span id="time">14분</span>
		</a></li>
		<li class="box"><a href="chiken.jsp"> <img
				src="image/chiken_f.jpg"> <span id="name">맛닭꼬</span> <span
				id="explain">오븐에 구운 담백한 치킨</span> <span id="time">11분</span>
		</a></li>
		<li class="box"><a href="amasvin.jsp"> <img
				src="image/amasvin_f2.jpg"> <span id="name">아마스빈</span> <span
				id="explain">달콤 쫀득 버블티, 타피오카펄로 든든한 간식</span> <span id="time">7분</span>
		</a></li>
		<li class="box"><a href="waffle.jsp"> <img
				src="image/waffle_f.jpg"> <span id="name">바바플</span> <span
				id="explain">저렴한 가격으로 맛보는 수제 와플</span> <span id="time">11분</span>
		</a></li>
		<li class="box"><a href="bananau.jsp"> <img
				src="image/bananau_f.jpg"> <span id="name">바나나유</span> <span
				id="explain">떠오르는 신흥강자! 생바나나 음료</span> <span id="time">9분</span>
		</a></li>
		<li class="box"><a href="gggo.jsp"> <img
				src="image/gigigo_f.jpg"> <span id="name">지지고</span> <span
				id="explain">일본식 볶음 컵요리</span> <span id="time">10분</span>
		</a></li>
		<li class="box"><a href="alchon.jsp"> <img
				src="image/alchon_f.jpg"> <span id="name">알촌</span> <span
				id="explain">맛과 가격 모두 잡은 알밥</span> <span id="time">11분</span>
		</a></li>
		<li class="box"><a href="duckbong.jsp"> <img
				src="image/duckbong_f.jpg"> <span id="name">덕봉식당</span> <span
				id="explain">주문 즉시 조리하는 뜨끈한 집밥 음식</span> <span id="time">9분</span>
		</a></li>
		<li class="box"><a href="sin.jsp"> <img src="image/sin_f.jpg">
				<span id="name">신전떡볶이</span> <span id="explain">매콤한 국물 떡볶이</span> <span
				id="time">14분</span>
		</a></li>
		<li class="box"><a href="kim.jsp"> <img src="image/kim_f.jpg">
				<span id="name">김밥천국</span> <span id="explain">번외) 저녁으로 최고인
					만능 식당</span> <span id="time">2분</span>
		</a></li>

	</ul>
</body>
</html>