package com.LSJ.first.ch11_18.exam;

public class Calculator {
	
	public void addition(int num1, int num2) {
		System.out.println("더하기()");
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
	
	public void subtraction(int num1, int num2) {
		System.out.println("빼기()");
		int result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
	}
	
	public void multiplication(int num1, int num2) {
		System.out.println("곱하기()");
		int result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
	}
	
	public void division(int num1, int num2) {
		System.out.println("나누기()");
		int result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
	}
}
