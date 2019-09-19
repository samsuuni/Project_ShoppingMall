package shopping.mapper;

import java.util.List;

import shopping.vo.ReviewVO;

@MyMapper
public interface ReviewMapper {
	
	public void insertReview(ReviewVO review);
	public List<ReviewVO> selectReviewListWithProdId(int prod_id);
	
	public int selectReviewCountWithProdId(int prod_id);
	public ReviewVO selectOneReview(int review_id);

}
