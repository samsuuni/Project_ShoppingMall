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
		int productCountPerPage = 5;
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



}
