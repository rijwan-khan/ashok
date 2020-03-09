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

<form:form action="save" method="post" modelAttribute="personInfoModel">
<div class="container">
<div class="card">

<div class="card-header bg-primary text-center text-white" >
<div class="row">
<b>Social Security Administration</b>
</div>
</div>


<div class="card-body ">

<div class="row">
<div class="col-4">
<label for="firstName">First Name</label>
</div>

</div>
<div class="col-4">
<form:input path="firstName" class="form-control"/>
</div>

<div class="col-4">
<!-- error msg -->
</div>





<div class="row">
<div class="col-4">
<label for="lastName">Last Name</label>
</div>

</div>
<div class="col-4">
<form:input path="lastName" class="form-control"/>
</div>


<div class="col-4">
<!-- error msg -->
</div>



<div class="row">
<div class="col-4">
<label for="dob">Dob</label>
</div>

</div>
<div class="col-4">
<form:input path="dob" class="form-control"/>

</div>
<div class="col-4">
<!--error  -->
</div>


<div class="row">
<div class="col-4">
<label for="gender">gender</label>
</div>

</div>
<div class="col-4">
<form:radiobutton path="gender" value="male"/>male
<form:radiobutton path="gender" value="fe-male"/>fe-male

</div>
<div class="col-4">
<!--error  -->
</div>
<div class="row">
<div class="col-4">
</div>

</div>
<div class="col-4">
<input type="submit" value="NEXT" class="btn btn-info">
</div>
</div>
<div class="col-4">
<!--error  -->
</div>
</div>

</div>
</form:form>
</div>

<!-- <div class="card-footer">

</div> -->




</body>
</html>