package shopping.service;

import java.util.List;

import org.springframework.ui.Model;

import shopping.vo.ProductVO;

public interface ProductService {

	// 상품리스트 가져오기
	public List<ProductVO> viewProduct(int page, Model model);
	public List<ProductVO> selectProductCategory(String prod_category);
}
