<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>


<!-- BOOTSTRAP -->

<%@include file="header.jsp" %>

<title>Bienvenido</title>
</head>

<body> 

<%@include file="navbar.jsp" %>


	<div class="container">

		<div class="row"> <!-- fila de bootstrap donde se dividen las columnas -->

			<div class="col-6"> <!-- Diseño de bootstrap: pantalla se divide en 12 columnas. Col 6 seria la mitad de la pantalla -->
			
			
				<%
				
				Boolean usuarioLogueado = (Boolean)session.getAttribute("userLogueado");
				
				
				if(usuarioLogueado != null) {
				
				
				%>


				<div class="card" style="width: 18rem;">
  				<img src="..." class="card-img-top" alt="...">
  				<div class="card-body">
    			<h5 class="card-title"><%=session.getAttribute("userLogueado") %></h5> <!-- mostrar el nombre guardado en login servlet a la hora de conectarse (set atribuite) -->
    			<p class="card-text">Bienvenido USUARIO</p>
    			<a href="<%=request.getContextPath()%>/logout" class="btn btn-primary">Logout</a>
    			<a href="<%=request.getContextPath()%>/listado" class="btn btn-info">Listado</a>	
    			<a href="<%=request.getContextPath()%>/nuevoProducto.jsp" class="btn btn-info">Nuevo Producto</a>	
  				</div>
				</div>
			
				<%
				} else {
					response.sendRedirect(request.getContextPath() +"/login-fail.jsp");
				}
			
				%>
			
			


			</div>
		
		</div>
		
	</div>

</body>

</html>
