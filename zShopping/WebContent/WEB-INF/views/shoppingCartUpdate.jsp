<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"
	integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
	crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
<head>
<title>Shopping Cart Update</title>
<meta charset="UTF-8">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css?1">
<!--===============================================================================================-->
<script>
</script>
</head>
<body class="cartUpdateBody">

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
							<th class="column-6"></th>
							<th class="column-7"></th>
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
							<td class="colume-6 upBtn"><button class="flex-c-m pageBtnstext cl5 pageBtnSize bg2 bor1 hov-btn1 p-lr-15 trans-04" style="line-height: 3;">▲</button></td>
							<td class="colume-6 downBtn"><button class="flex-c-m pageBtnstext cl5 pageBtnSize bg2 bor1 hov-btn1 p-lr-15 trans-04" style="line-height: 3;">▼</button></td>
						</tr>

					</table>
				</div>
				<div class="flex-w flex-sb-m bor15 p-t-18 p-b-15 p-lr-40 p-lr-15-sm">
					<div class="flex-w flex-m m-r-20 m-tb-5"></div>
							<button class="flex-c-m stext-101 cl2 size-119 bg8 bor13 hov-btn3 p-lr-15 trans-04 pointer m-tb-10 close">Update Cart</button>
				</div>
			</div>
		</div>
	</div>
	
	<script src="js/cartUpdate.js?1"></script>
	
	
</body>
</html>