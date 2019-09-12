<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"
	integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
	crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.hov-btn4:hover {
  border-color: #db5642;
  background-color: #db5642;
  color: #fff;
}
</style>
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css?1">
<!--===============================================================================================-->
</head>
<body>
<div class="container">
<div class="row">
			<div style="margin-left: 90px;">
				<div class="wrap-table-shopping-cart" style="margin-top: 40px;">
					<table class="table-shopping-cart">
						<tr class="table_head">
							<th class="column-1">Product</th>
							<th class="column-2"></th>
							<th class="column-3">Price</th>
							<th class="column-4" style="text-align: center;">Amount</th>
							<th class="column-5" style="text-align: center;">Total</th>
						</tr>


						<tr class="table_row">
							<td class="column-1">
								<div class="how-itemcart1">
									<img src="productImg/${param.prod_name}-cart.jpg" alt="IMG">
								</div>
							</td>
							<td class="column-2">${param.prod_name}</td>
							<td class="column-3">${param.prod_price}</td>
							<td class="column-4">
								<div style="text-align: center">
									<input class="mtext-104 cl3 txt-center cartAmt"
										style="width: 100%; text-align: center" type="number"
										name="prod_cartAmt" readonly="readonly" value="${param.prod_cartAmt}">
								</div>
							</td>
							<td class="p-column-5">
								<input type="number" class="mtext-104 cl3 totalPrice"  style="font-weight: bold; font-size: 16px; text-align: center;" name="prod_totalPrice" readonly="readonly" value="${param.prod_totalPrice}">
								<input type="hidden" class="cart_id" name="cart_id" value="${param.cart_id }">
								<input type="hidden" class="price" value="${param.prod_price }">
								<input type="hidden" class="user_id" value="${param.user_id }">
							</td>
						</tr>

					</table>
				</div>
				<div>
				<div style="text-align: center;"><h3>Press [YES] to delete the item from the cart</h3></div>
					<div><button class="flex-c-m stext-101 cl2 size-119 bg8 bor13 hov-btn4 p-lr-15 trans-04 pointer m-tb-10 float-l yes" style="margin-left: 400px;">yes</button></div>
					<div><button class="flex-c-m stext-101 cl2 size-119 bg8 bor13 hov-btn3 p-lr-15 trans-04 pointer m-tb-10 no" style="margin-right: 100px;">no</button></div>
				</div>
		</div>
		
		
	<input type="hidden" class="user_id" value="${param.user_id }">
	<input type="hidden" class="cart_id" value="${param.cart_id }">
	<input type="hidden" class="prod_cartAmt" value="${param.prod_cartAmt }">
	

</div>
	<script src="js/cartUpdate.js?1"></script>
</body>
</html>