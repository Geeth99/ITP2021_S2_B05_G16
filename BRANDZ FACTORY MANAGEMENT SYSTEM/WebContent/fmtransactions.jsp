<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<c:forEach var="inc" items="${incDetails}">

<c:set var="transactionid" value="${inc.transactionid}"/>
<c:set var="bname" value="${inc.bname}"/>
<c:set var="bankDetails" value="${inc.bankDetails} "/>
<c:set var="discount" value="${inc.discount}"/>
<c:set var="icode" value="${inc.icode}"/>
<c:set var="quantity" value="${inc.quantity}"/>
<c:set var="proce" value="${inc.proce}"/>
<tr>
	<td>Transaction ID</td>
	<td>${inc.transactionid} </td>
</tr>

<tr>
	<td>Buyer name</td>
	<td>${inc.bname} </td>
</tr>

<tr>
	<td>Bank name/account</td>
	<td>${inc.bankDetails} </td>
</tr>

<tr>
	<td>Discount</td>
	<td>${inc.discount}</td>
</tr>

<tr>
	<td>Item code</td>
	<td>${inc.icode} </td>
</tr>

<tr>
	<td>Quantity</td>
	<td>${inc.quantity} </td>
</tr>

<tr>
	<td>Price</td>
	<td>${inc.proce} </td>
</tr>




</c:forEach>
</table>

<c:url value="fmupdatedetails.jsp" var="detailupdate">
	<c:param name="transactionid" value="${transactionid}"/>
	<c:param name="bname" value="${bname}"/>
	<c:param name="bankDetails" value="${bankDetails}"/>
	<c:param name="discount" value="${discount}"/>
	<c:param name="icode" value="${icode}"/>
	<c:param name="quantity" value="${quantity}"/>
	<c:param name="proce" value="${proce}"/>
	
</c:url>

<a href="${detailupdate}">
	<input type="button" name="Update" value="Update data">
</a>



</body>
</html>