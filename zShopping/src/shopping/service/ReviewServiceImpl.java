package shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopping.dao.ReviewDAO;
import shopping.dao.UserDAO;
import shopping.vo.ReviewVO;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewDAO reviewDao;
	
	@Autowired
	UserDAO userDao;
	
	@Override
	public void addReview(int prod_id, int user_id, String review_content, int review_rating) {
		ReviewVO review = new ReviewVO();
		review.setProd_id(prod_id);
		review.setUser_id(user_id);
		review.setUser_name(userDao.selectOneWithUserId(user_id).getUser_name());
		review.setReview_content(review_content);
		review.setReview_rating(review_rating);
		System.out.println(review);

		reviewDao.insertReview(review);
	}

	@Override
	public List<ReviewVO> selectProdReviewList(int prod_id) {
		return reviewDao.selectReviewListWithProdId(prod_id);
	}
	
	
	

}
