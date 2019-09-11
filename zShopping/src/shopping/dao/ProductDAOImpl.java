package shopping.dao;

import java.util.HashMap;
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

	@Override
	public List<ProductVO> selectProductCategory(String prod_category) {
		return productMapper.selectProductCategory(prod_category);
	}

	@Override
	public List<ProductVO> selectProductList(HashMap<Object, Integer> row) {
		return productMapper.selectProductList(row);
	}

	@Override
	public List<ProductVO> selectProductListToCategory(HashMap<Object, Integer> row) {
		return productMapper.selectProductListToCategory(row);
	}

	@Override
	public int selectProductCount() {
		return productMapper.selectProductCount();
	}

}
