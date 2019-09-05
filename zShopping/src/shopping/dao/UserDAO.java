package shopping.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import shopping.vo.UserVO;

public interface UserDAO {
	
	// User DB SQL
	public void updateUser(UserVO user);
	public void deleteUser(int id);
	public void insertUser(UserVO user);
	public UserVO selectOne(String email);
	public List<UserVO> selectAll();
	
	//로그인 체크
	public boolean loginCheck(UserVO user);
	//로그인 정보
	public UserVO viewUser(UserVO user);
	//로그아웃
	public void logout(HttpSession session);
}
