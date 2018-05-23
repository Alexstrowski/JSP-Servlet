<%-- 
    Document   : index
    Created on : 09-may-2018, 17:07:50
    Author     : LABO08
--%>

<%@page import="modelo.Pais"%>
<%@page import="modelo.Persona"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <%
    ArrayList <Pais> paises;
    paises = (ArrayList) request.getAttribute("lista");
    %>
    </head>
    <body>
        <h1>Lista Paises!</h1>
        
        <form action="ServletProceso">
        <h3>Escoge una opcion</h3>
        <select name="Paises">
            <%
                
                for(Pais pro: paises) {
                  
            %>      
                  <option value="<%=pro.getIdPais()%>"> <%=pro.getPais()%></option>
            <%
                }
            %>

        </select>
        <input type="submit" value="Seleccionar">
        </form>
    </body>
</html>
