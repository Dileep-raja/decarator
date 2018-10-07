<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Service Request</title>
	</head>
	<body style="font-family: consolas; font-size: 16px">
		<h2>Service Request</h2>
		<form action="${pageContext.request.contextPath}/service-request" method="post">
			<table>
				<tr>
					<td>Who?:</td>
					<td>
						<input type="text" name="who"/>
					</td>
				</tr>
				<tr>
					<td>From:</td>
					<td>
						<input type="text" name="from"/>
					</td>
				</tr>
				<tr>
					<td>To:</td>
					<td>
						<input type="text" name="to"/>
					</td>
				</tr>
				<tr>
					<td>Type:</td>
					<td>
						<select name="serviceType">
							<option value="transport">Transport</option>
							<option value="movement">Movement</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>Weight/Parts</td>
					<td>
						<input type="text" name="parts"/>
					</td>
				</tr>
				<tr>
					<td>
						<input type="checkbox" name="insurance" value="1"/>
					</td>
					<td>
						Looking for Insurance on these services?
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<button type="submit">Request</button>
					</td>
				</tr>
			</table>
		</form>	
	</body>
</html>









