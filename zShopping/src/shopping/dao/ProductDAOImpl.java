package shopping.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import shopping.mapper.ProductMapper;

@Repository("productDao")
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	private ProductMapper productMapper;

}
