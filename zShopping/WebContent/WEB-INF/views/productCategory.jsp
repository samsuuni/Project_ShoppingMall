<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Product Page</title>
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
<body class="animsition">

<jsp:include page="header.jsp"/>

	<!-- Product -->
	<div class="bg0 m-t-23 p-b-140">
		<div class="container">
		
			<div class="row isotope-grid">
			
			
				<!-- Block2 -->
				<!-- 상품 하나블록 -->
<!-- 				<div class="col-sm-6 col-md-4 col-lg-3 p-b-35 isotope-item women">
					<div class="block2">
					
						<div class="block2-pic hov-img0">
							<img src="images/product-01.jpg" alt="IMG-PRODUCT">
						</div>

						<div class="block2-txt flex-w flex-t p-t-14">
							<div class="block2-txt-child1 flex-col-l ">
								<a href="product-detail.html" class="stext-104 cl4 hov-cl1 trans-04 js-name-b2 p-b-6">
									Product Name
								</a>

								<span class="stext-105 cl3">
									$Product Price
								</span>
							</div>
						</div>
					</div>
				</div> -->
				
				
				<c:set var="begin" value="${productList.size()}"/>
				<c:set var="end" value="0"/>
				
				<c:forEach var="product" items="${productList }">
				
				<div class="col-sm-6 col-md-4 col-lg-3 p-b-35 isotope-item ${product.prod_category}">
					<div class="block2">
					
						<div class="block2-pic hov-img0">
							<img src="productImg/${product.prod_name}.jpg" alt="IMG-PRODUCT">
						</div>

						<div class="block2-txt flex-w flex-t p-t-14">
							<div class="block2-txt-child1 flex-col-l ">
								<a href="product-detail.html" class="stext-104 cl4 hov-cl1 trans-04 js-name-b2 p-b-6">
									Product Name : ${product.prod_name }
								</a>

								<span class="stext-105 cl3">
									$Product Price : ${product.prod_price }
								</span>
							</div>
						</div>
					</div>
				</div>
				</c:forEach>
				
				<!-- ajax로 화면 요청하기 만들기 -->
				<!-- div append로 -->
				<!-- 상품 전부 가져왔으면 load more버튼 없애기 -->
				
<%-- 				<div class="test" style="display: none">
				<c:forEach var="product" items="${productList }">
				
				<div class="col-sm-6 col-md-4 col-lg-3 p-b-35 isotope-item ${product.prod_category}">
					<div class="block2">
					
						<div class="block2-pic hov-img0">
							<img src="productImg/${product.prod_name}.jpg" alt="IMG-PRODUCT">
						</div>

						<div class="block2-txt flex-w flex-t p-t-14">
							<div class="block2-txt-child1 flex-col-l ">
								<a href="product-detail.html" class="stext-104 cl4 hov-cl1 trans-04 js-name-b2 p-b-6">
									Product Name : ${product.prod_name }
								</a>

								<span class="stext-105 cl3">
									$Product Price : ${product.prod_price }
								</span>
							</div>
						</div>
					</div>
				</div>
				</c:forEach> --%>
				
				
				
				</div>
			</div>

			<!-- Load more -->
			<div class="flex-c-m flex-w w-full p-t-45">
				<!-- <a href="#" class="flex-c-m stext-101 cl5 size-103 bg2 bor1 hov-btn1 p-lr-15 trans-04">
					Load More
				</a> -->
				
				<c:forEach var="i" begin="0" end="5">
					
					<a href="#">${i }</a>
				
				</c:forEach>
				
				<button class="flex-c-m stext-101 cl5 size-103 bg2 bor1 hov-btn1 p-lr-15 trans-04 buttonTest">
					Load More${begin }
				</button>
			</div>
			
			
		</div>

		
<jsp:include page="footer.jsp"></jsp:include>




</body>
</html>