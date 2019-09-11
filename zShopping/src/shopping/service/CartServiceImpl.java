package shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopping.dao.CartDAO;
import shopping.vo.CartVO;

@Service("cartService")
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDAO cartDao;
	
	//상품 상세화면에서 장바구니에 상품 추가
	@Override
	public void addToCart(CartVO cart) {
		if(!cartDao.cartExists(cart)) {
			int cartAmt = cart.getProd_cartAmt();
			int price = cart.getProd_price();
			cart.setProd_totalPrice(price*cartAmt);
			cartDao.insertCart(cart);
		}else {
			System.out.println("장바구니에 있는 상품입니다.");
			System.out.println("수량 변경은 장바구니 화면에서만 가능");
		}
	}

	//장바구니 화면에서 상품별 삭제
	@Override
	public void removeFromCart(CartVO cart) {
		cartDao.deleteCart(cart);
	}

	//장바구니 화면에서 상품별 수량 변경
	@Override
	public void updateAmt(int cart_id, int prod_cartAmt) {
		CartVO cart = cartDao.selectOneWithCartId(cart_id);
		if(prod_cartAmt==0) {
			cartDao.deleteCart(cart);
		} else {
			cart.setProd_cartAmt(prod_cartAmt);
			cart.setProd_totalPrice(cart.getProd_price()*prod_cartAmt);
			cartDao.updateCartAmt(cart);
		}
	}

	//내 장바구니 목록 조회
	@Override
	public List<CartVO> viewUserCart(int user_id) {
		return cartDao.viewCartWithUserId(user_id);
	}

	//장바구니 비우기
	@Override
	public void cleanCart(int user_id) {
		cartDao.cleanCart(user_id);
	}

}
