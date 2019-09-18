(function($) {
  // reset
  $('#reset').on('click', function(){
      $('#register-form').reset();
  });
  var emailCheck = 0;
  var oldVal = $('#loginId').val();
  

  
  //입력 유효성 검사
  $('#submit').on('click', function(){
    
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
       
//     if($('#roadFullAddr').val().length == 0){
//         alert("Please write address");
//         $("#address").focus();
//         return false;
//     }
       
     if($('#phone').val().length == 0){
         alert("Please write phone number"); 
         $("#phone").focus();
         return false;
     }
     

     $("#register-form").attr("action","updateUser");
     $("#register-form").submit();
  });
})(jQuery);