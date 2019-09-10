package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import shopping.mapper.CartMapper;
import shopping.service.CartService;
import shopping.vo.CartVO;

class TestCart {

	@Test
	void test() {
		ApplicationContext context = new GenericXmlApplicationContext("config/root-context.xml");
		CartService cartService = context.getBean("cartService", CartService.class);
		
		CartVO cart = new CartVO();
		//(cart_id, user_id, prod_id, prod_name, prod_price, prod_cartAmt, prod_totalPrice)
		//CartVO cart = new CartVO(1, 2, 3, "prod3", 10000, 2, 20000);
		//cartService.addToCart(cart);
		
//		cart.setCart_id(2);
//		cart.setProd_price(15000);
//		cart.setProd_cartAmt(5);
//		cartService.updateAmt(cart);
		
//		System.out.println(cartService.viewUserCart(2));
		
//		cart.setUser_id(3);
//		cart.setProd_id(5);
//		cart.setProd_name("prod5");
//		cart.setProd_price(20000);
//		cart.setProd_cartAmt(4);
//		cartService.addToCart(cart);
		
//		cartService.cleanCart(3);
		
		
	}

}
