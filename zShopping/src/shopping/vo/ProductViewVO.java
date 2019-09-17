package shopping.vo;

import java.util.List;

public class ProductViewVO {
	
	private List<ProductVO> productList;
	private int productTotalCount;
	private int currentPageNumber;
	private int productCountPerPage;
	private int firstRow;
	private int endRow;
	private int productPageTotalCount;
	
	public ProductViewVO() {}
	
	

	public ProductViewVO(List<ProductVO> productList, int productTotalCount, int currentPageNumber,
			int productCountPerPage, int firstRow, int endRow, int productPageTotalCount) {
		this.productList = productList;
		this.productTotalCount = productTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.productCountPerPage = productCountPerPage;
		this.firstRow = firstRow;
		this.endRow = endRow;
		this.productPageTotalCount = productPageTotalCount;
	}



	public List<ProductVO> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductVO> productList) {
		this.productList = productList;
	}

	public int getProductTotalCount() {
		return productTotalCount;
	}

	public void setProductTotalCount(int productTotalCount) {
		this.productTotalCount = productTotalCount;
	}

	public int getCurrentPageNumber() {
		return currentPageNumber;
	}

	public void setCurrentPageNumber(int currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}

	public int getProductCountPerPage() {
		return productCountPerPage;
	}

	public void setProductCountPerPage(int productCountPerPage) {
		this.productCountPerPage = productCountPerPage;
	}

	public int getFirstRow() {
		return firstRow;
	}

	public void setFirstRow(int firstRow) {
		this.firstRow = firstRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getProductPageTotalCount() {
		return productPageTotalCount;
	}

	public void setProductPageTotalCount(int productPageTOtalCount) {
		this.productPageTotalCount = productPageTOtalCount;
	}

	@Override
	public String toString() {
		return "ProductViewVO [productList=" + productList + ", productTotalCount=" + productTotalCount
				+ ", currentPageNumber=" + currentPageNumber + ", productCountPerPage=" + productCountPerPage
				+ ", firstRow=" + firstRow + ", endRow=" + endRow + ", productPageTotalCount=" + productPageTotalCount
				+ "]";
	}
	
	
	

}
