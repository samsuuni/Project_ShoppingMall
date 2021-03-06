package shopping.dao;

import java.util.HashMap;
import java.util.List;

import shopping.vo.CartVO;

public interface CartDAO {
	
	public void insertCart(CartVO cart);
	public void deleteCart(int cart_id);
	public void updateCartAmt(CartVO cart);
	public List<CartVO> viewCartWithUserId(int user_id);
	public void cleanCart(int user_id);
	public CartVO cartExists(int user_id, int prod_id);
	public CartVO selectOneWithCartId(int cart_id);

}
