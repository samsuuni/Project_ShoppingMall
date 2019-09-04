package shopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import shopping.service.UserService;
import shopping.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	//로그인 화면
	@RequestMapping("login.do")
	public String login() {
		return "cozastore-master/login";
	}
	
	//로그인 처리
	@RequestMapping("loginCheck.do")
	public ModelAndView loginCheck(@ModelAttribute UserVO user, HttpSession session) {
		ModelAndView mav = userService.loginCheck(user, session);
		return mav;
	}
	//로그아웃 처리
	@RequestMapping("logout.do")
	public void logout(HttpSession session) {
		userService.logOut(session);
	}
}
