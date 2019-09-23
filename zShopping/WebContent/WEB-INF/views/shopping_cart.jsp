<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
   <title>Shopping Cart</title>
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
   <link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
   <link rel="stylesheet" type="text/css" href="css/util.css">
   <link rel="stylesheet" type="text/css" href="css/main.css?1">
<!--===============================================================================================-->
</head>
<body class="animsition">
   <jsp:include page="header.jsp"/>
   <!-- Shopping Cart -->
   <!-- <form class="bg0 p-t-75 p-b-85"> -->
      <div class="container">
         <div class="row" style="margin-top: 50px;">
            <div class="col-lg-10 col-xl-7 m-lr-auto m-b-50">
               <div class="m-l-25 m-r--38 m-lr-0-xl">
                  <div class="wrap-table-shopping-cart">
                     <table class="table-shopping-cart">
                        <tr class="table_head">
                           <th class="column-1" colspan="2">Product</th>
                           <th class="column-3">Price</th>
                           <th class="column-4" style="text-align: center;">Amount</th>
                           <th class="column-5">Total</th>
                           <th class="p-column-6" style="padding: 15px 20px 15px 20px;">Update</th>
                           <th class="p-column-7" style="padding: 15px 20px 15px 20px;">Delete</th>
                        </tr>
                        
                        <c:set var="sum" value="0"/>
                        <c:forEach var="cart" items="${cartList }">

                        <tr class="table_row">
                           <td class="column-1">
                              <div class="how-itemcart1">
                                 <img src="productImg/${cart.prod_name}-cart.jpg" alt="IMG">
                              </div>
                           </td>
                           <td class="column-2"><a href="product-detail?prod_id=${cart.prod_id}" class="clblack">${cart.prod_name }</a></td>
                           <td class="column-3">${cart.prod_price }</td>
                           <td class="column-4">${cart.prod_cartAmt }
                           		<%-- <div>
                                 <input class="mtext-104 cl3 txt-center num-product" style="width:100%;" type="number" name="num-product1" value="${cart.prod_cartAmt }">
                                 </div> --%>
                           </td>
                           <td class="column-5" style="font-weight: bold; font-size: 16px;">${cart.prod_totalPrice }
                           </td>
                           <td class="colume-6" style="text-align: center;">
                           		<button onclick="window.open('shoppingCartUpdate?user_id=${user.user_id }&cart_id=${cart.cart_id}&prod_name=${cart.prod_name}&prod_price=${cart.prod_price}&prod_cartAmt=${cart.prod_cartAmt}&prod_totalPrice=${cart.prod_totalPrice}','shoppingCartUpdate','width=1300,height=400,location=yes,scrollbars=no, left=300, top=200')">
                           			<img src="images/icons/update3_25.jpg">
                           		</button>
                           	</td>
                            <td class="colume-6" style="text-align: center;">
                           		<button onclick="window.open('shoppingCartDelete?user_id=${user.user_id }&cart_id=${cart.cart_id}&prod_name=${cart.prod_name}&prod_price=${cart.prod_price}&prod_cartAmt=${cart.prod_cartAmt}&prod_totalPrice=${cart.prod_totalPrice}','shoppingCartUpdate','width=1300,height=400,location=yes,scrollbars=no, left=300, top=200')">
                           			<img src="images/icons/delete2_25_red.jpg">
                           		</button>
                            </td>
                            <c:set var="sum" value="${sum+cart.prod_totalPrice}"/>
                        </tr>
                        </c:forEach>
                     </table>
                  </div>







               </div>
            </div>


            <div class="col-sm-10 col-lg-7 col-xl-5 m-lr-auto m-b-50">
               <div class="bor10 p-lr-40 p-t-30 p-b-40 m-l-63 m-r-40 m-lr-0-xl p-lr-15-sm">
                  <h4 class="mtext-109 cl2 p-b-30">
                     Cart Totals
                  </h4>

                  <div class="flex-w flex-t p-t-27 p-b-33">
                     <div class="size-208">
                        <span class="mtext-101 cl2">
                           Total:
                        </span>
                     </div>

                     <div class="size-209 p-t-1">
                        <span class="mtext-110 cl2" style="font-weight: bold; font-size: 20px;">
                           <c:out value="${sum }"/>
                        </span>
                     </div>
                  </div>

                   <a href="checkout?user_id=${user.user_id }" class="flex-c-m stext-101 cl0 size-116 bg3 bor14 hov-btn3 p-lr-15 trans-04 pointer">
                     Proceed to Checkout
                  </a>
               </div>
            </div>
         </div>
      </div>
   <!-- </form> -->
      
      <jsp:include page="footer.jsp"/>
</body>
</html>