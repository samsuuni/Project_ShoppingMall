(function($) {
  // reset
  $('#reset').on('click', function(){
      $('#register-form').reset();
  });
  var emailCheck = 0;
  var oldVal = $('#loginId').val();
  
 
  
  //email 중복 체크
  $('#Duplicate').on('click', function(){
     var email = $('#loginId').val();
     // 입력값이 email 형식인지 아닌지 확인
     if(email.match(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/) == null){
        alert("Invalid format of email address");
        $('#loginId').focus();
     // 이메일 형식이면 else 들어가서 이메일이 중복됐는지 안됐는지 확인
     } else {
        $.ajax({
           type:'post',
           data: email,
           url:"emailCheck",
           dataType:"json",
           contentType:"application/json; charset=UTF-8",
           success:function(data){
              if(data.cnt){
                 alert("Cannot be used email");
                 $('#loginId').focus();
                 emailCheck = 0;
              }else{
                 alert("Can be used email");
                 $('#name').focus();
                 emailCheck = 1;
              }
           },
           error : function(error){
              alert("error : "+"null 값이adfa");
           }
        });
     }
  });
  
//   email값 변경시 emailCheck에 0집어넣기
  $("#loginId").on("propertychange change keyup paste input", function() {
       var currentVal = $(this).val();
       if(currentVal == oldVal) {
           return;
       }
       oldVal = currentVal;
       emailCheck = 0;
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
     
     if(emailCheck == 0){
        alert("Please click Duplicate Button");
        $('#Duplicate').focus();
        alert(emailCheck);
        return false;
     }

     $("#register-form").attr("action","insertUser");
     $("#register-form").submit();
  });
})(jQuery);