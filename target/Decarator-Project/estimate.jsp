<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Estimate</title>
	</head>
	<body style="font-family: consolas; font-size: 16px">
		Enquiry No : ${estimate.receiptNo}<br/>
		Estimate : ${estimate.estimatedAmount}<br/>
		<c:if test="${estimate.insuranceCharges gt 0}">
			Insurance Premium : ${estimate.insuranceCharges}
		</c:if>
	</body>
</html>