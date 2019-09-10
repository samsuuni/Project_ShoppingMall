<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Footer -->
<footer class="bg3 p-t-75 p-b-32">
	<div class="container">
		<div class="row">
			<div class="col-sm-6 col-lg-3 p-b-50">
				<h4 class="stext-301 cl0 p-b-30">Categories</h4>

				<ul>
					<li class="p-b-10"><a href="#"
						class="stext-107 cl7 hov-cl1 trans-04"> Women </a></li>

					<li class="p-b-10"><a href="#"
						class="stext-107 cl7 hov-cl1 trans-04"> Men </a></li>

					<li class="p-b-10"><a href="#"
						class="stext-107 cl7 hov-cl1 trans-04"> Shoes </a></li>

					<li class="p-b-10"><a href="#"
						class="stext-107 cl7 hov-cl1 trans-04"> Watches </a></li>
				</ul>
			</div>

			<div class="col-sm-6 col-lg-3 p-b-50">
				<h4 class="stext-301 cl0 p-b-30">Help</h4>

				<ul>
					<li class="p-b-10"><a href="#"
						class="stext-107 cl7 hov-cl1 trans-04"> Track Order </a></li>

					<li class="p-b-10"><a href="#"
						class="stext-107 cl7 hov-cl1 trans-04"> Returns </a></li>

					<li class="p-b-10"><a href="#"
						class="stext-107 cl7 hov-cl1 trans-04"> Shipping </a></li>

					<li class="p-b-10"><a href="#"
						class="stext-107 cl7 hov-cl1 trans-04"> FAQs </a></li>
				</ul>
			</div>

			<div class="col-sm-6 col-lg-3 p-b-50">
				<h4 class="stext-301 cl0 p-b-30">GET IN TOUCH</h4>

				<p class="stext-107 cl7 size-201">Any questions? Let us know in
					store at 8th floor, 379 Hudson St, New York, NY 10018 or call us on
					(+1) 96 716 6879</p>

				<div class="p-t-27">
					<a href="#" class="fs-18 cl7 hov-cl1 trans-04 m-r-16"> <i
						class="fa fa-facebook"></i>
					</a> <a href="#" class="fs-18 cl7 hov-cl1 trans-04 m-r-16"> <i
						class="fa fa-instagram"></i>
					</a> <a href="#" class="fs-18 cl7 hov-cl1 trans-04 m-r-16"> <i
						class="fa fa-pinterest-p"></i>
					</a>
				</div>
			</div>

			<div class="col-sm-6 col-lg-3 p-b-50">
				<h4 class="stext-301 cl0 p-b-30">Newsletter</h4>

				<form>
					<div class="wrap-input1 w-full p-b-4">
						<input class="input1 bg-none plh1 stext-107 cl7" type="text"
							name="email" placeholder="email@example.com">
						<div class="focus-input1 trans-04"></div>
					</div>

					<div class="p-t-18">
						<button
							class="flex-c-m stext-101 cl0 size-103 bg1 bor1 hov-btn2 p-lr-15 trans-04">
							Subscribe</button>
					</div>
				</form>
			</div>
		</div>

		<div class="p-t-40">
			<div class="flex-c-m flex-w p-b-18">
				<a href="#" class="m-all-1"> <img
					src="images/icons/icon-pay-01.png" alt="ICON-PAY">
				</a> <a href="#" class="m-all-1"> <img
					src="images/icons/icon-pay-02.png" alt="ICON-PAY">
				</a> <a href="#" class="m-all-1"> <img
					src="images/icons/icon-pay-03.png" alt="ICON-PAY">
				</a> <a href="#" class="m-all-1"> <img
					src="images/icons/icon-pay-04.png" alt="ICON-PAY">
				</a> <a href="#" class="m-all-1"> <img
					src="images/icons/icon-pay-05.png" alt="ICON-PAY">
				</a>
			</div>

			<p class="stext-107 cl6 txt-center">
				<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
				Copyright &copy;
				<script>
					document.write(new Date().getFullYear());
				</script>
				All rights reserved |Made with <i class="fa fa-heart-o"
					aria-hidden="true"></i> by <a href="https://colorlib.com"
					target="_blank">Colorlib</a> &amp; distributed by <a
					href="https://themewagon.com" target="_blank">ThemeWagon</a>
				<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->

			</p>
		</div>
	</div>
</footer>


<!-- Back to top -->
<div class="btn-back-to-top" id="myBtn">
	<span class="symbol-btn-back-to-top"> <i
		class="zmdi zmdi-chevron-up"></i>
	</span>
</div>


<!-- Check email and password -->
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script>
	$(function() {
		var msg = "${msg}";
		if (msg == "failure") {
			alert("please check your email or password");
		}
	});
</script>


<!-- Load More Button -->
<!-- <script>
	$(function() {
		$(".buttonTest").on('click', function() {
			/* isotope-grid클래스의 height에 1251.27 더해야함 */
			var h = $(".isotope-grid").height() + 1251.27 +"px";
			alert(h);
			$(".istope-grid").css("height",h);
			$(".test").css('display','');
		});
	});
</script> -->
<script>
	/* url에서 파라미터값 가져오는 function */

	$(function() {
		function getParameterByName(name) {
			name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
			var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"), results = regex
					.exec(location.search);
			return results === null ? "" : decodeURIComponent(results[1]
					.replace(/\+/g, " "));
		}
		if (getParameterByName('prod_category')!=null) {

			var test = getParameterByName('prod_category');
			$("." + test).parent().parent().children().removeClass('active-menu');
			$("." + test).parent().addClass('active-menu');
		}
	});
</script>



<!--===============================================================================================-->
<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
<script src="vendor/bootstrap/js/popper.js"></script>
<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<!-- login check -->
<script>
	
</script>

<!--===============================================================================================-->
<script src="vendor/select2/select2.min.js"></script>
<script>
	$(".js-select2").each(function() {
		$(this).select2({
			minimumResultsForSearch : 20,
			dropdownParent : $(this).next('.dropDownSelect2')
		});
	})
</script>
<!--===============================================================================================-->
<script src="vendor/daterangepicker/moment.min.js"></script>
<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
<script src="vendor/slick/slick.min.js"></script>
<script src="js/slick-custom.js"></script>
<!--===============================================================================================-->
<script src="vendor/parallax100/parallax100.js"></script>
<script>
	$('.parallax100').parallax100();
</script>
<!--===============================================================================================-->
<script src="vendor/MagnificPopup/jquery.magnific-popup.min.js"></script>
<script>
	$('.gallery-lb').each(function() { // the containers for all your galleries
		$(this).magnificPopup({
			delegate : 'a', // the selector for gallery item
			type : 'image',
			gallery : {
				enabled : true
			},
			mainClass : 'mfp-fade'
		});
	});
</script>
<!--===============================================================================================-->
<script src="vendor/isotope/isotope.pkgd.min.js"></script>
<!--===============================================================================================-->
<script src="vendor/sweetalert/sweetalert.min.js"></script>
<script>
	$('.js-addwish-b2, .js-addwish-detail').on('click', function(e) {
		e.preventDefault();
	});

	$('.js-addwish-b2').each(function() {
		var nameProduct = $(this).parent().parent().find('.js-name-b2').html();
		$(this).on('click', function() {
			swal(nameProduct, "is added to wishlist !", "success");

			$(this).addClass('js-addedwish-b2');
			$(this).off('click');
		});
	});

	$('.js-addwish-detail').each(
			function() {
				var nameProduct = $(this).parent().parent().parent().find(
						'.js-name-detail').html();

				$(this).on('click', function() {
					swal(nameProduct, "is added to wishlist !", "success");

					$(this).addClass('js-addedwish-detail');
					$(this).off('click');
				});
			});

	/*---------------------------------------------*/

	$('.js-addcart-detail').each(
			function() {
				var nameProduct = $(this).parent().parent().parent().parent()
						.find('.js-name-detail').html();
				$(this).on('click', function() {
					swal(nameProduct, "is added to cart !", "success");
				});
			});
</script>
<!--===============================================================================================-->
<script src="vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
<script>
	$('.js-pscroll').each(function() {
		$(this).css('position', 'relative');
		$(this).css('overflow', 'hidden');
		var ps = new PerfectScrollbar(this, {
			wheelSpeed : 1,
			scrollingThreshold : 1000,
			wheelPropagation : false,
		});

		$(window).on('resize', function() {
			ps.update();
		})
	});
</script>
<!--===============================================================================================-->
<script src="js/main.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"
	integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
	crossorigin="anonymous"></script>
