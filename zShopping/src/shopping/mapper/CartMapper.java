package shopping.mapper;

import java.util.List;

import shopping.vo.CartVO;

@MyMapper
public interface CartMapper {
	
	public void insertCart(CartVO cart);
	public void deleteCart(CartVO cart);
	public void updateCartAmt(CartVO cart);
	public List<CartVO> viewCartWithUserId(int user_id);
	public void cleanCart(int user_id);
	public CartVO cartExists(CartVO cart);
	public CartVO selectOneWithCartId(int cart_id);

}
