package com.acorn.day2.di2;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component  //객체 생성
public class DanService {
	public ArrayList<String> getDan(){
		ArrayList<String> dan2 = new ArrayList<String>();
		dan2.add("2*1=2");
		dan2.add("2*2=4");
		dan2.add("2*3=6");
		dan2.add("2*4=8");
		dan2.add("2*5=10");
		dan2.add("2*6=12");
		dan2.add("2*7=14");
		dan2.add("2*8=16");
		dan2.add("2*9=18");
		return dan2;
	}
	
	public ArrayList<String> getDanver2(int num){
		ArrayList<String> dan2 = new ArrayList<String>();
		dan2.add(num+"*1="+num*1);
		dan2.add(num+"*2="+num*2);
		dan2.add(num+"*3="+num*3);
		dan2.add(num+"*4="+num*4);
		dan2.add(num+"*5="+num*5);
		dan2.add(num+"*6="+num*6);
		dan2.add(num+"*7="+num*7);
		dan2.add(num+"*8="+num*8);
		dan2.add(num+"*9="+num*9);
		
		return dan2;
	}
	
	public ArrayList<String> getDanver3(int num){
		ArrayList<String> dan2 = new ArrayList<String>();
		for(int i=1; i<9; i++) {
			dan2.add(num+"*"+i+"="+num*i);			
		}
		
		return dan2;
	}
}
