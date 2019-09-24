<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>My Page</title>

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">

<!-- Page level plugin CSS-->
<link href="vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin.css?1" rel="stylesheet">

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
	href="vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/signUp2.css">

<style type="text/css">
.breadcrumb {
	font-family: Poppins-Medium;
}

.card-header {
	font-family: Poppins-Medium;
}
</style>
</head>

<body id="page-top" style="background-color: white;">
	<jsp:include page="header.jsp" />
	<div id="wrapper">

		<div id="content-wrapper">

			<div class="container-fluid">

				<!-- Breadcrumbs-->
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="mypage?user_id=${user.user_id }">My Info</a></li>
					<li class="breadcrumb-item"><a
						href="myhistory?user_id=${user.user_id }">History</a></li>
				</ol>

				<div class="card mb-3">
					<div class="card-header">
						<i class="fas fa-fw fa-folder"></i> My Information
					</div>
					<div class="card-body">
						<div class="signup-content">
							<div class="signup-img">
								<img src="images/signup-img.jpg" alt="">
							</div>
							<div class="signup-form">
								<form method="POST" class="register-form" id="register-form" name="form">
								
									<input type="hidden" class="user_id" name="user_id" value="${user.user_id }">

									<div class="form-group">
										<label for="email">E-mail ID :</label>
										<input type="email" name="user_loginId" id="loginId"
										 value="${user.user_loginId }" readonly="readonly" required />
									</div>

									<div class="form-group">
										<label for="name">Name :</label>
										<input type="text" name="user_name" id="name" 
										value="${user.user_name }" readonly="readonly" required />
									</div>
									<div class="form-radio">
										<label for="gender" class="radio-label">Gender :</label>
										<div class="form-radio-item">
											<input type="radio" name="user_gender" id="male" value="male"
											<c:if test="${user.user_gender eq 'male' }">checked</c:if>
											disabled />
										<label for="male">Male</label>
										<span class="check"></span>
										</div>
										<div class="form-radio-item">
											<input type="radio" name="user_gender" id="female" value="female"
											<c:if test="${user.user_gender eq 'female' }">checked</c:if>
											disabled /> <label for="female">Female</label> <span
											class="check"></span>
										</div>
									</div>
									<div class="form-low">
										<div class="form-group">
											<label for="password">Password :</label> <input
												type="password" name="user_password" id="password">
										</div>
										<div class="form-group">
											<label for="pw-verification">Password verification :</label>
											<input type="password" name="pw-verification"
												id="pw-verification">
										</div>
									</div>
									<div class="form-group">
										<label for="address">Address</label>
										<div style="float: left;">
											<input type="text" id="zipNo" style="width: 150px; , float: left;" readonly="readonly" 
											value="${user.user_postAddress }" placeholder="post number" name="user_postAddress">
										</div>
										<div>
											&nbsp;&nbsp;
											<input type="button" onClick="addressSearch();"
											class="submit" value="Address Search" />
										</div>
										<div>
										<input type="text" id="roadAddr" readonly="readonly" value="${user.user_address }"
											placeholder="address" name="user_address">
										</div>
										<input type="text" id="addrDetail" readonly="readonly" value="${user.user_detailAddress }"
											placeholder="detail address" name="user_detailAddress">
										
									</div>
									<div class="form-group">
										<label for="birth_date">Date Of Birth :</label>
										<input type="text" name="user_birth" id="birth_date"
										value="${user.user_birth }" readonly>

									</div>
									<div class="form-group">
										<label for="phone">Phone :</label>
										<input type="text" name="user_phone" id="phone" value="${user.user_phone }">
									</div>

									<div class="form-submit">
										<input type="submit" value="Reset" class="submit" name="reset" id="reset" />
										<input type="submit" value="Update" class="submit" name="submit" id="submit" />
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>

			</div>
			<!-- /.container-fluid -->

		</div>
		<!-- /.content-wrapper -->

	</div>
	<!-- /#wrapper -->


	<jsp:include page="footer.jsp" />
	<!-- JS -->
	<script>
		function addressSearch() {
			// 주소검색을 수행할 팝업 페이지를 호출합니다.
			// 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrEngUrl.do)를 호출하게 됩니다.
			var pop = window.open("jusoPopup", "pop",
					"width=570,height=420, scrollbars=yes, resizable=yes");
		}

		function jusoCallBack(roadFullAddr, roadAddr, addrDetail, zipNo) {
			// 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.
			document.form.roadAddr.value = roadAddr;
			document.form.addrDetail.value = addrDetail;
			document.form.zipNo.value = zipNo;
		}
		
		$('#reset').on('click', function(){
		      $('#register-form').reset();
		});
		  
		 
		  
		  //입력 유효성 검사
		$('#submit').on('click', function(){
			  
			var user_password = "${user.user_password}";
			  
			 if($('#password').val() != user_password){
				 alert("please check password")
				 return false;
			 }
		    
		     if($('#password').val().length == 0){
		         alert("Please write password");
		         $("#password").focus();
		         return false;
		     }
		    
		     var passRule = /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
		     if(!passRule.test($('#password').val())) {
		    	 	alert("Please make your password at least as long as 8~15blanks, with a combination of letters, numbers, and marks.")
		    	 	$("#password").focus();
		    	    return false;
		    	}
		     
		     if($('#password').val() != $('#pw-verification').val()){
		           alert("Password and confirm password does not match"); 
		           $("#pw-verification").focus();
		           return false; 
		     }
		       
		     if($('#phone').val().length == 0){
		         alert("Please write phone number"); 
		         $("#phone").focus();
		         return false;
		     }
		     var phoneExp = /^\d{3}-\d{3,4}-\d{4}$/;
		     if(!phoneExp.test($('#phone').val())) {
		    	 alert("Please Enter Phone Number : 000-0000-0000");
		    	 $("#phone").focus();
		    	 return false;
		     } else{
		     }
		     

		     $("#register-form").attr("action","updateUser");
		     $("#register-form").submit();
		  });
	</script>

	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Page level plugin JavaScript-->
	<script src="vendor/datatables/jquery.dataTables.js"></script>
	<script src="vendor/datatables/dataTables.bootstrap4.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="js/sb-admin.min.js"></script>

	<!-- Demo scripts for this page-->
	<script src="js/demo/datatables-demo.js"></script>

</body>

</html>