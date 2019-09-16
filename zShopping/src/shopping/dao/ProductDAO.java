package shopping.dao;

import java.util.HashMap;
import java.util.List;

import shopping.vo.ProductVO;

public interface ProductDAO {
	
	public List<ProductVO> selectAll();
	public List<ProductVO> selectProductCategory(String prod_category);
	public List<ProductVO> selectProductList(HashMap<Object, Integer> row);
	public List<ProductVO> selectProductListToCategory(HashMap<Object, Object> row);
	public int selectProductCount();
	public int selectProductCategoryCount(String prod_category);
	public ProductVO selectOneProduct(int prod_id);

}
