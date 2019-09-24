package shopping.vo;

public class ProductVO {

	private int prod_id;
	private String prod_name;
	private int prod_price;
	private String prod_image;
	private String prod_category;
	private String prod_comment;
	
	public ProductVO() {}
	
	public ProductVO(int prod_id, String prod_name, int prod_price, String prod_image, String prod_category,
			String prod_comment) {
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.prod_image = prod_image;
		this.prod_category = prod_category;
		this.prod_comment = prod_comment;
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
	public String getProd_category() {
		return prod_category;
	}
	public void setProd_category(String prod_category) {
		this.prod_category = prod_category;
	}
	public String getProd_comment() {
		return prod_comment;
	}
	public void setProd_comment(String prod_comment) {
		this.prod_comment = prod_comment;
	}
	
	

	
	
	
	
	
}
