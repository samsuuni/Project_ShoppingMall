package shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import shopping.service.CartService;
import shopping.vo.CartVO;

@Controller
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	//장바구니 상품 추가
	@RequestMapping("/shopping-cart")
	public String addToCart(CartVO cart, Model model) {		
		cartService.addToCart(cart);
		model.addAttribute("varCart", cart);
		return "shopping-cart.jsp";
	}
	
	//장바구니 목록 불러오기
	@RequestMapping("/shopping-cart")
	public String viewUserCart(int user_id, Model model) {		
		List<CartVO> cartlist = cartService.viewUserCart(user_id);
		model.addAttribute("varCartList", cartlist);
		return "shopping-cart.jsp";
	}
	
	
	//Ajax(장바구니 화면에서 실행)
	//상품 삭제
	@RequestMapping("/shopping-cart")
	public void removeFromCart(CartVO cart) {
		cartService.removeFromCart(cart);
	}
	//상품 수량 변경
	@RequestMapping("/shopping-cart")
	public void updateAmt(CartVO cart) {
		cartService.updateAmt(cart);
	}
	//장바구니 비우기
	@RequestMapping("/shopping-cart")
	public void cleanCart(int user_id) {
		cartService.cleanCart(user_id);
	}
	
}
