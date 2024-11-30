<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <form action="login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
        <br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <br>
        <label for="key">Key:</label>
        <input type="text" id="key" name="key" required>
        <br>
        <button type="submit">Login</button>
    </form>
    <p>${message}</p>
</body>
</html>
