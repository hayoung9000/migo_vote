<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
	#best{
		color:red;
		font-size: 25px;
		font-weight: 600;
		margin-left:500px;
	}
	#rank{
		font-size: 20px;
		font-weight: 600;
		margin-left:500px;
	}
</style>
</head>
<body>
	<%
		String file = "D:/migo_vote/Migo/WebContent/WEB-INF/vote.txt";
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = "";
		int[] cnt = new int[18];
		while ((str = br.readLine()) != null) {
			int radio = Integer.parseInt(str);
			cnt[radio]++;
		}
		br.close();
		
		int[] rank = new int[18];
		for(int i=0 ; i<rank.length ; i++) {
			for(int j=0 ; j<cnt.length ; j++) {
				if(cnt[i] < cnt[j]) {
					rank[i]++; 
					} 
				} 
		 }
		String[] gosichon=new String[]{"���õ��","�ٺ���","����","���߲�","�̸��н�","�ٳ�����",
				"����������","�ٹ���","�ﵿ��","���","����������","�Ƹ�����","����","�̻۵�������",
				"�Ϲ�����â","������","ū������","ȫ����"};
		for(int i=0;i<3;i++){
			for(int j=0;j<rank.length;j++){
				if(rank[j]==i){
					%><div id="best"><%=rank[j]+1%>. <%=gosichon[j] %></div>
				<% 
				}
			}
		}
		for(int i=3;i<rank.length;i++){
			for(int j=0;j<rank.length;j++){
				if(rank[j]==i){
					%><div id="rank"><%=rank[j]+1%>. <%=gosichon[j] %></div>
				<% 
				}
			}
		}
		
	%>
	
</body>
</html>