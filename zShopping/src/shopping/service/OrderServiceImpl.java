package shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopping.dao.CartDAO;
import shopping.dao.OrderDAO;
import shopping.vo.CartVO;
import shopping.vo.OrderVO;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDAO orderDao;
	
	@Autowired
	private CartDAO cartDao;

	@Override
	public void checkoutOrder(List<CartVO> cartList, OrderVO order) {
		String content = "";
		int totalPrice = 0;
		for (int i = 0; i < cartList.size(); i++) {
			content += cartList.get(i).getProd_name();
			content += cartList.get(i).getProd_price();
			content += " × ";
			content += cartList.get(i).getProd_cartAmt();
			content += " ＝ ";
			content += cartList.get(i).getProd_totalPrice();
			content += "\r\n";
			totalPrice += cartList.get(i).getProd_totalPrice();
		}
		order.setOrder_content(content);
		order.setOrder_totalPrice(totalPrice);
		orderDao.insertOrder(order);
		
		cartDao.cleanCart(order.getUser_id());
	}

	@Override
	public List<OrderVO> viewMyOrderHistory(int user_id) {
		return orderDao.viewMyOrderHistory(user_id);
	}

}
