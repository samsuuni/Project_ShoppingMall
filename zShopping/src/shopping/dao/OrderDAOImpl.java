package shopping.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import shopping.mapper.OrderMapper;
import shopping.vo.OrderVO;

@Repository("orderDao")
public class OrderDAOImpl implements OrderDAO{
	
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public void insertOrder(OrderVO order) {
		orderMapper.insertOrder(order);
	}

	@Override
	public List<OrderVO> viewMyOrderHistory(int user_id) {
		return orderMapper.viewMyOrderHistory(user_id);
	}

}
