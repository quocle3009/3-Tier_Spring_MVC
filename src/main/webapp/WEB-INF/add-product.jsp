<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome page</title>
</head>
<body>


<form:form action="saveProduct" method="post" modelAttribute="product">
    <table>
        <tr>
            <td><form:label path="name">Tên sản phẩm: </form:label></td>
            <td><form:input path="name"/>
                <form:errors path="name" cssStyle="color:#d04c4c"/>
            </td>
        </tr>
        <tr>
            <td><form:label path="price">Giá: </form:label></td>
            <td><form:input path="price"/>
                <form:errors path="price" cssStyle="color:red"/>
            </td>
        </tr>
        <tr>
            <c:if test="${not empty error}">
                Message: ${error}
            </c:if>
            <c:if test="${not empty success}">
                Message: ${success}
            </c:if>
        </tr>
        <tr>
            <td><form:button>Submit</form:button></td>
        </tr>
    </table>
</form:form>

</body>
</html>
