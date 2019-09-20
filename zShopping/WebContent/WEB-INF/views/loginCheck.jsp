<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"
	integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
	crossorigin="anonymous"></script>
<script type="text/javascript">
	$(function(){
		var msg = "${msg}";
		var returnUrl = "${returnUrl}";
		if(msg!=""){
			  alert(msg);
			  alert('Please check e-mail ID');
			  location.href='signUp';
		} else{
			  alert("Enjoy your Shopping Time");
			  location.href=returnUrl;
		}
	});
</script>
