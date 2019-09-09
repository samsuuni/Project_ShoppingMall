package shopping.service;

import java.util.List;

import shopping.vo.CartVO;

public interface CartService {
	
	public void addToCart(CartVO cart);
	public void removeFromCart(CartVO cart);
	public void updateAmt(int cart_id, int prod_cartAmt);
	public List<CartVO> viewUserCart(int user_id);
	public void cleanCart(int user_id);

}
