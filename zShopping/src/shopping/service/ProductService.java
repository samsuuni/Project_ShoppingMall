package shopping.service;

import java.util.List;

import shopping.vo.ProductVO;

public interface ProductService {

	// 상품리스트 가져오기
	public List<ProductVO> selectAll();
	public List<ProductVO> selectProductCategory(String prod_category);
}
