<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link rel="stylesheet" href="css/style.css">
       	<link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/bootstrap-responsive.css"/>
        <title>Show All Users</title>
    </head>
    <body>
        <div class="container espaco">
            <div class="row">
                 <h2 class="form-signin-heading">Lista de Pessoas</h2>
                <div class="offset3 span6 offset3 ">
                    <table class="table  table-hover table-bordered table-striped ">

                        <thead>
                            <tr>
                                <th>ISBN</th>
                                <th>Descrição</th>               
                                <th>Edição</th>
                                <th>Lançamento</th>               

                                <th colspan=2>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${livros}" var="user">
                                <tr>
                                    <td><c:out value="${user.ISBN}" /></td>
                                    <td><c:out value="${user.descricao}" /></td>
                                    <td><c:out value="${user.edicao}"/></td>
                                    <td><c:out value="${user.anoLancamento}"/></td>
                                    <td><a href="LivroController?action=edit&ISBN=<c:out value="${user.ISBN}"/>">Update</a></td>
                                    <td><a href="LivroController?action=delete&ISBN=<c:out value="${user.ISBN}"/>">Delete</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <p><a href="LivroController?action=insert">Add User</a></p>
                </div>
            </div>
        </div>
    </body>
</html>