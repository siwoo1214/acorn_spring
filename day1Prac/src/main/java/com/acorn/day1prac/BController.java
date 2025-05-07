package com.acorn.day1prac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//컨트롤러 어노테이션을 붙여주는것이 2번째 방법
//클래스 단위가 아니라 메소드 단위로 만들어준다
@Controller
public class BController {
	
	//mvc
	// view : 매핑의 이름
	// model : Model객체를 제공한다
	@RequestMapping(value="/hi1", method=RequestMethod.GET)
	public void hi1(Model model) {   //매개변수에 Model model
		model.addAttribute("data","hi1");
	}
	
	// view : 반환하는 문자열의 이름
	// model : Model model객체를 제공함
	@RequestMapping(value="/hi2",method=RequestMethod.GET)
	public String hi2(Model model) {
		model.addAttribute("data","hi2!!@@");
		return "hi2";  //=> hi2가 뷰의 이름
	}
	
	//ModelAndView객체 반환
	@RequestMapping(value = "/hi3",method = RequestMethod.GET)
	public ModelAndView hi3() {
		ModelAndView mv = new ModelAndView();  //두가지 정보를 담아주면 된다 => 뷰이름, 모델정보
		mv.setViewName("hi3");
		mv.addObject("data","hi3!!!!!~~~~");
		return mv;
	}
}
