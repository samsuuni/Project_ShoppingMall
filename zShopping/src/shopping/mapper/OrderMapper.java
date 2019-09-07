package shopping.mapper;

import java.util.List;

import shopping.vo.OrderVO;

@MyMapper
public interface OrderMapper {
	
	public void insertOrder(OrderVO order);
	public List<OrderVO> viewMyOrderHistory(int user_id);

}
