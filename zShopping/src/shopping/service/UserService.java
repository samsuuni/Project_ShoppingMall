package shopping.service;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import shopping.vo.UserVO;

public interface UserService {
	//회원 로그인 체크
	public ModelAndView loginCheck(UserVO user, HttpSession session);
	//회원 로그인 정보
	public UserVO viewUser(UserVO user);
	//회원 로그아웃
	public void logOut(HttpSession session);
	//회원 가입
	public void insertUser(UserVO user);
	//회원 정보 수정
	public void updateUser(UserVO user);
	//회원 탈퇴
	public void deleteUser(int id);
	//회원 정보 (1인)
	public void selectUser(int id);
	//회원 정보 (all)
	public void selectAll();
}
