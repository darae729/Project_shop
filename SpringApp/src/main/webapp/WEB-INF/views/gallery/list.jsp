
<%@page import="org.sp.springapp.domain.GalleryImg"%>
<%@page import="java.util.List"%>
<%@page import="org.sp.springapp.domain.Gallery"%>
<%@page import="org.sp.springapp.util.Pager"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	Pager pager=(Pager)request.getAttribute("pager");
	List<Gallery> galleryList=(List)request.getAttribute("galleryList");
%>

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

a{
	text-decoration: none;
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
		<%int num=pager.getNum(); %>
		<%int curPos=pager.getCurPos(); //페이지당 List의 시작 index %> 
		<%=curPos %>
		<%for(int i=1;i<=pager.getPageSize();i++){ %>
		<%if(num<1)break; %>
		<%Gallery gallery=galleryList.get(curPos++); %>
		<%GalleryImg galleryImg=gallery.getGalleryImgList().get(0); %>
		<tr>
			<td><%=num-- %></td>
			<td><img src="/static/data/<%=galleryImg.getFilename() %>" width="85px"></td>
			<td>Smith</td>  
			<td>50</td>
			<td>50</td>
			<td>50</td>
		</tr>
		<%} %>
		
		<tr>
			<td colspan="6">
			<%if(pager.getFirstPage()-1<1){ %>
				<a href="javascript:alert('이전 페이지가 없습니다');">◀</a>
			<%}else{ %>
				<a href="/gallery/list?currentPage=<%=pager.getFirstPage()-1 %>">◀</a>
			<%} %>
				
			<%for(int i=pager.getFirstPage();i<=pager.getLastPage();i++){ %>
				<%if(i>pager.getTotalPage())break; %>
				<a href="/gallery/list?currentPage=<%=i%>">[<%=i %>]</a>
			<%} %>
			
			<%if(pager.getLastPage()>pager.getTotalPage()){ %>
				<a href="javascript:alert('다음 페이지가 없습니다');">▶</a>
			<%}else{ %>
				<a href="/gallery/list?currentPage=<%=pager.getLastPage()+1 %>">▶</a>
			<%} %>
			</td>
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
