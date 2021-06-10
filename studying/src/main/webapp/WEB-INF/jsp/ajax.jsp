<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script src="http://code.jquery.com/jquery-1.7.js"
	type="text/javascript"></script>

<html>
<head>
<script>
             var newValue;
             // 모든 텍스트의 변경에 반응합니다.
             $("#testOnchange").on("propertychange change keyup paste input", function() {
                
                // 현재 변경된 데이터 셋팅
                newValue = $(this).val();
                
                // 현재 실시간 데이터 표츌
                alert("텍스트 :: " + newValue);
             });
             
        </script>
<title>Home</title>

<script type="text/javascript">
	
	function AjaxEx(){
		
		var name = "name="+document.check.name.value;
			
		$.ajax({
			url : "/check",
			type : "post",
			data : name,
			dataType : "json",
			success : function(data) {
				
				document.getElementById("result").innerHTML = data+"님 반갑습니다.";
					
				},
				
			error : function(request) {
			
				alert("실패");
			
				
			}
		});

		}
	
	</script>
</head>
<body>

	<h3>Ajax 예제 입니다..</h3>
	<form action="" name="check" method="post">
		<input type="text" id="name"> <input type="button" value="클릭"
			onclick="AjaxEx()">
		<div id="result"></div>
	</form>
	<input id="testOnchange" type="text" value="안녕하세요.">

</body>
</html>