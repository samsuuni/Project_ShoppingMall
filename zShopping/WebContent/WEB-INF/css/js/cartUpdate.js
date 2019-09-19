
(function ($) {
    "use strict";
    $('.upBtn').on('click',function(){
       var cartAmt = Number($('.prod_cartAmt').val());
       var price = Number($('.price').val());
       cartAmt += 1 ;
       var totalPrice = price * cartAmt;
       $('.prod_cartAmt').val(cartAmt);
       $('.totalPrice').val(totalPrice);
    });
    
    $('.downBtn').on('click',function(){
       var cartAmt = Number($('.prod_cartAmt').val());
       if(cartAmt==1){
          alert("It can't be less than one!");
       }
       if(cartAmt>1){
          var price = Number($('.price').val());
          cartAmt -= 1 ;
          var totalPrice = price * cartAmt;
          $('.prod_cartAmt').val(cartAmt);
          $('.totalPrice').val(totalPrice);
       }
    });

    
    $('.close').on('click',function(){
       var user_id=$('.user_id').val();
       var cart_id=$('.cart_id').val();
       var prod_cartAmt=$('.prod_cartAmt').val();
       var url = "shoppingCartUpdateDo?user_id="+user_id+"&cart_id="+cart_id+"&prod_cartAmt="+prod_cartAmt;
       window.opener.document.location.href=url;
       window.close();
    });
    
    $('.yes').on('click',function(){
       var user_id = $('.user_id').val();
       var cart_id = $('.cart_id').val();
       var prod_cartAmt = $('.prod_cartAmt').val();
       prod_cartAmt = 0;
       var url = "shoppingCartUpdateDo?user_id="+user_id+"&cart_id="+cart_id+"&prod_cartAmt="+prod_cartAmt; 
       window.opener.document.location.href=url;
       window.close();
    });
    
    $('.no').on('click',function(){
       window.close();
    });
    
    
    
    
    
    

})(jQuery);