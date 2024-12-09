<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title>Add New IceCream</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
            <a class="navbar-brand m-1" href="https://www.instagram.com/frozzetogelato/">Frozzetogelato</a>
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav">
                    <li class="nav-item"><a class="nav-link" href="/home">Inicio</a></li>
                    <li class="nav-item"><a class="nav-link" href="/list-todos">Control Helados</a></li>
                </ul>
            </div>
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link" href="/logout">Salir</a></li>
            </ul>
        </nav>

        <div class="container">
            <h1>Ingresa los datos del helado</h1>
            <form method="post">
                Sabor: <input type="text" name="flavor" required="required" />
                Capacidad: <input type="text" name="capacity" required="required" />
                Precio: <input type="text" name="price" required="required" />
                <input type="submit" class="btn btn-success" />
            </form>
        </div>

        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>

    </body>
</html>