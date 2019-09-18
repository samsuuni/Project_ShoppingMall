package shopping.service;

import java.util.List;

import javax.servlet.http.HttpSession;

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
	public OrderVO checkoutOrder(int user_id) {
		List<CartVO> cartList = cartDao.viewCartWithUserId(user_id);
		String content = "";
		int totalPrice = 0;
		for (int i = 0; i < cartList.size(); i++) {
			content += cartList.get(i).getProd_name();
			content += "(";
			content += cartList.get(i).getProd_price();
			content += ")";
			content += "X";
			content += cartList.get(i).getProd_cartAmt();
			content += "=";
			content += cartList.get(i).getProd_totalPrice();
			content += "\r\n";
			totalPrice += cartList.get(i).getProd_totalPrice();
		}
		OrderVO order = new OrderVO();
		order.setUser_id(user_id);
		order.setOrder_content(content);
		order.setOrder_totalPrice(totalPrice);
		orderDao.insertOrder(order);
		
		
		return order;
	}

	@Override
	public List<OrderVO> viewMyOrderHistory(int user_id) {
		return orderDao.viewMyOrderHistory(user_id);
	}

}
