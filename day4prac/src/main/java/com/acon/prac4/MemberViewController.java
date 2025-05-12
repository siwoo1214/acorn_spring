package com.acon.prac4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberViewController {
	
	//고객 조회화면
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String membersView() {
		return "search";
	}
	
	//고객 조회화면
	@RequestMapping(value = "/search2", method = RequestMethod.GET)
	public String members2View() {
		return "search2";
	}
	
	//고객 추가
	@RequestMapping(value = "/reg1", method = RequestMethod.GET)
	public String membersReg() {
		return "reg1";
	}
	
	//변경하기
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String membersUpadate() {
		return "update";
	}
	
	//삭제하기
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String membersDelete() {
		return "delete";
	}
}
