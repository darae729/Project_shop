<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
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

.container {
  border-radius: 5px;
  background-color: #ffffff;
  padding: 20px;
}
</style>
<%@ include file="inc/head_link.jsp" %>
<script type="text/javascript">

function regist() {
	$("form").attr({
		action:"/gallery/regist",
		method:"post",
		enctype:"multipart/form-data"
	});
	
	$("form").submit();
	
}

$(function() {
	$("#bt_list").click(function() {
		location.href="/gallery/list";
	});
});

$(function() {
	$("#bt_regist").click(function() {
		regist();
	});
});

</script>
</head>
<body>

<h3>글쓰기</h3>

<div class="container">
  <form>
    <input type="text" name="title" placeholder="상품 이름">
    <input type="text" name="writer" placeholder="작성자">

    <textarea id="content" name="content" placeholder="상세내용을 입력하세요" style="height:200px"></textarea>

    <input type="file" name="photo">
    <br><p>
    <input type="file" name="photo">
    <p><br>
    <input type="button" value="목록" id="bt_list">
    <input type="button" value="등록" id="bt_regist">
  </form>
</div>

</body>
</html>
