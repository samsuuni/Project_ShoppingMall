package shopping.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import shopping.service.CartService;
import shopping.vo.CartVO;
import shopping.vo.ProductVO;

@Controller
public class CartController {

	@Autowired
	private CartService cartService;

	
	// 장바구니 목록 불러오기
	@RequestMapping("/shopping_cart")
	public String viewUserCart(@RequestParam int user_id, Model model) {
		List<CartVO> cartList = cartService.viewUserCart(user_id);
		model.addAttribute("cartList", cartList);
		return "shopping_cart";
	}

	// 결제 페이지 매핑
	@RequestMapping("/checkout")
	public String checkout(int user_id, Model model) {
		List<CartVO> cartList = cartService.viewUserCart(user_id);
		model.addAttribute("cartList", cartList);
		return "checkout";
	}
	
	// 장바구니 상품 추가
	@RequestMapping("addToCart")
	public String addToCart(String user_id, String prod_id, String prod_cartAmt, HttpSession session) {
		
		cartService.addToCart(Integer.parseInt(user_id), Integer.parseInt(prod_id), Integer.parseInt(prod_cartAmt), session);

		
		return "main";
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
	public String shoppingCartUpdateDo(String user_id, String cart_id, String cartAmt) {
		cartService.updateAmt(Integer.parseInt(cart_id), Integer.parseInt(cartAmt));
		return "redirect:shopping_cart?user_id="+user_id;
	}

}
