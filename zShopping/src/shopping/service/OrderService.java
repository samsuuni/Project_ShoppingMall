package shopping.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import shopping.vo.OrderVO;

public interface OrderService {
	
	public OrderVO checkoutOrder(int user_id, HttpSession session, Model model);
	public List<OrderVO> viewMyOrderHistory(int user_id);

}
