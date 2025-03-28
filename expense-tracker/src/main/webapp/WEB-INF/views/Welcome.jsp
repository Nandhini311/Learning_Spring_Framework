<html>
<head>
    <title>Welcome Page</title>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<%@ include file="Common/NavBar.jspf"%>
<h1>Hi ${name}! Welcome to my expense tracker </h1>
<a href="list-expenses" class="btn btn-primary btn-lg">Manage your expenses</a>

<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>