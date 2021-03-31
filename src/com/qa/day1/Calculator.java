package com.qa.day1;

public class Calculator {
//Underneath is wrong, it's just printing, not returning
	public static void methodaddition(int num1, int num2) {
		System.out.println(num1 + num2);
	}
//Underneath is wrong, it's just printing, not returning
	public static void methodsubtract(int num1, int num2) {
		System.out.println(num1 - num2);
	}
//Underneath is wrong, it's just printing, not returning	
	public static void methodmultiply(int num1, int num2) {
		System.out.println(num1 * num2);
	}
//Underneath is wrong, it's just printing, not returning	
	public static void methoddivision(int num1, int num2) {
		System.out.println(num1 / num2);
	}
//Underneath returns an addition 
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
//Underneath returns a multiplication	
	public static double multiply(double n1, double n2) {
		double result = n1 * n2;
		return n1 * n2;
	}
//Underneath returns a subtraction	
	public static int subtraction(int num1, int num2) {
		int result = num1 - num2;
		return num1 - num2;
	}
//Underneath returns a division
	public static int division(int num1, int num2) {
		int result = num1 / num2;
		return num1 / num2;
	}{
	
//	if (num1 <= || num2) {
		System.out.println("first num is smaller than second");
//	} else if {
		System.out.println("Division cannot be performed");}
	}
//}