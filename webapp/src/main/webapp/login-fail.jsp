<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<%@include file="header.jsp" %>

<title>Login</title>
</head>

<body> 


	<div class="container">

		<div class="row"> <!-- fila de bootstrap donde se dividen las columnas -->

			<div class="col-6"> <!-- Diseño de bootstrap: pantalla se divide en 12 columnas. Col 6 seria la mitad de la pantalla -->


				<div class="alert alert-danger" role="alert">
				Usuario / Password inválido
				
				</div>
				

				<form action="<%=request.getContextPath()%>/login.jsp"> 
				<button type="submit" class="btn btn-success">Success</button>
				</form>


			</div>
		
		</div>
		
	</div>

</body>

</html>
