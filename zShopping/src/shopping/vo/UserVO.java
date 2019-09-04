package shopping.vo;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class UserVO {
	private int user_id;
	private String user_name;
	private String user_loginId;
	private String user_password;
	private String user_address;
	@DateTimeFormat(pattern="yyyy-MM--dd")
	private LocalDate user_birth;
	private int user_age;
	private String user_phone;
	private String user_gender;
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
	public String getUser_loginId() {
		return user_loginId;
	}
	public void setUser_loginId(String user_loginId) {
		this.user_loginId = user_loginId;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public LocalDate getUser_birth() {
		return user_birth;
	}
	public void setUser_birth(LocalDate user_birth) {
		this.user_birth = user_birth;
	}
	public int getUser_age() {
		return user_age;
	}
	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public UserVO(int user_id, String user_name, String user_loginId, String user_password, String user_address,
			LocalDate user_birth, int user_age, String user_phone, String user_gender) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_loginId = user_loginId;
		this.user_password = user_password;
		this.user_address = user_address;
		this.user_birth = user_birth;
		this.user_age = user_age;
		this.user_phone = user_phone;
		this.user_gender = user_gender;
	}
	
	public UserVO() {}
	
	@Override
	public String toString() {
		return "UserVO [user_id=" + user_id + ", user_name=" + user_name + ", user_loginId=" + user_loginId
				+ ", user_password=" + user_password + ", user_address=" + user_address + ", user_birth=" + user_birth
				+ ", user_age=" + user_age + ", user_phone=" + user_phone + ", user_gender=" + user_gender + "]";
	}
	
	
}

