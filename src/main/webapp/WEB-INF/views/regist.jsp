<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1>����ó  ����ϱ�</h1>
<h2>${ name }</h2>
<h3>${ greet }</h3>

<form action="doCalc" method="post">
	���� 1: <input type="text" name="numOne"><br/>
	���� 2: <input type="text" name="numTwo"><br/>
	<input type="submit" value="����ϱ�">
</form>

</body>
</html>