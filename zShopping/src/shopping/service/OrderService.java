package shopping.service;

import java.util.List;

import shopping.vo.CartVO;
import shopping.vo.OrderVO;

public interface OrderService {
	
	public OrderVO checkoutOrder(int user_id);
	public List<OrderVO> viewMyOrderHistory(int user_id);

}
