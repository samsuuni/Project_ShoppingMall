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
					<span class="logCheck"><a href="login" class="flex-c-m trans-04 p-lr-25"> LOG IN </a></span>
					</c:if>
					<c:if test="${!empty user.user_name}">
					<span class="logCheck"><a href="logout?page=${ pageContext.request.requestURL }" class="flex-c-m trans-04 p-lr-25"> LOG OUT </a></span>
					</c:if>
				</div>
			</div>
		</div>

		<div class="wrap-menu-desktop how-shadow1">
			<nav class="limiter-menu-desktop container">

				<!-- Logo desktop -->
				<a href="main" class="logo"> <img src="images/icons/logo-01.png"
					alt="IMG-LOGO">
				</a>

				<!-- Product Category desktop -->
				<div class="menu-desktop flex-w flex-l-m filter-tope-group m-tb-10">
				</div>



				<!-- Icon header -->
				<div class="wrap-icon-header flex-w flex-r-m">
					<!-- 장바구니에서 위에 카운트해주는거 -->
					<c:set var="cnt" value="0"/>
					<c:forEach var="cart" items="${cartList }">
						<c:set var="cnt" value="${cnt + 1 }"/>
					</c:forEach>
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
		
		
		<!-- cart image start -->
					<!-- Cart Image Start  -->
			<ul class="header-cart-wrapitem w-full">
				<c:set var="sum" value="0"/>
				<c:forEach var="cart" items="${cartList }">
				<li class="header-cart-item flex-w flex-t m-b-12">
					<div class="header-cart-item-img">
						<img src="productImg/${cart.prod_name}-cart.jpg" alt="IMG">
					</div>

					<div class="header-cart-item-txt p-t-8">
						<a href="#" class="header-cart-item-name m-b-18 hov-cl1 trans-04">
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
					<a href="shopping_cart?user_id=${user.user_id }"
						class="flex-c-m stext-101 cl0 size-107 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-r-8 m-b-10">
						View Cart </a> <a href="checkout"
						class="flex-c-m stext-101 cl0 size-107 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-b-10">
						Check Out </a>
				</div>
			</div>
			
			
		</div>
	</div>
</div>




