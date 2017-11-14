<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Add new user</title>
        <link rel="stylesheet" href="css/style.css">
       	<link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/bootstrap-responsive.css"/>
    </head>
    <body>
        <div class="container espaco">
            <div class="offset3 span6 offset3">
                <form class="form-signin" role="form" method="POST" action='LivroController'>
                    <h2 class="form-signin-heading">Insira seus dados</h2>

                    ISBN : <input type="text"  class="form-control"  name="ISBN"
                                  value="<c:out value="${user.ISBN}" />" /> <br /> 
                    Descrição : <input
                        type="text" name="descricao"  class="form-control"
                        value="<c:out value="${user.descricao}" />" /> <br /> 
                    
                    Edição: <input  type="text" name="edicao"  class="form-control"
                        value="<c:out value="${user.edicao}" />" /> <br /> 
                    
                    Lançamento: <input type="text" name="anoLancamento"  class="form-control"
                        value="<c:out value="${user.anoLancamento}" />" /> <br /> 

                    <button class="btn btn-lg btn-primary btn-block" type="submit">Enviar</button>
                </form>

            </div>
        </div>
    </body>
</html>