package shopping.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import shopping.mapper.ReviewMapper;
import shopping.vo.ReviewVO;

@Repository("reviewDao")
public class ReviewDAOImpl implements ReviewDAO {

	@Autowired
	ReviewMapper reviewMapper;
	
	@Override
	public void insertReview(ReviewVO review) {
		reviewMapper.insertReview(review);
	}

	@Override
	public List<ReviewVO> selectReviewListWithProdId(int prod_id) {
		return reviewMapper.selectReviewListWithProdId(prod_id);
	}

	@Override
	public int getProductReviewCount(int prod_id) {
		return reviewMapper.selectReviewCountWithProdId(prod_id);
	}

	@Override
	public ReviewVO selectOneReview(int review_id) {
		return reviewMapper.selectOneReview(review_id);
	}

}
