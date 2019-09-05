package shopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import shopping.service.UserService;
import shopping.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	//로그인 화면
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	

	
	//로그인 처리
	@RequestMapping("loginCheck")
	public ModelAndView loginCheck(@ModelAttribute UserVO user, HttpSession session) {
		boolean result = userService.loginCheck(user, session);
		ModelAndView mav = new ModelAndView();
		System.out.println("userID " + user.getUser_loginId());
		if(result) { // login 성공시 page 전환
			mav.setViewName("main");
			mav.addObject("msg", "success");
		}else { // login 실패시 page 전환
			mav.setViewName("login");
			mav.addObject("msg", "failure");
		}
		return mav;
	}

	
	//로그아웃 처리
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		userService.logOut(session);
		return "main";
	}
	
	
	//메인화면
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	

}
