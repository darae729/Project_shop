<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
table {
	border-collapse: collapse;
	border-spacing: 0;
	width: 100%;
	border: 1px solid #ddd;
}

th, td {
	text-align: left;
	padding: 16px;
}

tr:nth-child(even) {
	background-color: #ffffff;

}

tr[id=first]{
	background-color: #ffffff;
	border: 1px solid #ddd;
}


input[type=button] {
  background-color: #0123b4;
  color: white;
  padding: 10px 23px;
  border: none;
  border-radius: 7px;
  margin-right : 2px;
  cursor: pointer;
}

input[type=button]:hover {
  background-color: #1876fb;
}

</style>
<%@ include file="inc/head_link.jsp" %>
<script type="text/javascript">
$(function() {
	$("#bt_write").click(function() {
		location.href="/gallery/registform";
	});
});
</script>
</head>
<body>

	<h2>상품 목록</h2>
	<p></p>

	<table>
		<tr id="first">
			<th>No</th>
			<th>이미지</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		
		<tr>
			<td>Jill</td>
			<td>Smith</td>
			<td>50</td>
			<td>50</td>
			<td>50</td>
			<td>50</td>
		</tr>
		
		<tr>
		<td colspan="6">
		<p><br>
		<input type="button" id="bt_write" value="글쓰기">
		</td>
		</tr>
	</table>

</body>
</html>
