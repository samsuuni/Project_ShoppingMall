package shopping.service;

import java.util.List;

import shopping.vo.ReviewVO;

public interface ReviewService {
	
	public void addReview(int prod_id, int user_id, String review_content, int review_rating);
	public List<ReviewVO> selectProdReviewList(int prod_id);
	

}
