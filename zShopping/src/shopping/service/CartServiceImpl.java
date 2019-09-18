package shopping.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopping.dao.CartDAO;
import shopping.dao.ProductDAO;
import shopping.vo.CartVO;
import shopping.vo.ProductVO;

@Service("cartService")
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDAO cartDao;
	
	@Autowired
	private ProductDAO productDao;
	
	//상품 상세화면에서 장바구니에 상품 추가
	@Override
	public void addToCart(int user_id, int prod_id, int prod_cartAmt, HttpSession session) {
		CartVO cart = new CartVO();
		List<CartVO> cartList = new ArrayList<CartVO>();
		if(!cartExists(user_id, prod_id)) {
			ProductVO pd = productDao.selectOneProduct(prod_id);
			cart.setUser_id(user_id);
			cart.setProd_id(prod_id);
			cart.setProd_name(pd.getProd_name());
			cart.setProd_price(pd.getProd_price());
			cart.setProd_cartAmt(prod_cartAmt);
			cart.setProd_totalPrice(pd.getProd_price()*prod_cartAmt);
			cartDao.insertCart(cart);
			
			cartList = cartDao.viewCartWithUserId(user_id);
			session.setAttribute("cartList", cartList);
		}else {
			cart = cartDao.cartExists(user_id, prod_id);
			cart.setProd_cartAmt(cart.getProd_cartAmt()+prod_cartAmt);
			cartDao.updateCartAmt(cart);
			
			cartList = cartDao.viewCartWithUserId(user_id);
			session.setAttribute("cartList", cartList);
		}
	}

	//장바구니 화면에서 상품별 삭제
	@Override
	public void removeFromCart(int cart_id) {
		cartDao.deleteCart(cart_id);
	}

	//장바구니 화면에서 상품별 수량 변경
	@Override
	public void updateAmt(int cart_id, int prod_cartAmt) {
		CartVO cart = cartDao.selectOneWithCartId(cart_id);
		if(prod_cartAmt==0) {
			cartDao.deleteCart(cart_id);
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

	//장바구니에 상품 존재 여부 확인
	@Override
	public boolean cartExists(int user_id, int prod_id) {
		if(cartDao.cartExists(user_id, prod_id)!=null) {
			return true;
		}else {
			return false;
		}
	}

}
