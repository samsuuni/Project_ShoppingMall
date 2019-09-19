package shopping.dao;

import java.util.List;

import shopping.vo.ReviewVO;

public interface ReviewDAO {
	
	public void insertReview(ReviewVO review);
	public List<ReviewVO> selectReviewListWithProdId(int prod_id);
	public int getProductReviewCount(int prod_id);
	public ReviewVO selectOneReview(int review_id);

}
