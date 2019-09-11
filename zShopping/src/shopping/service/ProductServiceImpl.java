package shopping.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopping.dao.ProductDAO;
import shopping.vo.ProductVO;
import shopping.vo.ProductViewVO;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDAO productDao;

	@Override
	public List<ProductVO> selectAll() {
		return productDao.selectAll();
	}

	@Override
	public List<ProductVO> selectProductCategory(String prod_category) {
		return productDao.selectProductCategory(prod_category);
	}

	
	
	@Override
	public ProductViewVO viewProductPage(int page) {
		int productCountPerPage = 11;
		int currentPageNumber = page;
		int productTotalCount = productDao.selectProductCount();
		int firstRow = 0;
		int endRow = 0;
		
		firstRow = (page-1) * productCountPerPage;
		endRow = productCountPerPage;
		int productPageTotalCount = productTotalCount/productCountPerPage;
		if(productTotalCount%productCountPerPage>0) {
			productTotalCount++;
		}
		HashMap<Object, Integer> row = new HashMap<Object, Integer>();
		row.put("firstRow", firstRow);
		row.put("endRow", endRow);
		List<ProductVO> productList = productDao.selectProductList(row);
		return new ProductViewVO(productList, productTotalCount, currentPageNumber, productCountPerPage, firstRow, endRow, productPageTotalCount);
	}

	@Override
	public ProductViewVO viewProductCategoryPage(int page, String prod_category) {
		int productCountPerPage = 11;
		int currentPageNumber = page;
		int productTotalCount = productDao.selectProductCategoryCount(prod_category);
		int firstRow = 0;
		int endRow = 0;
		
		firstRow = (page-1) * productCountPerPage;
		endRow = productCountPerPage;
		int productPageTotalCount = productTotalCount/productCountPerPage;
		if(productTotalCount%productCountPerPage>0) {
			productTotalCount++;
		}
		System.out.println(productPageTotalCount);
		HashMap<Object, Object> row = new HashMap<Object, Object>();
		row.put("firstRow", firstRow);
		row.put("endRow", endRow);
		row.put("prod_category", prod_category);
		List<ProductVO> productList = productDao.selectProductListToCategory(row);
		return new ProductViewVO(productList, productTotalCount, currentPageNumber, productCountPerPage, firstRow, endRow, productPageTotalCount);
	}
	
	
	

}
