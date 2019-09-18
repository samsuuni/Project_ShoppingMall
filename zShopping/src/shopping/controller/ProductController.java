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
		ProductViewVO productView = productService.viewProductPage(page);
		model.addAttribute("productView", productView);
		return "product";
	}
	
	@RequestMapping("/productCategory")
	public String productViewCategory(int page, String prod_category, Model model) {
		ProductViewVO productView = productService.viewProductCategoryPage(page, prod_category);
		model.addAttribute("productView", productView);
		return "productCategory";
	}
	
	@RequestMapping("/product-detail")
	public String productDetail(int prod_id, Model model) {
		ProductVO product = productService.viewProductOne(prod_id);
		model.addAttribute("product", product);
		return "productDetail";
	}
	
	@RequestMapping("/productSearch")
	public String productSearch(int page, String prod_name, Model model) {
		ProductViewVO productView = productService.searchProduct(page ,prod_name);
		model.addAttribute("productView", productView);
		return "productSearch";
	}

}
