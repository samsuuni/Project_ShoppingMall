(function($) {

  $('#reset').on('click', function(){
      $('#register-form').reset();
  });
  var emailCheck = 0;
  //email 중복 체크
  $('#Duplicate').on('click', function(){
	  var email = $('#loginId').val();
	  $.ajax({
		  type:'post',
		  data: email,
		  url:"emailCheck",
		  dataType:"json",
		  contentType:"application/json; charset=UTF-8",
		  success:function(data){
			  if(data.cnt){
				  alert("Cannot be used email");
				  $('#login').focus();
			  }else{
				  alert("Can be used email");
				  $('#name').focus();
			  }
		  },
		  error : function(error){
			  alert("error : "+"null 값이야!");
			  emailCheck = 1;
		  }
	  });
  });
  //회원 가입 유효성 검사
  $('#submit').on('click', function(){
	  if($('#loginId').val().length == 0){
	        alert("Please write loginId"); 
	        $("#userid").focus();
	        return false;
	  }
	  
	  if($('#name').val().length == 0){
	        alert("Please write name"); 
	        $("#name").focus();
	        return false;
	  }
	    
	  if($('#password').val().length == 0){
	      alert("Please write password");
	      $("#password").focus();
	      return false;
	  }
	 
	  if($('#password').val() != $('#pw-verification').val()){
	        alert("비밀번호가 서로 다릅니다. 비밀번호를 확인해 주세요."); 
	        $("#pw-verification").focus();
	        return false; 
	  }
	 
	  if($('#email').val() == 0){
	        alert("Please write email");
	        $("#email").focus();
	        return false;
	  }
	    
	  if($('#male').val() == 0){
	        alert("Please choice Gender");
	        $("#email").focus();
	        return false;
	  }
	    
	  if($('#address').val().length == 0){
	      alert("Please write address");
	      $("#address").focus();
	      return false;
	  }
	    
	  if($('#birth_date').val().length == 0){
	      alert("Please write birth_date");
	      $("#birth_date").focus();
	      return false;
	  }
	  
	  if(emailCheck==0){
		  alert("Please click Duplicate Button");
		  $('#Duplicate').focus();
		  return false;
	  }
  });
})(jQuery);