package shopping.vo;

public class ReviewVO {
	
	private int review_id;
	private int prod_id;
	private int user_id;
	private String user_name;
	private String review_content;
	private int review_rating;
	
	public ReviewVO() {	}

	public int getReview_id() {
		return review_id;
	}

	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getReview_content() {
		return review_content;
	}

	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}

	public int getReview_rating() {
		return review_rating;
	}

	public void setReview_rating(int review_rating) {
		this.review_rating = review_rating;
	}

	@Override
	public String toString() {
		return "ReviewVO [review_id=" + review_id + ", prod_id=" + prod_id + ", user_id=" + user_id + ", user_name="
				+ user_name + ", review_content=" + review_content + ", review_rating=" + review_rating + "]";
	}
	
	
	

}
