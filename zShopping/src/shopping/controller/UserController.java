package shopping.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public ModelAndView loginCheck(@ModelAttribute UserVO user, HttpSession session, String returnUrl) {
		boolean result = userService.loginCheck(user, session);
		ModelAndView mav = new ModelAndView();
		if(result) { // login 성공시 page 전환
			mav.addObject("returnUrl", returnUrl);
		}else { // login 실패시 page 전환
			mav.setViewName("loginCheck");
			mav.addObject("msg", "failure");
		}
		return mav;
	}
	
	
	
	
	// 구글api 로그인
	@RequestMapping("/googleApiLogin")
	public String googleApiLogin(String user_id, String user_name, String user_email) {
		return "googleApiLogin";
	}

	
	//로그아웃 처리
	@RequestMapping("/logout")
	public String logout(String page, HttpSession session, HttpServletRequest request, RedirectAttributes redirectAttributes) {
		
		userService.logOut(session);
		String referer = request.getHeader("Referer");
		if(referer.contains("shopping_cart") || referer.contains("checkout") || 
		referer.contains("confirm_order") || referer.contains("mypage") || referer.contains("myhistory")) {
			return "redirect:main";
		}else {
			return "redirect:"+referer;
		}
		
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
	
	// 주소 검색
	@RequestMapping("/jusoPopup")
	public String jusoPopup() {
		return "jusoPopup";
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
	
	
	//회원 정보 수정
	@RequestMapping("updateUser")
	public String updateUser(int user_id, String user_postAddress, String user_address, String user_detailAddress, String user_phone, HttpSession session) {
		userService.updateUser(user_id, user_phone, user_postAddress, user_address, user_detailAddress, session);
		
		return "mypage";
	}
	
	@RequestMapping("/mypage")
	public String goMypage() {
		return "mypage";
	}
}
