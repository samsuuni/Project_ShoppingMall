<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>checkout</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Mukta:300,400,700"> 
    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">
    <link rel="stylesheet" href="css/jquery-ui.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">


    <link rel="stylesheet" href="css/aos.css">

    <link rel="stylesheet" href="css/style.css?1">
    
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
   <link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
   <link rel="stylesheet" type="text/css" href="css/util.css">
   <link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
    
    
  </head>
  <body>
  <jsp:include page="header.jsp"/>
  
  <div class="site-wrap">

    <div class="site-section">
      <div class="container">
        
        <div class="row">
          <div class="col-md-6 mb-5 mb-md-0">
            <h2 class="h3 mb-3 text-black">Billing Details</h2>
            <div class="p-3 p-lg-5 border">
             
              <div class="form-group row">
                <div class="col-md-6">
                  <label for="c_fname" class="text-black">Name <span class="text-danger">*</span></label>
                  <input type="text" class="form-control" id="c_fname" name="c_fname" value="${user.user_name }">
                </div>
              </div>

              <div class="form-group row">
              
                <div class="col-md-12">
                
                  <label for="c_address" class="text-black">Address <span class="text-danger">*</span></label>
					<div style="float: left;"><input type="text"  class="form-control" id="zipNo" style="width:150px;, float: left;" readonly="readonly" value="${user.user_postAddress }"></div>
                    <div> <input type="button" onClick="addressSearch();" class="btn" value="Address Search"/></div>
    				<div><input type="text"  class="form-control" id="roadAddr" readonly="readonly" value="${user.user_address }"></div>
       				<input type="text"  class="form-control" id="addrDetail" readonly="readonly" value="${user.user_detailAddress }">
                  
                </div>
                

                
              </div>

              <div class="form-group row mb-5">
                <div class="col-md-6">
                  <label for="c_email_address" class="text-black">Email Address <span class="text-danger">*</span></label>
                  <input type="text" class="form-control" id="c_email_address" name="c_email_address" value="${user.user_loginId }">
                </div>
                <div class="col-md-6">
                  <label for="c_phone" class="text-black">Phone <span class="text-danger">*</span></label>
                  <input type="text" class="form-control" id="c_phone" name="c_phone" value="${user.user_phone }">
                </div>
              </div>
              
             
              
              <div class="form-group row mb-5">
                <div class="col-md-6">
                  <label for="c_creditcard_number" class="text-black">Credit Card Number <span class="text-danger">*</span></label>
                  <input type="text" class="form-control" id="c_creditcard_number" name="c_creditcard_number">
                </div>
                <div class="col-md-6">
                  <label for="c_creditcard_pwd" class="text-black">Password <span class="text-danger">*</span></label>
                  <input type="text" class="form-control" id="c_creditcard_pwd" name="c_creditcard_pwd">
                </div>
              </div>
              
               <div class="form-group">
                <label for="c_order_notes" class="text-black">Order Notes</label>
                <textarea name="c_order_notes" id="c_order_notes" cols="30" rows="5" class="form-control" placeholder="Write your notes here..."></textarea>
              </div>
                          

            </div>
          </div>
          <div class="col-md-6">
            
            <div class="row mb-5">
              <div class="col-md-12">
                <h2 class="h3 mb-3 text-black">Your Order</h2>
                <div class="p-3 p-lg-5 border">
                  <table class="table site-block-order-table mb-5">
                    <thead>
                    <tr>
                      <th>Product</th>
                      <th>Total</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:set var="sum" value="0"/>
                    <c:forEach var="cart" items="${cartList }">
                      <tr>
                        <td>${cart.prod_name }(${cart.prod_price }) <strong class="mx-2">x</strong> ${cart.prod_cartAmt }</td>
                        <td>${cart.prod_totalPrice }</td>
                      </tr>
                    <c:set var="sum" value="${sum+cart.prod_totalPrice}"/>
                    </c:forEach>
                      <tr>
                        <td class="text-black font-weight-bold"><strong>Order Total</strong></td>
                        <td class="text-black font-weight-bold"><strong><c:out value="${sum }"/></strong></td>
                      </tr>
                    </tbody>
                  </table>

                  


                  <div class="form-group">
                    <a href="confirm_order?user_id=${user.user_id }" class="btn btn-primary btn-lg py-3 btn-block">Place Order</a>
                  </div>

                </div>
              </div>
            </div>

          </div>
        </div>
        <!-- </form> -->
      </div>
    </div>

  </div>
  <jsp:include page="footer.jsp"/>
  

  <script src="js/jquery-3.3.1.min.js"></script>
  <script src="js/jquery-ui.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/jquery.magnific-popup.min.js"></script>
  <script src="js/aos.js"></script>

  <script src="js/main_checkout.js"></script>
  <script type="text/javascript">

	function addressSearch(){
		// 주소검색을 수행할 팝업 페이지를 호출합니다.
		// 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrEngUrl.do)를 호출하게 됩니다.
		var pop = window.open("jusoPopup","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
	}
	

	function jusoCallBack(roadFullAddr, roadAddr, addrDetail, zipNo){
			// 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.
			document.getElementById("zipNo").value = zipNo;
			document.getElementById("roadAddr").value = roadAddr;
			document.getElementById("addrDetail").value = addrDetail;
	}
	
  </script>
  </body>
</html>