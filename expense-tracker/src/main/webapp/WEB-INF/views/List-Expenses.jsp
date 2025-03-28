<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<meta charset="UTF-8">
<head>
    <!--loading the css files-->
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>Expense List</title>
</head>
<body>
<%@ include file="Common/NavBar.jspf"%>
<h1>Hi ${name} ! Here is your expense list </h1>
<table class="table">
    <tbody>
    <thead>
    <th>Description</th>
    <th>Amount</th>
    <th>Currency</th>
    <th>Expense - Date</th>
    <th>Update</th>
    <th>Delete</th>

    </thead>
    <c:forEach items="${list}" var="expense">
        <!--can create the rows/data here-->
        <tr>
            <td>${expense.description}</td>
            <td>${expense.amount}</td>
            <td>${expense.currency}</td>
            <td>${expense.date}</td>
            <td><a href="delete-expense?id=${expense.id}" class="btn btn-warning">Delete</a></td>
            <td><a href="update-expense?id=${expense.id}" class="btn btn-success">Update</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="add-expense" class="btn btn-danger">Add New Expense</a>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>
