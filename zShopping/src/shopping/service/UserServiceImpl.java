package shopping.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import shopping.dao.UserDAO;
import shopping.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO userDao;

	//로그인 체크
	@Override
	public ModelAndView loginCheck(UserVO user, HttpSession session) {
		boolean result = userDao.loginCheck(user);
		ModelAndView mav = new ModelAndView();
		if(result == true) { // 로그인 성공
			mav.setViewName("index");
			mav.addObject("msg", "success");
		} else {
			mav.setViewName("cozastore-master/login");
			mav.addObject("msg", "failure");
		}
		return mav;
	}
	//로그인 정보
	@Override
	public UserVO viewUser(UserVO user) {
		return userDao.viewUser(user);
	}
	//로그아웃
	@Override
	public void logOut(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("cozastore-master/login");
		mav.addObject("msg", "logout");
		session.invalidate();
	}
	@Override
	public void insertUser(UserVO user) {
		userDao.insertUser(user);
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
	public void selectUser(int id) {
		userDao.selectOne(id);
	}
	@Override
	public void selectAll() {
		userDao.selectAll();
	}
	
}
