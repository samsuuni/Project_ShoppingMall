package shopping.service;

import java.util.List;

import shopping.vo.CartVO;
import shopping.vo.OrderVO;

public interface OrderService {
	
	public void checkoutOrder(List<CartVO> cartList, OrderVO order);
	public List<OrderVO> viewMyOrderHistory(int user_id);

}
