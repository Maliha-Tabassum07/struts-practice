<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Form</title>
</head>
<body>
<%-- <form action="saveProduct.do" method="post">

    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="${name}" required><br>

    <label for="quantity">Quantity:</label>
    <input type="text" id="quantity" name="quantity" value="${quantity}" required><br>

    <label for="price">Price:</label>
    <input type="text" id="price" name="price" value="${price}" required><br>

    <input type="submit" value="Save">

</form> --%>
    <html:form action="/saveProduct" method="post">
        <!-- Display error messages -->
        <html:errors />

        <!-- Your form fields -->
        
        <html:text property="name" />
        <html:text property="quantity" />
        <html:text property="price" />

        <!-- Your submit button -->
        <html:submit value="Save" />
    </html:form>
</body>
</html>