package com.acorn.day2.di;

public class AcornCalculator implements Calculator{
	@Override
	public int add(int num1, int num2) {
		System.out.println(num1+num2);
		return num1+num2;
	}
}
