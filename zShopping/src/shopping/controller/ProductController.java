package shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import shopping.service.ProductService;
import shopping.service.ReviewService;
import shopping.vo.ProductVO;
import shopping.vo.ProductViewVO;
import shopping.vo.ReviewVO;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	ReviewService reviewService;
	
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
		List<ReviewVO> reviewList = reviewService.selectProdReviewList(prod_id);
		model.addAttribute("product", product);
		model.addAttribute("reviewList", reviewList);
		return "productDetail";
	}
	
	@RequestMapping("/productSearch")
	public String productSearch(int page, String prod_name, Model model) {
		ProductViewVO productView = productService.searchProduct(page, prod_name);
		model.addAttribute("productView", productView);
		return "productSearch";
	}
	
	@RequestMapping("addReview")
	public String addReview(int prod_id, int user_id, String review_content, int review_rating) {	
		if(user_id!=0) {
			reviewService.addReview(prod_id, user_id, review_content, review_rating);
			return "redirect:product-detail?prod_id="+prod_id;
		} else {
			return "pageBack";
		}
		
		
	}
	
	

}
