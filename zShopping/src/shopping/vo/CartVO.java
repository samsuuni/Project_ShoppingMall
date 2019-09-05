package shopping.vo;

public class CartVO {
	
	private int cart_id;
	private int user_id;
	private int prod_id;
	private String prod_name;
	private int prod_price;
	private int prod_cartAmt;
	private int prod_totalPrice;
	
	public CartVO() {}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public int getProd_price() {
		return prod_price;
	}

	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}
	
	public int getProd_cartAmt() {
		return prod_cartAmt;
	}

	public void setProd_cartAmt(int prod_cartAmt) {
		this.prod_cartAmt = prod_cartAmt;
	}

	public int getProd_totalPrice() {
		return prod_totalPrice;
	}

	public void setProd_totalPrice(int prod_totalPrice) {
		this.prod_totalPrice = prod_totalPrice;
	}

	
	
	
	//테스트용 생성자
	public CartVO(int cart_id, int user_id, int prod_id, String prod_name, int prod_price, int prod_cartAmt, int prod_totalPrice) {
		this.cart_id = cart_id;
		this.user_id = user_id;
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.prod_cartAmt = prod_cartAmt;
		this.prod_totalPrice = prod_totalPrice;
	}

	
	//테스트 출력용
	@Override
	public String toString() {
		return "CartVO [cart_id=" + cart_id + ", user_id=" + user_id + ", prod_id=" + prod_id + ", prod_name="
				+ prod_name + ", prod_price=" + prod_price + ", prod_cartAmt=" + prod_cartAmt + ", prod_totalPrice="
				+ prod_totalPrice + "]";
	}

}
