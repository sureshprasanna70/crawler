<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.jsoup.Jsoup" %>
    <%@page import="java.util.Vector"%>
<%@page import= "java.io.*"%>
<%@page import= "org.jsoup.Jsoup"%>
<%@page import="org.jsoup.nodes.Document"%>
<%@page import=" org.jsoup.nodes.Element"%>
<%@page import="org.jsoup.select.Elements"%>
<%@page import ="org.apache.commons.codec.binary.Base64" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Document udoc=null;
int start=2011239001;
int finish=2011239029;
for(int i=start;i<=finish;i++)
{
	Integer ins=new Integer(i);
	String v=ins.toString();
	 byte[] encoded = Base64.encodeBase64(v.getBytes()); 
	 
try
{  udoc=Jsoup.connect("http://acoe.annauniv.edu/123finresult.php?regno="+new String(encoded)).timeout(0).get();
}     
catch(Exception e)
{
	System.out.print(e);
}
Elements ubody=udoc.select("body");
Elements utab=ubody.select("table");
Elements sub=ubody.select("td[align=center]");
Elements utd=utab.select("td");
Elements grade=utd.select("div[align=center]");
String course=sub.text();
out.print(course);
String ub=grade.text();
out.print(ub);

}

	
%>

</body>
</html>