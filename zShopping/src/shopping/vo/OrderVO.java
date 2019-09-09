package shopping.vo;

import java.time.LocalDateTime;

public class OrderVO {
	private int order_id;
	private int user_id;
	private String order_content;
	private LocalDateTime order_day;
	private int order_totalPrice;
	
	public OrderVO() {}
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getOrder_content() {
		return order_content;
	}
	public void setOrder_content(String order_content) {
		this.order_content = order_content;
	}
	public LocalDateTime getOrder_day() {
		return order_day;
	}
	public void setOrder_day(LocalDateTime order_day) {
		this.order_day = order_day;
	}
	public int getOrder_totalPrice() {
		return order_totalPrice;
	}
	public void setOrder_totalPrice(int order_totalPrice) {
		this.order_totalPrice = order_totalPrice;
	}

	@Override
	public String toString() {
		return "OrderVO [order_id=" + order_id + ", user_id=" + user_id + ", order_content=" + order_content
				+ ", order_day=" + order_day + ", order_totalPrice=" + order_totalPrice + "]";
	}
	
	
	
	

}
