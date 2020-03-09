<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="userMenu.jsp" %>
<div class="container">
<div class="card">
<div class="card-header">
<div class="row">
<h1>Plz enter address Details</h1>
</div>

</div>

<div class="card-body">
<form:form action="insert" method="post" modelAttribute="addresModel">
<div class="row">
<div class="col-4">
<label for="addressLine1">AddressLine1</label>
</div>
<div class="col-4">
<form:input path="addressLine1" class="controller"/>
</div>
<div class="col-4">
<!-- error msg -->
</div>
</div>

<div class="row">
<div class="col-4">
<label for="addressLine2">AddressLine2</label>
</div>
<div class="col-4">
<form:input path="addressLine2" class="controller"/>
</div>
<div class="col-4">
<!-- error msg -->
</div>
</div>


<div class="row">
<div class="col-4">
<label for="state">State</label>
</div>
<div class="col-4">
<form:input path="state" class="controller"/>
</div>
<div class="col-4">
<!-- error msg -->
</div>
</div>

<div class="row">
<div class="col-4">
<label for="city">City</label>
</div>
<div class="col-4">
<form:input path="city" class="controller"/>
</div>
<div class="col-4">
<!-- error msg -->
</div>
</div>


<div class="row">
<div class="col-4">
<a href="loginView">previous</a>
</div>
<div class="col-2">
<form:input path="city" class="controller"/>
</div>
<div class="col-4">
<input type="submit" value="NEXT">
</div>
</div>
</form:form>
</div>

<div class="card-footer">

</div>

</div>


</div>
</body>
</html>