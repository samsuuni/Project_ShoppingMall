package shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import shopping.service.ProductService;
import shopping.vo.ProductVO;
import shopping.vo.ProductViewVO;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/product")
	public String productView(int page, Model model) {
		List<ProductVO> productList = productService.selectAll();
		ProductViewVO productView = productService.viewProductPage(page);
		model.addAttribute("productList", productList);
		model.addAttribute("productView", productView);
		
		
		return "product";
	}
	
	@RequestMapping("/productCategory")
	public String productViewCategory(String prod_category, Model model) {
		List<ProductVO> productList = productService.selectProductCategory(prod_category);
		model.addAttribute("productList", productList);
		return "productCategory";
	}

}
