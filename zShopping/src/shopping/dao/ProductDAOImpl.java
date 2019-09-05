package shopping.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import shopping.mapper.ProductMapper;
import shopping.vo.ProductVO;

@Repository("productDao")
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	private ProductMapper productMapper;

	@Override
	public List<ProductVO> selectAll() {
		return productMapper.selectAll();
	}

}
