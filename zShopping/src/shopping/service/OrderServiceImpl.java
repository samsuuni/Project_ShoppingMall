package shopping.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

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
	public OrderVO checkoutOrder(int user_id, HttpSession session, Model model) {
		List<CartVO> cartList = cartDao.viewCartWithUserId(user_id);
		model.addAttribute("orderList", cartList);
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
		if(content.length()>0) {
			orderDao.insertOrder(order);
		}
		cartDao.cleanCart(order.getUser_id());
		cartList = cartDao.viewCartWithUserId(user_id);
		session.setAttribute("cartList", cartList);
		
		return order;
	}

	@Override
	public List<OrderVO> viewMyOrderHistory(int user_id) {
		return orderDao.viewMyOrderHistory(user_id);
	}

}
