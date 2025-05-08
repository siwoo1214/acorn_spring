package com.acorn.day2.food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FoodService {
	String[] foods = {"신라면","삼양라면","안성탕면","틈새라면","불닭볶음면"};
	Map<String,Integer> foodlist = new HashMap<String,Integer>();
	
	public String getFood() {
		Random rd = new Random();
		int randInt = rd.nextInt(foods.length);
		return foods[randInt];
	}
	
	public String[] getFood2() {
//		Random rd = new Random();
//		int randInt = rd.nextInt(foods.length);
		return foods;
	}
	
	private void setMap() {
		foodlist.put("신라면", 3);
		foodlist.put("안성탕면", 2);
		foodlist.put("틈새라면", 4);
		foodlist.put("진라면 순한맛", 1);
	}
	
	public Map<String,Integer> getMap() {
		setMap();
		Random rd = new Random();
		List<String> keys = new ArrayList<String>(foodlist.keySet());
		
		int rand = rd.nextInt(keys.size());
		
		String key = keys.get(rand);
		int value = foodlist.get(key);
		
		Map<String,Integer> rst = new HashMap<String,Integer>();
		rst.put(key, value);
		return rst;
	}
}
