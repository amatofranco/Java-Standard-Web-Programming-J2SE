



<!DOCTYPE html>
<%@page import="ar.com.educacionit.domain.Producto"%>
<%@page import="java.util.List"%>
<html>
<head>


<%@include file="header.jsp"%>


</head>
<body>

<%@include file="navbar.jsp" %>


<div class="container">

<div class="row">

<table class="table">

	<thread>
	
	<tr>
		<th scope="col">Id</th>
		<th scope="col">Descripcion</th>
		<th scope="col">Precio</th>
		<th scope="col">Código</th>
		<th scope="col">Tipo Producto</th>
		<th></th>
		
	<tr>	
	
	</thread>
		
		<tbody>
		
		
		<% 
		List<Producto>	productos = (List<Producto>)session.getAttribute("productos");
		
		%>
		
		<% for (Producto producto : productos){ %>
		
			<tr> 
				<th scope="row"><%out.print(producto.getId());%></th> 
				<th scope="row"><%out.print(producto.getDescripcion());%></th>
				<th scope="row"><%out.print(producto.getPrecio());%></th>
				<th scope="row"><%out.print(producto.getCodigo());%></th> 
				<th scope="row"><%out.print(producto.getTipoProducto());%></th> 
				<th>
				<button type="button" class="btn btn-outline-primary">Editar</button>
				<button type="button" class="btn btn-outline-secondary">Eliminar</button>
				</th>
				
			</tr>
			
		<%}%>
		
		<tr>
		
			<td>
			
			<button type="button" class="btn btn-outline-primary">Editar</button>
			<button type="button" class="btn btn-outline-secondary">Eliminar</button>
		
			</td>
		
		</tr>
		
		
		
		
		</tbody>
	<!-- scriplet = escribir codigo java en un jsp   -->
		
		</td>
		
		
	
	</tr>
	
	</tbody>

</table>

</div>

</div>


</body>
</html>