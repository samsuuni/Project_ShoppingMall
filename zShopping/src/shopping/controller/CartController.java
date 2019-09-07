package shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shopping.service.CartService;
import shopping.vo.CartVO;

@Controller
public class CartController {
	
	@Autowired
	private CartService cartService;
	
//	//장바구니 상품 추가
//	public String addToCart(CartVO cart, Model model) {		
//		cartService.addToCart(cart);
//		model.addAttribute("cart", cart);
//		return "shopping_cart";
//	}
//	
	//장바구니 목록 불러오기
	@RequestMapping("/shopping_cart")
	public String viewUserCart(int user_id, Model model) {		
		List<CartVO> cartList = cartService.viewUserCart(user_id);
		model.addAttribute("cartList", cartList);
		return "shopping_cart";
	}
//	
//	
//	//Ajax(장바구니 화면에서 실행)
//	//상품 삭제
//	public void removeFromCart(CartVO cart) {
//		cartService.removeFromCart(cart);
//	}
//	//상품 수량 변경
//	public void updateAmt(CartVO cart) {
//		cartService.updateAmt(cart);
//	}
//	//장바구니 비우기
//	public void cleanCart(int user_id) {
//		cartService.cleanCart(user_id);
//	}
	
//	@RequestMapping("/cart")
//	public String cart() {
//		return "shopping_cart";
//	}
	
}
