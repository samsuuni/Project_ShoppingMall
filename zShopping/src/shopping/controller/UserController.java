package shopping.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import shopping.service.UserService;
import shopping.vo.CartVO;
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
		if(result) { // login 성공시 page 전환
			mav.setViewName("main");
		}else { // login 실패시 page 전환
			mav.setViewName("login");
			mav.addObject("msg", "failure");
		}
		
		return mav;
	}

	
	//로그아웃 처리
	@RequestMapping("/logout")
	public String logout(String page, HttpSession session, Model model) {
		userService.logOut(session);
		model.addAttribute("page", page);
		return "main";
	}
	
	
	//메인화면
	@RequestMapping("main")
	public String main() {
		return "/main";
	}
	
	//회원가입 화면
	@RequestMapping("signUp")
	public String signUp() {
		return "/signUp";
	}
	
	//email 중복 확인
	@RequestMapping("emailCheck")
	@ResponseBody
	public Map<Object, Object> emailCheck(@RequestBody String user_loginId) {
		int count = userService.emailCheck(user_loginId);
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("cnt", count); //숫자로 반환
		return map;
	}
	//회원 가입
	@RequestMapping("insertUser")
	public ModelAndView signUp(@ModelAttribute UserVO user, HttpSession session) {
		int result = userService.insertUser(user, session);
		ModelAndView mav = new ModelAndView();
		if(result>0) {
			mav.setViewName("loginCheck");
		}else {
			mav.setViewName("loginCheck");
			mav.addObject("msg", "signUp fail");
		}
		return mav;
	}
}
