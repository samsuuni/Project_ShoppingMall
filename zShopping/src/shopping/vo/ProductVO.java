package shopping.vo;

public class ProductVO {

	private int prod_id;
	private String prod_name;
	private int prod_price;
	private String prod_image;
	private String category;
	private int amount;
	
	
	public ProductVO() {}
	public ProductVO(int prod_id, String prod_name, int prod_price, String prod_image, String category, int amount) {
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.prod_image = prod_image;
		this.category = category;
		this.amount = amount;
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
	public String getProd_image() {
		return prod_image;
	}
	public void setProd_image(String prod_image) {
		this.prod_image = prod_image;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "ProductVO [prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_price=" + prod_price
				+ ", prod_image=" + prod_image + ", category=" + category + ", amount=" + amount + "]";
	}
	
	
	
	
	
}
