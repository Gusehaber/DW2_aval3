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
         <form method="post" action="${pageContext.request.contextPath}/CadastroFornecedor">
             <%//Id do Fornecedor
            //<input type="text" name="IDFornecedor"/> <br>
            %>
            Nome do Fornecedor
            <input type="text" name="NomeFornecedor"/><br>
            Contato do Fornecedor
            <input type="text" name="ContatoFornecedor"/><br>
            
            <input type="submit" name="ok"/>
        </form>
              
              
              
                    <br>
            <a href="http://localhost:8084/ProjetoDW/fornecedor"> Retorno </a>
    </body>
</html>
