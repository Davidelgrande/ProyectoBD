<%-- 
    Document   : ProductoVTA
    Created on : 1/07/2020, 07:06:30 PM
    Author     : Meliza Gaitan Coronel 20172578093
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="ISO-8859-15"%>
<% 
    HttpSession sesion=request.getSession(); //objeto sesion
if(sesion.getAttribute("usu_login")== null) //valida el objeto ssesion 
{
    response.sendRedirect("index.jsp"); //Redirige porque no ha ingresado sesion
    
}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-15">
        <meta name="viewport" content="width-device-width, initial-scale-1, shrink-to-fit-no">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
              integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <h1>Productos</h1>
                </div>
            </div>
            
                <div class="card col-sm-6 col-md-6 col-lg-8">
                    
                    <c:forEach var ="p" items="${productos}">

                    <div class ="col-sm-4">
                        <div class ="card">
                            <div class="card-headrer">
                                <label>${p.getNombre_pro()}</label>  
                            </div>
                            <div class =" card-body">
                                <i>${p.getValor_pro()}</i>
                                <img src="" widtj="200" height="180">
                            </div>
                            <div class="card-footer" text-center>
                                <label>${p.getDescripcion_pro()} </label>
                                <div>
                                    <a herf="ProductoCTO?accion=Agregarcarrito=${p.getId_pro()}" class ="btn btn-outline-info">agregar a carrito</a>
                                    <a herf="#" class ="btn btn-danger">comprar </a>
                                </div>
                            </div>
                        </div>
                    </div>   

                    </c:forEach> 
                    
                </div>
            </div>
            <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        </div>
    </body>
</html>
