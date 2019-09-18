package shopping.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import shopping.vo.UserVO;

public interface UserDAO {
	
	// User DB SQL
	public void updateUser(UserVO user);
	public void deleteUser(int id);
	public int insertUser(UserVO user);
	public UserVO selectOne(String email);
	public List<UserVO> selectAll();
	public UserVO selectOneWithUserId(int user_id);
	
	//로그인 체크
	public boolean loginCheck(UserVO user);
	//로그인 정보
	public UserVO viewUser(UserVO user);
	//로그아웃
	public void logout(HttpSession session);
	//email 중복 체크
	public int emailCheck(String user_loginId);
}
