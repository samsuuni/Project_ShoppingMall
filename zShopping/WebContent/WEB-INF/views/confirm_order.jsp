<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title></title>
<style type="text/css">
body
{
 text-align: center;
}
h2 {
	margin: 20px;
}
#box
{
 position: absolute;
 width: 500px;
 height: 500px;
 left: 50%;
 top: 50%;
 margin-left: -250px;
 margin-top: -250px;

}
</style>
<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.png"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/linearicons-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/slick/slick.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/MagnificPopup/magnific-popup.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<%-- <body class="animsition">
<jsp:include page="header.jsp" />
	
	<div class="bg0 m-t-23 p-b-140">
		<div class="container">
			
			<div class="row isotope-grid">
			
			</div>
		</div>
	</div> --%>


<body class="animsition">
   <jsp:include page="header.jsp"/>
   <!-- Shopping Cart -->
   <!-- <form class="bg0 p-t-75 p-b-85"> -->
      <div class="container">
         <div class="row" style="margin-top: 50px;">
         <div >
         	<h1>Order Completed</h1>
         	</div>
         	<div class="container" style="margin-top: 20px; margin-bottom: 20px;">
				<h2 style="margin: 20px;">Your order has been completed</h2>
				 <table class="table site-block-order-table mb-5">
                    <thead>
                    <tr>
                      <th style="text-align: center;">Product</th>
                      <th style="text-align: center;">Total</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:set var="sum" value="0"/>
                    <c:forEach var="order" items="${orderList }">
                      <tr>
                        <td style="text-align: center;">${order.prod_name }(${order.prod_price }) <strong class="mx-2">x</strong> ${order.prod_cartAmt }</td>
                        <td style="text-align: center;">${order.prod_totalPrice }</td>
                      </tr>
                    <c:set var="sum" value="${sum+order.prod_totalPrice}"/>
                    </c:forEach>
                      <tr>
                        <td class="text-black font-weight-bold"><strong>Order Total</strong></td>
                        <td class="text-black font-weight-bold"><strong><c:out value="${sum }"/></strong></td>
                      </tr>
                    </tbody>
                  </table>
                  <div style="float: right;">
                  <a href="product?page=1" style="float: left;">
                  	<button class="flex-c-m stext-101 cl2 size-119 bg8 bor13 hov-btn3 p-lr-15 trans-04 pointer m-tb-10" style="float: left;">
                  		home
                  	</button>
                  </a>
                  <a href="myhistory?user_id=${user.user_id }">
                  	<button class="flex-c-m stext-101 cl2 size-119 bg8 bor13 hov-btn3 p-lr-15 trans-04 pointer m-tb-10">
                  		history
                  	</button>
                  </a>
                  </div>
         </div>
         </div>
         </div>
         

































<jsp:include page="footer.jsp" />
</body>
</html>