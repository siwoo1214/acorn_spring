package com.acorn.day1prac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {
	
	//요청시 값이 전달되지 않으면 null
	//dafault value를 설정할 수 있다
	@RequestMapping(value="param1", method=RequestMethod.GET)
	public String method(
			@RequestParam(required = false, defaultValue = "test") String id,
			@RequestParam(required = false, defaultValue = "0000") String pw) {
		
		System.out.println(id);
		System.out.println(pw);
		return "paramView";
	}
	
	
	// 요청시 값이 전달되지 않으면 400오류 발생 (오류발생)
	@RequestMapping(value="param2", method=RequestMethod.GET)
	public String method2(
			@RequestParam(required = true) String id,
			@RequestParam(required = true) String pw) {
		
		System.out.println(id);
		System.out.println(pw);
		return "paramView";
	}
	
	@RequestMapping(value="param3", method=RequestMethod.GET)
	public String method3(int page) {
		
		System.out.println(page);
		return "paramView";
	}
	
	// 3번의 경우 값이 전달되지 않으면 오류발생
	// 이유는 값이 없으면 null이므로 page변수에 null을 저장하려고 할 때 오류 발생(null은 참조형 변수만 저장할 수 있음)
	// 해결책 : Integer 사용하기, defaultValue 사용하기
	@RequestMapping(value="param4", method=RequestMethod.GET)
	public String method4(Integer page) {
		
		System.out.println(page);
		return "paramView";
	}
	
	// 값 안넣어도 되 근데 안넣으면 1로 넣어줄게
	@RequestMapping(value="param5", method=RequestMethod.GET)
	public String method5(@RequestParam(required = false, defaultValue = "1") int page) {
		
		System.out.println(page);
		return "paramView";
	}
}
