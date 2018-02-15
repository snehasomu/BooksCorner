 <%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Product Display</title>
 </head>
<body>
<%@ include file="header2.jsp" %>
<h2>Welcome ${cart.userName}</h2>
<div class="container">
<table class="table table-bordered">
    <thead>
 <tr bgcolor="gray">
 <th>Product Id</th>
 <th>UserName</th>
	<th>Product Name</th>
	<th>Quantity</th>
	<th>UnitPrice</th>
	<th>Operation</th>
	
	</tr>
	</thead>

<c:forEach items="${cartList}" var="cart">
	<tr>
	
	<td>
							
								<div class="row">
									
									<div class="col-sm-10">
									    <h3 class="hidden" id="iid"> ${cart.citemid}</h3>
										<h4 class="nomargin" id="pn">${cart.productId}</h4>
									</div>
								</div>
							</td>
	<td>${cart.userName}</td>
		<td>${cart.productName}</td>
		<td><select > 
							        <option selected="selected">1</option>
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                              		<option value="4">4</option>
                   					<option value="5">5</option>
                    				<option value="6">6</option>
                    				<option value="7">7</option>
                    				<option value="8">8</option>
                    				<option value="9">9</option>
                    				<option value="10">10</option>
                			</select></td>
		<td>${cart.productUnitPrice}</td>
			
			<td>
			<a href="<c:url value="deleteCart/${cart.citemid}"/>"><i class="fa fa-trash-o fa-3x"></i>Remove from cart</a>
			
			</td>	
			
				</tr>
</c:forEach>
</table>
</div>
<center><h2><a href="payment" ><span class="glyphicon glyphicon-credit-card"></span>Checkout</a></h2></center>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<%@ include file="footer.jsp" %>
</body>
</html>