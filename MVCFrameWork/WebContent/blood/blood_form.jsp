<%@page import="blood.model.BloodAdviser"%>
<%@ page contentType="text/html;charset=utf-8"%>
<!-- 서블릿의 service()에 의해 out.print()로 페이지를 보여준다!  -->
<%
		
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style></style>
<script>
function send() {
	var form = document.querySelector("form");
	form.action="/blood.do";
	form.method="get";
	form.submit();
}
</script>
</head>
<body>
	<form>
		<select name="blood">
			<option>혈액형을 선택하세요</option>
			<option value="A">A형</option>
			<option value="B">B형</option>
			<option value="O">O형</option>
			<option value="AB">AB형</option>
		</select>
		<button type="button" onClick="send()">분석보기</button>
	</form>
</body>
</html>