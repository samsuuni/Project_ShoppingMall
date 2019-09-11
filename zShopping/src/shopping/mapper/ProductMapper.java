package shopping.mapper;

import java.util.HashMap;
import java.util.List;


import shopping.vo.ProductVO;

@MyMapper
public interface ProductMapper {

	public List<ProductVO> selectAll();
	public List<ProductVO> selectProductCategory(String prod_category);
	public List<ProductVO> selectProductList(HashMap<Object, Integer> row);
	public List<ProductVO> selectProductCategoryList(HashMap<Object, Object> row);
	public int selectProductCount();
	public int selectProductCategoryCount(String prod_category);

}
