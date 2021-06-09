<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<script src="//code.jquery.com/jquery.js"></script>
<!-- Ajax 사용을 위한 jquery -->
<script src="//code.jquery.com/jquery.js"></script>

<!-- JavaScript -->
<script type="text/javascript">

</script>

<jsp:include page="top.jsp" flush="true" />
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>singup</title>
<body>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	<div class="container">
		<h2>게시판</h2>
		<table class="table table-striped table-hover">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>날짜</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>98</td>
					<td>누가 부트스트랩 공부한다면서요?</td>
					<td>존 김</td>
					<td>2019.07.05</td>
					<td>1</td>
				</tr>
				<tr>
					<td>100</td>
					<td>꺼진불도 다시보자</td>
					<td>샘 표</td>
					<td>2019.07.05</td>
					<td>2</td>
				</tr>
				<tr>
					<td>101</td>
					<td>악마의 음료 최고 레시피는?</td>
					<td>강잔디</td>
					<td>2019.07.05</td>
					<td>1</td>
				</tr>
				<tr>
					<td>102</td>
					<td>샐러드 최대 몇접시</td>
					<td>섭웨이</td>
					<td>2019.07.05</td>
					<td>2</td>
				</tr>
			</tbody>
		</table>
		<nav>
			<ul class="pagination justify-content-center">
				<li class="page-item"><a class="page-link" href="">이전</a></li>
				<li class="page-item"><a class="page-link" href="">1</a></li>
				<li class="page-item"><a class="page-link" href="">2</a></li>
				<li class="page-item"><a class="page-link" href="">3</a></li>
				<li class="page-item"><a class="page-link" href="">다음</a></li>
			</ul>
		</nav>
	</div>
</body>

</html>
