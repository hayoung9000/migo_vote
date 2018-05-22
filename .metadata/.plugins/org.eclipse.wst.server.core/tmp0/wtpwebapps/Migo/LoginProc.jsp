<%@page import="java.util.StringTokenizer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%request.setCharacterEncoding("UTF-8");%>
<%
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
%>
<%
	
	BufferedReader reader = null;
	ArrayList<String> list = new ArrayList<String>();
	String str=null;
	String getLine="";
	try{
		String filePath=application.getRealPath("/WEB-INF/member.txt");
		reader = new BufferedReader(new FileReader(filePath));
		//out.println(filePath);
		while ((str = reader.readLine()) != null) {
			   getLine = getLine + str;
		}
		reader.close();
		StringTokenizer st = new StringTokenizer(getLine, " ");
		  while (st.hasMoreTokens()) {
		   list.add(st.nextToken());
		   // 짤라준 조각들을 배열에 저장
		  }
		 for(int i=0;i<list.size()-1;i+=2){
			 if(id.equals(list.get(i))){
				 if(pw.equals(list.get(i+1))){%>
<jsp:forward page="LoginOk.jsp" />
<%}else{%>
<jsp:forward page="Login.jsp" />
<%}
			 }else{ %>
<jsp:forward page="Insert.jsp"></jsp:forward>
<%}
		 } 
	}catch(Exception e){
		out.println("지정된 파일을 찾을 수 없습니다");
	}
%>