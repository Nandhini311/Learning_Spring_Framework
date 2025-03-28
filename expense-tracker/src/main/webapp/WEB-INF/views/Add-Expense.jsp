<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.css" rel="stylesheet">
    <title>Add Expense</title>
</head>
<body>
<%@ include file="Common/NavBar.jspf" %>

<div class="container mt-4">
    <h1 class="mb-4">Please add your expense below</h1>

    <form:form action="add-expense" method="post" modelAttribute="expense" class="needs-validation">
        <input type="hidden" name="id" value="${expense.id}">
        <div class="mb-3">
            <label class="form-label">Description:</label>
            <form:input path="description" cssClass="form-control" required="required"/>
        </div>

        <div class="mb-3">
            <label class="form-label">Amount:</label>
            <form:input path="amount" cssClass="form-control" required="required"/>
        </div>

        <div class="mb-3">
            <form:label path="date" class="form-label">Expense Date:</form:label>
            <form:input path="date" type="text" id="date" class="form-control" required="required"/>
            <form:errors path="date" class="text-danger"/>
        </div>

        <div class="mb-3">
            <label class="form-label">Currency:</label>
            <form:select path="currency" cssClass="form-select">
                <form:option value="INR">INR</form:option>
                <form:option value="USD">USD</form:option>
                <form:option value="EUR">EUR</form:option>
                <form:option value="GBP">GBP</form:option>
            </form:select>
        </div>

        <button type="submit" class="btn-dark btn-danger">Add Expense</button>
    </form:form>
</div>

<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.js"></script>

<script>
    $(document).ready(function() {
        $('#date').datepicker({
            format: 'yyyy-mm-dd',
            autoclose: true,
            todayHighlight: true
        });
    });
</script>
</body>
</html>
