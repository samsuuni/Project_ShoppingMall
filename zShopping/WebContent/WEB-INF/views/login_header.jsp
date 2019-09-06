<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Header -->
<header class="header-v4">
	<!-- Header desktop -->
	<div class="container-menu-desktop">
		<!-- Topbar -->
		<div class="top-bar">
			<div class="content-topbar flex-sb-m h-full container">
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
	</div>
</header>










