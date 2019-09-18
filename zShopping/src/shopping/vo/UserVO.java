package shopping.vo;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

public class UserVO {
	private int user_id;
	private String user_name;
	private String user_loginId;
	private String user_password;
	private String user_postAddress;
	private String user_address;
	private String user_detailAddress;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate user_birth;
	private String user_phone;
	private String user_gender;
	
	
	public UserVO() {}
	
	public UserVO(int user_id, String user_name, String user_loginId, String user_password, String user_postAddress,
			String user_address, String user_detailAddress, LocalDate user_birth, String user_phone,
			String user_gender) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_loginId = user_loginId;
		this.user_password = user_password;
		this.user_postAddress = user_postAddress;
		this.user_address = user_address;
		this.user_detailAddress = user_detailAddress;
		this.user_birth = user_birth;
		this.user_phone = user_phone;
		this.user_gender = user_gender;
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




	public String getUser_postAddress() {
		return user_postAddress;
	}




	public void setUser_postAddress(String user_postAddress) {
		this.user_postAddress = user_postAddress;
	}




	public String getUser_address() {
		return user_address;
	}




	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}




	public String getUser_detailAddress() {
		return user_detailAddress;
	}




	public void setUser_detailAddress(String user_detailAddress) {
		this.user_detailAddress = user_detailAddress;
	}




	public LocalDate getUser_birth() {
		return user_birth;
	}




	public void setUser_birth(LocalDate user_birth) {
		this.user_birth = user_birth;
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




	@Override
	public String toString() {
		return "UserVO [user_id=" + user_id + ", user_name=" + user_name + ", user_loginId=" + user_loginId
				+ ", user_password=" + user_password + ", user_postAddress=" + user_postAddress + ", user_address="
				+ user_address + ", user_detailAddress=" + user_detailAddress + ", user_birth=" + user_birth
				+ ", user_phone=" + user_phone + ", user_gender=" + user_gender + "]";
	}
	
	
	
}

