<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title>Frozzeto</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
            <a class="navbar-brand m-1" href="https://www.instagram.com/frozzetogelato/">Frozzetogelato</a>
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav">
                    <li class="nav-item"><a class="nav-link" href="/home">Inicio</a></li>
                    <li class="nav-item"><a class="nav-link" href="/list-todos">Control de Helados</a></li>
                </ul>
            </div>
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link" href="/logout">Salir</a></li>
            </ul>
        </nav>
        <div class="container">
            <h1>Helados Disponibles</h1>
            <table class="table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Sabor</th>
                        <th>Capacidad</th>
                        <th>Precio</th>
                        <th>Eliminar</th>
                        <th>Actualizar</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${todos}" var="todo">
                        <tr>
                            <td>${todo.id}</td>
                            <td>${todo.flavor}</td>
                            <td>${todo.capacity}</td>
                            <td>${todo.price}</td>
                            <td>
                                <form method="post" action="list-todos/delete-todo">
                                    <input type="hidden" name="id" value="${todo.id}">
                                    <button type="submit" class="btn btn-warning">ELIMINAR</button>
                                </form>
                            </td>
                            <td> <a href="/list-todos/update-todo?id=${todo.id}" class="btn btn-warning">ACTUALIZAR ${todo.id}</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <a href="/list-todos/add-todo" class="btn btn-success">Add todo</a>
        </div>

        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>

    </body>
</html>