package shopping.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import shopping.service.CartService;
import shopping.vo.CartVO;

@Controller
public class CartController {

	@Autowired
	private CartService cartService;
	


	
	// 장바구니 목록 불러오기
	@RequestMapping("/shopping_cart")
	public String viewUserCart(int user_id, Model model) {
		if(user_id!=0) {
			List<CartVO> cartList = cartService.viewUserCart(user_id);
			model.addAttribute("cartList", cartList);
			return "shopping_cart";
		} else {
			return "pageBack";
		}
	}

	// 결제 페이지 매핑
	@RequestMapping("/checkout")
	public String checkout(int user_id, Model model) {
		if(user_id!=0) {
			List<CartVO> cartList = cartService.viewUserCart(user_id);
			model.addAttribute("cartList", cartList);
			return "checkout";
		} else {
			return "pageBack";
		}
	}
	
	// 장바구니 상품 추가
	@RequestMapping("addToCart")
	public String addToCart(int user_id, int prod_id, int prod_cartAmt, HttpSession session) {
		if(user_id!=0) {
			cartService.addToCart(user_id, prod_id, prod_cartAmt, session);
			return "redirect:product-detail?prod_id="+prod_id;
		} else {
			return "pageBack";
		}
	}
	

	// 카트 수정 팝업 페이지
	@RequestMapping("/shoppingCartUpdate")
	public String shoppingCartUpdate() {
		return "shoppingCartUpdate";
	}
	
	@RequestMapping("/shoppingCartDelete")
	public String shoppingCartDelete() {
		return "shoppingCartDelete";
	}
	
	// 카트 수정 데이터 받는 로직
	@RequestMapping("/shoppingCartUpdateDo")
	public String shoppingCartUpdateDo(int user_id, int cart_id, int prod_cartAmt, HttpSession session) {
		cartService.updateAmt(user_id, cart_id, prod_cartAmt, session);
		return "redirect:shopping_cart?user_id="+user_id;
	}
	
	

}
