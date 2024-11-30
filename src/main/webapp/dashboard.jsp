<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Dashboard</h1>
    <table>
        <thead>
            <tr>
                <th>Username</th>
                <th>Key</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.username}</td>
                    <td>${user.key}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
