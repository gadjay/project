<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table cellpadding="0" cellspacing="0" border="1">
		<thead>
			<tr>
				<td>ID</td>
				<td>名称</td>
				<td>标题</td>
				<td>类型</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${userList }" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.name}</td>
				<td>${item.headline}</td>
				<td>${item.type}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>