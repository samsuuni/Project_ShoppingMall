package shopping.dao;

import java.util.List;

import shopping.vo.CartVO;

public interface CartDAO {
	
	public void insertCart(CartVO cart);
	public void deleteCart(CartVO cart);
	public void updateCartAmt(CartVO cart);
	public List<CartVO> viewCartWithUserId(int user_id);
	public void cleanCart(int user_id);
	public boolean cartExists(CartVO cart);
	public CartVO selectOneWithCartId(int cart_id);

}
