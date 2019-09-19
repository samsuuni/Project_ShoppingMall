package shopping.vo;

import java.util.List;

public class ReviewListVO {
	
	private List<ReviewVO> reviewList;
	private int productReviewTotalCount;
	private int currentPageNumber;
	private int reviewCountPerPage;
	private int firstRow;
	private int endRow;
	private int reviewPageTotalCount;
	
	public ReviewListVO() {	}

	public ReviewListVO(List<ReviewVO> reviewList, int productReviewTotalCount, int currentPageNumber,
			int reviewCountPerPage, int firstRow, int endRow, int reviewPageTotalCount) {
		this.reviewList = reviewList;
		this.productReviewTotalCount = productReviewTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.reviewCountPerPage = reviewCountPerPage;
		this.firstRow = firstRow;
		this.endRow = endRow;
		this.reviewPageTotalCount = reviewPageTotalCount;
	}



	public List<ReviewVO> getReviewList() {
		return reviewList;
	}

	public void setReviewList(List<ReviewVO> reviewList) {
		this.reviewList = reviewList;
	}

	public int getProductReviewTotalCount() {
		return productReviewTotalCount;
	}

	public void setProductReviewTotalCount(int productReviewTotalCount) {
		this.productReviewTotalCount = productReviewTotalCount;
	}

	public int getCurrentPageNumber() {
		return currentPageNumber;
	}

	public void setCurrentPageNumber(int currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}

	public int getReviewCountPerPage() {
		return reviewCountPerPage;
	}

	public void setReviewCountPerPage(int reviewCountPerPage) {
		this.reviewCountPerPage = reviewCountPerPage;
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

	public int getReviewPageTotalCount() {
		return reviewPageTotalCount;
	}

	public void setReviewPageTotalCount(int reviewPageTotalCount) {
		this.reviewPageTotalCount = reviewPageTotalCount;
	}

	@Override
	public String toString() {
		return "ReviewListVO [reviewList=" + reviewList + ", productReviewTotalCount=" + productReviewTotalCount
				+ ", currentPageNumber=" + currentPageNumber + ", reviewCountPerPage=" + reviewCountPerPage
				+ ", firstRow=" + firstRow + ", endRow=" + endRow + ", reviewPageTotalCount=" + reviewPageTotalCount
				+ "]";
	}
	
	
	
	

}
