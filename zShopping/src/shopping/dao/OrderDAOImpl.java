package shopping.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import shopping.mapper.OrderMapper;

@Repository("orderDao")
public class OrderDAOImpl implements OrderDAO{
	
	@Autowired
	private OrderMapper orderMapper;

}
