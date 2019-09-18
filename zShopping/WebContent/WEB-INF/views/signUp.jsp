<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up Form by Colorlib</title>
	<style type="text/css">
	html,body {height:100%; margin:0; padding:0;}
	</style>
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
    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="css/signUp.css">
</head>
<body id="contents" style="background-color: white;">

    <div class="main">
<jsp:include page="main_header.jsp"/>
        <div class="container">
            <div class="signup-content">
                <div class="signup-img">
                    <img src="images/signup-img.jpg" alt="">
                </div>
                <div class="signup-form">
                    <form method="POST" class="register-form" id="register-form" name="form">
                        <h2>student registration form</h2>
                        <div class="form-low">
                        	<div class="form-submit">
                        		
                        	</div>
	                        <div class="form-group">
	                            <label for="email">E-mail ID :</label>
	                            <input type="email" name="user_loginId" id="loginId" value="${param.user_email }" required/>
	                            <input type="button" value="Duplicate check" class="submit" name="Duplicate" id="Duplicate" />
	                        </div>
                        </div>
                        <div class="form-group">
                            <label for="name">Name :</label>
                            <input type="text" name="user_name" id="name" value="${param.user_name }" required/>
                        </div>
                        <div class="form-radio">
                            <label for="gender" class="radio-label">Gender :</label>
                            <div class="form-radio-item">
                                <input type="radio" name="user_gender" id="male" value="male" checked>
                                <label for="male">Male</label>
                                <span class="check"></span>
                            </div>
                            <div class="form-radio-item">
                                <input type="radio" name="user_gender" id="female" value="female">
                                <label for="female">Female</label>
                                <span class="check"></span>
                            </div>
                        </div>
                        <div class="form-low">
	                        <div class="form-group">
	                            <label for="password">Password :</label>
	                            <input type="password" name="user_password" id="password">
	                        </div>
	                        <div class="form-group">
	                            <label for="pw-verification">Password verification :</label>
	                            <input type="password" name="pw-verification" id="pw-verification">
	                        </div>
	                    </div>
                        <div class="form-group">
                            <label for="address">Address</label>
							<div style="float: left;"><input type="text" id="zipNo" style="width:150px;, float: left;" name="user_postAddress" readonly="readonly" placeholder="post number"></div>
                            <div> <input type="button" onClick="addressSearch();" class="submit" value="Address Search"/></div>
    					    <div><input type="text" id="roadAddr" readonly="readonly" name="user_address" placeholder="address"></div>
       						<input type="text" id="addrDetail" readonly="readonly" name="user_detailAddress" placeholder="detail address">
       						<input type="hidden" id="roadFullAddr" readonly="readonly" required="required">
                        </div>
                        <div class="form-group">
                            <label for="birth_date">Date Of Birth :</label>
                            <input type="date" name="user_birth" id="birth_date">
                        </div>

                        <div class="form-submit">
                            <input type="submit" value="Reset All" class="submit" name="reset" id="reset" />
                            <input type="submit" value="Submit Form" class="submit" name="submit" id="submit" />
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

	<jsp:include page="footer.jsp"/>
    <!-- JS -->
    <script>
	var msg = "${msg}";
	if(msg!=""){
		  alert(msg);
	};

	function addressSearch(){
		// 주소검색을 수행할 팝업 페이지를 호출합니다.
		// 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrEngUrl.do)를 호출하게 됩니다.
		var pop = window.open("jusoPopup","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
	}
	

/* 	function jusoCallBack(roadFullAddr, roadAddr, addrDetail, zipNo){
			// 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.
			document.form.roadFullAddr.value = roadFullAddr;
			document.form.roadAddr.value = roadAddr;
			document.form.addrDetail.value = addrDetail;
			document.form.zipNo.value = zipNo;
	} */

	function jusoCallBack(roadFullAddr, roadAddr, addrDetail, zipNo){
		// 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.
		document.getElementById("zipNo").value = zipNo;
		document.getElementById("roadFullAddr").value = roadFullAddr;
		document.getElementById("roadAddr").value = roadAddr;
		document.getElementById("addrDetail").value = addrDetail;
}
	
</script>
    <script src="vendor/jquery/signUpJquery.min.js"></script>
    <script src="js/signUp.js?1"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>