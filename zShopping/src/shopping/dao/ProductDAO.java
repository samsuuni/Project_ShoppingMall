package shopping.dao;

import java.util.List;

import shopping.vo.ProductVO;

public interface ProductDAO {
	
	public List<ProductVO> selectAll();
	public List<ProductVO> selectProductCategory(String prod_category);

}
