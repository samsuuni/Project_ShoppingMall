package shopping.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import shopping.dao.CartDAO;
import shopping.dao.UserDAO;
import shopping.vo.CartVO;
import shopping.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO userDao;
	
	@Autowired
	CartDAO cartDao;

	//로그인 체크
	@Override
	public boolean loginCheck(UserVO user, HttpSession session) {
		boolean result = userDao.loginCheck(user);
		if(result) { // 로그인 성공시 loginID , name 세션에 등록  +user_id
			UserVO userDB = viewUser(user);
			session.setAttribute("user", userDB);
			
			List<CartVO> cartList = cartDao.viewCartWithUserId(userDB.getUser_id());
			session.setAttribute("cartList", cartList);
		}
		
		return result;
	}
	//로그인 정보
	@Override
	public UserVO viewUser(UserVO user) {
		return userDao.viewUser(user);
	}
	//로그아웃
	@Override
	public void logOut(HttpSession session) {
		//로그아웃시 login page 전환, msg 등록, 세션 초기화
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login.do");
		mav.addObject("msg", "logout");
		session.invalidate();
	}
	//회원 가입
	@Override
	public int insertUser(UserVO user, HttpSession session) {
		int result = userDao.insertUser(user);
		if(result>0) {
			UserVO userDB = viewUser(user);
			session.setAttribute("user", userDB);
		}
		return result;
	}
	@Override
	public void updateUser(UserVO user) {
		userDao.updateUser(user);
	}
	@Override
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}
	@Override
	public UserVO selectUser(String email) {
		return userDao.selectOne(email);
	}
	@Override
	public List<UserVO> selectAll() {
		return userDao.selectAll();
	}
	//이메일 중복 체크
	@Override
	public int emailCheck(String user_loginId) {
		//객체 존재 여부 확인
		int result = userDao.emailCheck(user_loginId);
		return result;
	}
	
}
