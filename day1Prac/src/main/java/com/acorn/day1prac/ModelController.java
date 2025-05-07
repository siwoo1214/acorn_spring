package com.acorn.day1prac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ModelController {
	//@ModelAttribute
	//객체타입으로 바인딩 할 때 사용하는 어노테이션
	//model객체에 저장이 된다 (자동으로)
	
	// @ModelAttribute => model에 저장시
	// type의 첫글자를 소문자로 키로 지정함
	@RequestMapping(value = "/modelAtt1", method=RequestMethod.GET)
	public String method1(@ModelAttribute Member member) {
		System.out.println(member);
		
		return "modelView1";
	}
	
	// model에 저장시 키의 이름을 임의로 지정하고 싶으면
	// (@ModelAttribute("myUser") Member member)
	@RequestMapping(value="/modelAtt2", method = RequestMethod.GET)
	public String method2(@ModelAttribute("myUser") Member member) {
		
		return "modelView2";
	}
}


//개별단위는 requestParam