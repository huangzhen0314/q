<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<td>
			<form action="list" method="post">
			
			关键字:<input type="text" name="bname"><br>
			<input type="submit" value="搜索">
			</form>
			</td>
		<tr>
		<tr>
			<th>图书ID</th>
			<th>图书名</th>
			<th>类别</th>
			<th>手机号</th>
			<th>作者</th>
			<th>受欢迎程度</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${plist.list }" var="p">
			<tr>
				<td>${p.bid }</td>
				<td>${p.bname }</td>
				<td>${p.btype }</td>
				<td>${p.bphone }</td>
				<td>${p.bauthor }</td>
				<td>${p.blike }</td>
				<td>
					<button>
						<a href="selOne?bid=${p.bid }">修改</a>
					</button>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td><a href="list?pageNum=${plist.prePage }"><<<</a> <c:forEach
					begin="1" end="${plist.pages }" step="1" var="a">
					<a href="list?pageNum=${a }">${a }</a>
				</c:forEach> <a href="list?pageNum=${plist.nextPage }">>>>></a></td>
		</tr>
	</table>

</body>
</html>