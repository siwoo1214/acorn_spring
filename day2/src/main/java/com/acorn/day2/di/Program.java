package com.acorn.day2.di;

public class Program {
	
	Calculator calculator;
	
	// 외부에서 생성된 계산기 객체를 주입받아서 사용
	// 생성자 주입
	// setter 주입
	
	// 생성자 주입
	public Program(Calculator calculator) {
		super();
		this.calculator = calculator;
	}
	
	public Program() {
		// TODO Auto-generated constructor stub
	}
	
	// setter 주입
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	void addNumber(int su1, int su2) {
		int result = calculator.add(su1, su2);
		System.out.println(result+"입니다");
	}

}
