package com.acorn.day1prac;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	// 로그인
	@RequestMapping(value="/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		
		return "login";
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String login(@RequestParam (required = false) String id,
			@RequestParam (required = false) String pw) {  
		System.out.println(id);
		System.out.println(pw);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/login2", method=RequestMethod.POST)
	public String login2(@ModelAttribute Member member) {   //기본생성자, setter사용함
		// 1) 수집된 정보를 객체형태로 바인딩
		// 2) Model에 저장해줌 (key는 타입의 첫글자 소문자 규칙으로 저장)
		System.out.println(member);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/login3", method=RequestMethod.POST)
	public String login2(HttpServletRequest requset) {
		String id = requset.getParameter("id");
		String pw = requset.getParameter("pw");
		
		Member m = new Member();
		m.setId(id);
		m.setPw(pw);
		
		System.out.println(id+pw);
		
		return "redirect:/";
	}
}
