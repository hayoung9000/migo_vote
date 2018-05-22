<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.FileWriter"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	String radioValue = request.getParameter("gosichon");
	String file = "D:/migo_vote/Migo/WebContent/WEB-INF/vote.txt";
	PrintWriter pw = new PrintWriter(new FileWriter(file, true));
	pw.println(radioValue);
	pw.close();
	
	
	response.sendRedirect("voteOk.jsp");
%>