package shopping.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import shopping.mapper.CartMapper;
import shopping.vo.CartVO;

@Repository("cartDao")
public class CartDAOImpl implements CartDAO{
	
	@Autowired
	private CartMapper cartMapper;

	@Override
	public void insertCart(CartVO cart) {
		cartMapper.insertCart(cart);
	}

	@Override
	public void deleteCart(CartVO cart) {
		cartMapper.deleteCart(cart);
	}

	@Override
	public void updateCartAmt(CartVO cart) {
		cartMapper.updateCartAmt(cart);
	}

	@Override
	public List<CartVO> viewCartWithUserId(int user_id) {
		return cartMapper.viewCartWithUserId(user_id);
	}
	
	@Override
	public void cleanCart(int user_id) {
		cartMapper.cleanCart(user_id);
	}

	@Override
	public boolean cartExists(CartVO cart) {
		if(cartMapper.cartExists(cart)!=null) {
			return true;
		}
		return false;
	}

	
	


}
