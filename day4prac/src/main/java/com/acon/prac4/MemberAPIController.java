package com.acon.prac4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberAPIController {
	
	//고객정보 가져오기, json으로
	@ResponseBody
	@RequestMapping(value = "/members", method=RequestMethod.GET)
	public List<Member> members(){
		List<Member> list = new ArrayList<>();
		list.add(new Member("acorn1","1234","lee"));
		list.add(new Member("acorn2","1214","kim"));
		list.add(new Member("acorn3","1534","park"));
		
		return list;
	}
	
	//고객 한명 조회하기
	@ResponseBody
	@RequestMapping(value = "/members/{id}", method=RequestMethod.GET)
	public Member memberOne(@PathVariable String id){
		List<Member> list = new ArrayList<>();
		list.add(new Member("acorn1","1234","lee"));
		list.add(new Member("acorn2","1214","kim"));
		list.add(new Member("acorn3","1534","park"));
		int index = Integer.parseInt(id);
		Member member = list.get(index);
		return member;
	}
	
	//고객 등록하기
	//화면에서 json 문자열로 보낸 데이터를 자바객체 member로 변환하기
	//@RequestBody
	@RequestMapping(value = "/reg1", method=RequestMethod.POST)
	public String memberReg(@RequestBody Member member) {
		System.out.println(member);
		return "1";
	}
	
	//고객 변경하기 보내는 쪽에서 url: /prac4/members/1
	//변경이 미미한건 patch로 
	@ResponseBody
	@RequestMapping(value="/members/{id}", method = RequestMethod.PUT)
	public String memberUpdate(@PathVariable String id, @RequestBody Member member) {
		System.out.println(member);
		System.out.println(id);
		return "1";
	}
	
	//고객 삭제하기
	@ResponseBody
	@RequestMapping(value="/members/{id}", method=RequestMethod.DELETE)
	public String memberDelete(@PathVariable String id) {
		System.out.println(id);
		return "1";
	}
	
}
