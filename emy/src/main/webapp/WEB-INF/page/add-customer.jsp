<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="Common/header.jsp"%>
<form:form modelAttribute="customer" method="post" action="addCustomer.html">
	<form:hidden path="id"/>
  <div class="form-group">
    <form:label path="email">Email address</form:label>
    <form:input path="email" cssClass="form-control" aria-describedby="emailHelp" placeholder="Enter email"></form:input>
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <form:label path="firstName">First Name</form:label>
    <form:input path="firstName" cssClass="form-control" aria-describedby="emailHelp" placeholder="Enter first Name"></form:input>
  </div>

  <div class="form-group">
    <form:label path="lastName">Last Name</form:label>
    <form:input path="lastName" cssClass="form-control" aria-describedby="emailHelp" placeholder="Enter last Name"></form:input>
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
  <a href="${pathContext.request.contextPath}/emy/customer/list.html" class="btn btn-primary">To List</a>
</form:form>
<%@ include file="Common/footer.jsp"%>