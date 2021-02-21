

<%@page contentType="text/html" pageEncoding="ISO-8859-15"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-15">
        <meta name="viewport" content="width-device-width, initial-scale-1, shrink-to-fit-no">
        <title>Taller Java Web</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
              integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>
        <div class="modal-dialog text-center">
            <div class="col-lg-8">
                <div class="modal-content">
                    <div class="col-12">
                        <img src="imagenes/login.png" height="128" width="128"/>
                    </div>
                    <form action="MyLogin?accion=valida_sesion" method="POST">
                        <div class="form-group text-center">
                            <p>
                                <strong>Bienvenidos al Login</strong>
                            </p>
                        </div>
                        <div class="form-group">
                            <label>Usuario:</label> 
                            <input type="text" name="txt_correo" placeholder="ejemplo@gmail.com" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Clave:</label>
                            <input type="password" name="txt_clave" placeholder="password" class="form-control" required>
                        </div>
                        <input type="submit" name="btn_ingresar" value="Ingresar" class="btn btn-primary">
                    </form>
                </div>
            </div>
        </div>
        <a href="ProductoVTA.jsp">Productos</a>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>
</html>
