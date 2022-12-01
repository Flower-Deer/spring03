<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		<!-- 접두사="c" or "core -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
							<!-- ur'i' 아이디처럼 사용 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lime">
검색한 북마크입니다.
<hr>	<!-- var: 반복할가방  items: 가방에들어가는 list --> <!-- : list를  vo 가방에 넣어서 반복 -->
<c:forEach var="vo" items="${list}">
검색한 id : ${vo.id} <br> <!-- el: expression language, 속성으로 지정한 것만 프린트! -->
검색한 name : ${vo.name} <br> <!-- vo.getName() -->
검색한 url : ${vo.url} <br>
검색한 img : ${vo.img} <br>
<hr color="red">
</c:forEach>
</body>
</html>