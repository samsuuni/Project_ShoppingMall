package test;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import shopping.service.UserService;
import shopping.vo.UserVO;

class TestJunit {

	@Test
	void test() {
//		fail("Not yet implemented");

		ApplicationContext context = new GenericXmlApplicationContext("config/root-context.xml");
		
		
		UserService us = context.getBean("userService", UserService.class);
		
		UserVO user = new UserVO();
		
		user.setUser_loginId("powerRanger");
		user.setUser_name("blue");
		user.setUser_gender("Man");
		user.setUser_age(31);
		user.setUser_address("Tokyo");
		user.setUser_password("123123");
		user.setUser_phone("01012345678");
		
		LocalDate birth = LocalDate.of(1989, 07, 18);
		user.setUser_birth(birth);
		
		
//		us.insertUser(user);
//		us.deleteUser(1);
		
	}

}
