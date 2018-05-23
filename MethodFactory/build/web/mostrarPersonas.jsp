<%-- 
    Document   : mostrarPersonas
    Created on : 09-may-2018, 18:41:07
    Author     : LABO08
--%>

<%@page import="modelo.Persona"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/Ventana.css">
        <title>JSP Page</title>
            <%
                ArrayList <Persona> personas;
                personas = (ArrayList) request.getAttribute("lista");
            %>
    </head>
    <body>
        <table border="1px">
            <tr>
              <th>Nombre</th>
              <th>Apellido</th>
              <th>Direccion</th>
              <th>Ciudad</th>
            </tr>
            
            <% for(Persona pro: personas) { %>
	
            <tr>
		<td><%=pro.getNombre() %></td>
		<td><%=pro.getApellido() %></td>
                <td><%=pro.getDireccion() %></td>
                <td><%=pro.getCiudad() %></td>
		
	 </tr>
	 <%} %>
          </table> 
    </body>
</html>
