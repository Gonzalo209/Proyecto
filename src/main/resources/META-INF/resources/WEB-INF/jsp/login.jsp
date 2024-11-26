<!DOCTYPE html>
<html>
    <head>
        <title>LOGIN</title>
    </head>
    <body>

        <div class="container">
            <h3>Welcome to the login page</h3>
            <pre>${errorMessage}</pre>
            <form method="post" >
                Name: <input type="text" name="name">
                Password: <input type="password" name="password">
                <input type="submit">
            </form>
        </div>
    </body>
</html>