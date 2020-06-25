



<!DOCTYPE html>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<table>
	<tr>

		<th>Nombre</th>
	<tr>	
	
	
	<tr>
	
		<tbody>
		
		
		<% 
		List<String> nombres = (List<String>)request.getAttribute("nombres");
		
		%>
		
		<% for (String nombre : nombres){ %>
		
			<tr> 
				<th><%out.print(nombre);%></th>  
				
			</tr>
			
		<%}%>
		
		
		</tbody>
	<!-- scriplet = escribir codigo java en un jsp   -->
		
		</td>
		
		
	
	</tr>
	
	</tbody>

</table>


</body>
</html>