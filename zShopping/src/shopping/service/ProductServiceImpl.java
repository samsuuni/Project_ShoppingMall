package shopping.service;

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

	
	
	static int productCountPerPage = 9;
	static int firstRow = 0;
	static int endRow = 0;
	@Override
	public ProductViewVO viewProductPage(int page) {
		int currentPageNumber = page;
		int productTotalCount = productDao.selectProductCount();
		
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
		int currentPageNumber = page;
		int productTotalCount = productDao.selectProductCategoryCount(prod_category);
		
		firstRow = (page-1) * productCountPerPage;
		endRow = productCountPerPage;
		int productPageTotalCount = productTotalCount/productCountPerPage;
		if(productTotalCount%productCountPerPage>0) {
			productPageTotalCount++;
		}
		HashMap<Object, Object> row = new HashMap<Object, Object>();
		row.put("firstRow", firstRow);
		row.put("endRow", endRow);
		row.put("prod_category", prod_category);
		List<ProductVO> productList = productDao.selectProductListToCategory(row);
		return new ProductViewVO(productList, productTotalCount, currentPageNumber, productCountPerPage, firstRow, endRow, productPageTotalCount);
	}

	@Override
	public ProductVO viewProductOne(int prod_id) {
		
		return productDao.selectOneProduct(prod_id);
	}

	@Override
	public ProductViewVO searchProduct(int page, String prod_name) {
		
		int currentPageNumber = page;
		int productTotalCount = productDao.searchProductCount(prod_name);
		firstRow = (page-1) * productCountPerPage;
		endRow = productCountPerPage;
		int productPageTotalCount = productTotalCount/productCountPerPage;
		if(productTotalCount%productCountPerPage>0) {
			productPageTotalCount++;
		}
		HashMap<Object, Object> row = new HashMap<Object, Object>();
		row.put("firstRow", firstRow);
		row.put("endRow", endRow);
		row.put("prod_name", prod_name);
		List<ProductVO> productList = productDao.searchProduct(row);
		return new ProductViewVO(productList, productTotalCount, currentPageNumber, productCountPerPage, firstRow, endRow, productPageTotalCount);
		
		
	}
	
	

}
