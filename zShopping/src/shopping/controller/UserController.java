package shopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import shopping.service.UserService;
import shopping.vo.UserVO;

@Controller
@SessionAttributes("email")
public class UserController {
	
	@Autowired
	UserService userService;
	
	// 로그인 화면
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	
	//로그인 처리
//	@PostMapping("/loginCheck")
//	public ModelAndView loginCheck(@ModelAttribute UserVO user, HttpSession session) {
//		ModelAndView mav = userService.loginCheck(user, session);
//		return mav;
//	}
	
	//로그인처리
	@PostMapping("/loginCheck")
	public String loginCheck(@RequestParam("email") String email,@RequestParam("pass") String pass, Model model) {
		// 아이디랑 패스워드를 가지고 DB에서 얘네 나머지 정보 다 가져오기.
		model.addAttribute("email", email);
		model.addAttribute("pass", pass);
		model.addAttribute("msg", "로그인 성공");
		return "main";
	}
	
	
	//로그아웃 처리
	@RequestMapping("logout.do")
	public void logout(HttpSession session) {
		userService.logOut(session);
	}
	
	
	//메인화면
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	

}
