package shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import shopping.service.OrderService;
import shopping.vo.CartVO;
import shopping.vo.OrderVO;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	//결제 페이지 매핑
	@RequestMapping("/checkout")
	public String checkout() {
		return "checkout";
	}
	
	//주문 확정
	@RequestMapping("/confirm_order")
	public String confirmOrder(List<CartVO> cartList, OrderVO order) {
		orderService.checkoutOrder(cartList, order);
		return "confirm_order";
	}
	
	//나의 주문 내역 
	@RequestMapping("/myhistory")
	public String viewMyOrderHistory(int user_id, Model model) {
		List<OrderVO> orderList = orderService.viewMyOrderHistory(user_id);
		model.addAttribute("orderList", orderList);
		return "myhistory";
	}
	
}
