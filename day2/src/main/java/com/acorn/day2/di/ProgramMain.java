package com.acorn.day2.di;

import java.util.Scanner;

public class ProgramMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		//계산기 객체 생성하기
		Calculator cal = new AcornCalculator();
		
		// 생성자 주입
		//Program p = new Program(cal);
		//p.addNumber(su1, su2);
		
		// setter 주입
		Program p = new Program();
		p.setCalculator(cal);
		p.addNumber(su1, su2);
		
	}
}
