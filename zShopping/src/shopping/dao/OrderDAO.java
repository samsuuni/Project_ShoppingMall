package shopping.dao;

import java.util.List;

import shopping.vo.OrderVO;

public interface OrderDAO {
	
	public void insertOrder(OrderVO order);
	public List<OrderVO> viewMyOrderHistory(int user_id);
	

}
