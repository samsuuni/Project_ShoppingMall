package shopping.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import shopping.mapper.CartMapper;

@Repository("cartDao")
public class CartDAOImpl implements CartDAO{
	
	@Autowired
	private CartMapper cartMapper;

	
	


}
