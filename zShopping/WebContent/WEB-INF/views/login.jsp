<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Login V18</title>
<style type="text/css">
html, body {
	height: 100%;
	margin: 0;
	padding: 0;
}

#contents {
	min-height: 100%;
	overflow: hidden;
}
</style>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<!-- <link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css"> -->
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="css/logutil.css">
<link rel="stylesheet" type="text/css" href="css/logmain.css">
<!--===============================================================================================-->

<!-- main css link -->
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="images/icons/favicon.png" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/linearicons-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="vendor/slick/slick.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/MagnificPopup/magnific-popup.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->

<!-- google api -->
<script src="https://apis.google.com/js/platform.js" async defer></script>
<meta name="google-signin-client_id" content="347213457559-9581admdp2ss541c7944n1nl7e8t9ef7.apps.googleusercontent.com">


</head>
<body id="" style="background-color: #666666;">
	<jsp:include page="main_header.jsp" />
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<form class="login100-form p-t-80 validate-form" action="loginCheck"
					method="post" name="loginForm">
					<input type="hidden" class="returnUrl" name="returnUrl" value="${param.returnUrl }">
					<span class="login100-form-title p-b-43"> Login to continue
					</span>

					<div class="wrap-input100 validate-input"
						data-validate="Valid email is required: ex@abc.xyz">
						<input class="input100" id="email" type="text" name="user_loginId"
							placeholder="email">
					</div>


					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<input class="input100" id="pass" type="password"
							name="user_password" placeholder="password">
					</div>

					<div class="flex-sb-m w-full p-t-3 p-b-32">
						<div class="contact100-form-checkbox"></div>

						<div>
							<a href="#" class="txt1"> Forgot Password? </a>
						</div>
					</div>


					<div class="container-login100-form-btn">
						<button class="login100-form-btn" id="loginBtn">Login</button>
					</div>
					<div class="container-login100-form-btn m-t-10">
						<div class="signup-form-btn">
							<a href="signUp"> Sign Up </a>
						</div>
					</div>

					<div class="text-center p-t-46 p-b-20">
						<span class="txt2"> or sign up using </span>
					</div>



					<div class="login100-form-social flex-c-m">

						
					<div class="g-signin2" data-onsuccess="onSignIn"></div>
					</div>
				</form>

				<div class="login100-more"
					style="background-image: url('images/bg-04.jpg');"></div>
			</div>
		</div>
	</div>

	<jsp:include page="footer.jsp"/>



	<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
	<!--===============================================================================================-->
	<script src="js/logmain.js"></script>

	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script>

	function onSignIn(googleUser){
		var auth2 = gapi.auth2.getAuthInstance();
		var profile = googleUser.getBasicProfile();
		var auth2 = gapi.auth2.getAuthInstance();
		auth2.signOut().then(function(){
		});
		location.href="signUp?user_id="+profile.getId()+"&user_name="+profile.getName()+"&user_email="+profile.getEmail();
		auth2.disconnect();
	}
	
	function signOut(){
		var auth2 = gapi.auth2.getAuthInstance();
		auth2.signOut().then(function(){
			console.log('user signed out');
		});
		auth2.disconnect();
	}

	
</script>

	

</body>
</html>