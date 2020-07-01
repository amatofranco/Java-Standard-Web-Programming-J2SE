<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>


<!-- BOOTSTRAP -->

<%@include file="header.jsp" %>


<title>Login</title>
</head>


<body>

<%@include file="navbar.jsp" %>


	<div class="container">

		<div class="row"> <!-- fila de bootstrap donde se dividen las columnas -->

			<div class="col-6"> <!-- Diseño de bootstrap: pantalla se divide en 12 columnas. Col 6 seria la mitad de la pantalla -->

				<form action="<%=request.getContextPath()%>/parseArchivoServlet" method="post">
				
				<!-- CARGAR ARCHIVO -->	 
  				<div class="form-group">
   				 <label for="exampleFormControlFile1">Seleccione archivo de Productos</label>
    			<input type="file" name="file" class="form-control-file" id="exampleFormControlFile1">
  				</div>
  				<button type="submit" class="btn btn-primary">Procesar</button>				
				</form>
  
  			</div>
 
  			
  		</div>
  
 	</div>

</body>
</html>