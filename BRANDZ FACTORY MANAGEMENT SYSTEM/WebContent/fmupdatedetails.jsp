<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String id=request.getParameter("transactionid");
		String buyname=request.getParameter("bname");
		String BankDetails=request.getParameter("bankDetails");
		String Dis=request.getParameter("discount");
		String icode=request.getParameter("icode");
		String quantity=request.getParameter("quantity");
		String price=request.getParameter("proce");
	
	%>

	<form action="#" method="post">
		Transaction ID<input type="text" name="transid" value="<%=id %>"><br>
		Buyer name<input type="text" name="Bname"value="<%=buyname %>"><br>
		Bank details<input type="text" name="Bank-details"value="<%=BankDetails %>"><br>
		Discount<input type="text" name="Disount"value="<%=Dis %>"><br>
		item code <input type="text" name="icode"value="<%=icode %>"><br>
		Quantity<input type="text" name="quan"value="<%=quantity %>"><br>
		Price <input type="text" name="Price"value="<%=price %>"><br>

	<input type="submit" name="submit" value="update"> <button> cancel </button>
 
</form>


</body>
</html>