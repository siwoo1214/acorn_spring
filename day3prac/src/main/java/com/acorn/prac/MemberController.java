package com.acorn.prac;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
	@Autowired
	MemberRepository repository;
	
	@GetMapping("/members")
	public String getMembers() {
		List<Member> list = repository.selectAll();
		System.out.println(list);
		return "memberList";
	}
	
	//조인된 쿼리를 담아오는 역할할 때 많이 사용한다
	@GetMapping("/members2")
	public String getMembers2() {
		List<Map<String,Object>> list = repository.selectAll2();
		System.out.println(list);
		return "memberList";
	}
	
	@GetMapping("/member")
	public String getOne() {
		Member member = repository.selectOne("sioo");
		System.out.println(member);
		return "member";
	}
	
	@GetMapping("/insert")
	public String insert(@ModelAttribute Member member) {
	
		int result = repository.insert(member);
		System.out.println(result);
		return "member";
	}
	
	@GetMapping("/update")
	public String update(@ModelAttribute Member member) {
		int result = repository.update(member);
		System.out.println(result);
		return "member";
	}
	
	@GetMapping("/deleteOne")
	public String deleteOne(@RequestParam String id) {
		int result = repository.deleteOne(id);
		System.out.println(result);
		return "member";
	}
	
	@GetMapping("/deleteAll")
	public String deleteALL() {
		int result = repository.deleteAll();
		System.out.println(result);
		return "member";
	}
}
