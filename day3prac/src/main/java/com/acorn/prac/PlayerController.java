package com.acorn.prac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayerController {
	
	
	@Autowired
	PlayerRepository repo;
	
	@GetMapping("/members1")
	public String getMember() {
		List<Player> list = repo.selectAll();
		System.out.println(list);
		return "test";
	}
}
