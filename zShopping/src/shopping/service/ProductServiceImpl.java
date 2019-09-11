package shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import shopping.dao.ProductDAO;
import shopping.vo.ProductVO;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDAO productDao;

	@Override
	public List<ProductVO> viewProduct(int page, Model model) {
		model.addAttribute("test","test");
		return productDao.selectAll();
	}

	@Override
	public List<ProductVO> selectProductCategory(String prod_category) {
		return productDao.selectProductCategory(prod_category);
	}



}
