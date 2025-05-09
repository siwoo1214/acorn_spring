package com.acorn.prac;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<>();
		
		map.put("id", "t9");
		map.put("pwd", "9999");
		map.put("name", "kim");
		
		System.out.println(map);
	}
}
