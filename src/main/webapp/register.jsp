<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="js/validation.js"></script>
</head>
<body>
    <form action="register" method="post" onsubmit="return validateForm()">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required>
        <br>
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required>
        <br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <br>
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
        <span id="usernameError"></span>
        <br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <br>

        <button type="submit">Register</button>
         <c:if test="${not empty errorMessage}">
                <div style="color: red;">${errorMessage}</div>
            </c:if>
    </form>
</body>
</html>
