package shopping.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import shopping.vo.CartVO;

public interface CartService {
	
	public void addToCart(int user_id, int prod_id, int prod_cartAmt, HttpSession session);
	public void removeFromCart(int cart_id);
	public void updateAmt(int cart_id, int prod_cartAmt);
	public boolean cartExists(int user_id, int prod_id);
	public List<CartVO> viewUserCart(int user_id);
	public void cleanCart(int user_id);

}
