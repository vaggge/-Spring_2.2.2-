<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
</head>
<body>
<c:set var="en" value="en" />
<c:set var="ru" value="ru" />
<c:set var="cars" value="${cars}" />
<c:choose>
    <c:when test = "${locale == en}">
        <h1>Cars</h1>
        <table border="1" width="25%" cellpadding="5">
            <tr>
                <td><p><b>Name</b></p></td>
                <td><p><b>Model</b></p></td>
                <td><p><b>Number</b></p></td>
            </tr>
            <c:forEach items="${cars}" var="car">
            <tr>
                <td>${car.name}</td>
                <td>${car.model}</td>
                <td>${car.carNumber}</td>
            </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:when test = "${locale == ru}">
        <h1>Машины</h1>
        <table border="1" width="25%" cellpadding="5">
            <tr>
                <td><p><b>Name</b></p></td>
                <td><p><b>Model</b></p></td>
                <td><p><b>Number</b></p></td>
            </tr>
            <c:forEach items="${cars}" var="car">
                <tr>
                    <td>${car.name}</td>
                    <td>${car.model}</td>
                    <td>${car.carNumber}</td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:when test="${locale == null}">
        <a href="cars?locale=ru">RU version</a>&nbsp;/&nbsp;<a href="cars?locale=en">EN version</a>
    </c:when>
</c:choose>
</body>
</html>


