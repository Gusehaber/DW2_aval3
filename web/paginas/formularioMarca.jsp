<%-- 
    Document   : produto2
    Created on : 30/05/2018, 09:56:00
    Author     : Gustavo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form method="post" action="${pageContext.request.contextPath}/CadastroMarca">
            <% //Id da Marca
            //<input type="text" name="IDMarca"/> <br>
                    %>
            Nome da Marca
            <input type="text" name="NomeMarca"/><br>
            <input type="submit" name="ok"/>
        </form> 
        
            <a href="http://localhost:8084/ProjetoDW/marca"> Retorno </a>
    </body>
</html>
