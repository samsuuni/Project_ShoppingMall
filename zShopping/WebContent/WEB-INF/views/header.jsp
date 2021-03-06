<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Header -->
<header class="header-v4">
	<!-- Header desktop -->
	<div class="container-menu-desktop">
	
	
		<!-- Topbar -->
		<div class="top-bar">
			<div class="content-topbar flex-sb-m h-full container" style="background-color: #222222;">
				<c:if test="${empty user.user_name}">
				<div class="left-top-bar">please login your account</div>
				</c:if>
				<c:if test="${!empty user.user_name}">
				<div class="left-top-bar">welcome ${user.user_name }</div>
				</c:if>

				<div class="right-top-bar flex-w h-full">
					<c:if test="${empty user.user_name}">
					<span class="logCheck"><a href="signUp" class="flex-c-m trans-04 p-lr-25"> SIGN UP </a></span>
					<span class="logCheck"><a href="#none" onclick="location.href='login?returnUrl='+encodeURIComponent(location)" class="flex-c-m trans-04 p-lr-25"> LOG IN </a></span>
					</c:if>
					<c:if test="${!empty user.user_name}">
					<span class="myPage"><a href="mypage?user_id=${user.user_id }" class="flex-c-m trans-04 p-lr-25"> My Page </a></span>
					<span class="myPage"><a href="myhistory?user_id=${user.user_id }" class="flex-c-m trans-04 p-lr-25"> History </a></span>
					<span class="logCheck"><a href="logout" class="flex-c-m trans-04 p-lr-25"> LOG OUT </a></span>
					</c:if>
				</div>
			</div>
		</div>

		<div class="wrap-menu-desktop how-shadow1">
			<nav class="limiter-menu-desktop container">

				<!-- Logo desktop -->
				<a href="product?page=1" class="logo"> <img src="images/icons/logo-01.png"
					alt="IMG-LOGO">
				</a>

				<!-- Product Category desktop -->
				<div class="menu-desktop flex-w flex-l-m filter-tope-group m-tb-10">
					<ul class="main-menu">

						<li class="productActive">
							<a href="product?page=1" class="stext-106 cl6 hov1 bor3 trans-04 m-r-32 m-tb-5 category0"
								data-filter=".watches">All product</a>
						</li>

						<li>
							<a href="productCategory?page=1&prod_category=category1" class="stext-106 cl6 hov1 bor3 trans-04 m-r-32 m-tb-5 category1">
								category1
							</a>
						</li>

						<li>
							<a href="productCategory?page=1&prod_category=category2" class="stext-106 cl6 hov1 bor3 trans-04 m-r-32 m-tb-5 category2">
								category2
							</a>
						</li>

						<li>
							<a href="productCategory?page=1&prod_category=category3" class="stext-106 cl6 hov1 bor3 trans-04 m-r-32 m-tb-5 category3">
								category3
							</a>
						</li>

						<li>
							<a href="productCategory?page=1&prod_category=category4" class="stext-106 cl6 hov1 bor3 trans-04 m-r-32 m-tb-5 category4">
								category4
							</a>
						</li>
						<li>
							<a href="productCategory?page=1&prod_category=category5" class="stext-106 cl6 hov1 bor3 trans-04 m-r-32 m-tb-5 category5">
								category5
							</a>
						</li>
						<li>

						</li>
					</ul>
				</div>



				<!-- Icon header -->
				<div class="wrap-icon-header flex-w flex-r-m">
				<!-- 장바구니에서 위에 카운트해주는거 -->
				<c:set var="cnt" value="0"/>
				<c:if test="${!empty cart_count}">
					<c:set var="cnt" value="${cart_count }"></c:set>
				</c:if>
					<c:forEach var="cart" items="${cartList }">
						<c:set var="cnt" value="${cnt + 1 }"/>
					</c:forEach>
					<!-- product Search -->
					<form action="productSearch">
						<input type="hidden" name="page" value="1">
						<input type="text" style="width: 170px; height:25px; border: 1px solid gray; float: left;" name="prod_name" placeholder="search">&nbsp;
						<!-- <a href="productSearch"><img src="images/icons/search.jpg" style="width: 20px;"></a> -->
						<button><img src="images/icons/search.jpg" style="width: 20px;"></button>
					</form>
						
					<div
						class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 icon-header-noti js-show-cart"
						data-notify="${cnt }">
						<i class="zmdi zmdi-shopping-cart"></i>
					</div>
				</div>
			</nav>
		</div>
	</div>
</header>



<!-- Cart -->
<div class="wrap-header-cart js-panel-cart">
	<div class="s-full js-hide-cart"></div>

	<div class="header-cart flex-col-l p-l-65 p-r-25">
		<div class="header-cart-title flex-w flex-sb-m p-b-8">
			<span class="mtext-103 cl2"> Your Cart </span>

			<div
				class="fs-35 lh-10 cl2 p-lr-5 pointer hov-cl1 trans-04 js-hide-cart">
				<i class="zmdi zmdi-close"></i>
			</div>
		</div>

		<div class="header-cart-content flex-w js-pscroll">
			<!-- Cart Image Start  -->
			<ul class="header-cart-wrapitem w-full">
				<c:set var="sum" value="0"/>
				<c:forEach var="cart" items="${cartList }">

				<li class="header-cart-item flex-w flex-t m-b-12">
					<div class="header-cart-item-img">
						<%-- <img src="productImg/${cart.prod_name}-cart.jpg" alt="IMG"> --%>
						<img src="productImg/${cart.prod_name}-cart.jpg" alt="IMG">
					</div>

					<div class="header-cart-item-txt p-t-8">
						<a href="product-detail?prod_id=${cart.prod_id}" class="header-cart-item-name m-b-18 hov-cl1 trans-04">
							${cart.prod_name } </a> <span class="header-cart-item-info"> ${cart.prod_cartAmt }
							x $${cart.prod_price } </span>
					</div>
				</li>
				<c:set var="sum" value="${sum + cart.prod_totalPrice }"/>
				</c:forEach>

			</ul>
			<!-- Cart Image End  -->

			<div class="w-full">
				<div class="header-cart-total w-full p-tb-40">Total: ${sum }</div>

				<div class="header-cart-buttons flex-w w-full">
					<c:if test="${empty user.user_id}">
					<a href="shopping_cart?user_id=0" class="flex-c-m stext-101 cl0 size-107 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-r-8 m-b-10">
						View Cart 
					</a> 
					<a href="checkout?user_id=0" class="flex-c-m stext-101 cl0 size-107 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-b-10">
						Check Out 
					</a>
					</c:if>
					<c:if test="${!empty user.user_id}">
					<a href="shopping_cart?user_id=${user.user_id }" class="flex-c-m stext-101 cl0 size-107 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-r-8 m-b-10">
						View Cart 
					</a> 
					<a href="checkout?user_id=${user.user_id }" class="flex-c-m stext-101 cl0 size-107 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-b-10">
						Check Out 
					</a>
					</c:if>
				</div>
			</div>
			
			
		</div>
	</div>
</div>




