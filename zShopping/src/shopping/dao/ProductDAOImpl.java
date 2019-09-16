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
	public List<ProductVO> selectProductListToCategory(HashMap<Object, Object> row) {
		return productMapper.selectProductCategoryList(row);
	}

	@Override
	public int selectProductCount() {
		return productMapper.selectProductCount();
	}

	@Override
	public int selectProductCategoryCount(String prod_category) {
		return productMapper.selectProductCategoryCount(prod_category);
	}

	@Override
	public ProductVO selectOneProduct(int prod_id) {
		return productMapper.selectOneProduct(prod_id);
	}



}
