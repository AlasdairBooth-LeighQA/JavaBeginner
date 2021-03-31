package com.qa.day1;

public class Hello {

	public static void helloworld(String str) {
		System.out.println(str);
	}
	public static void method1() {
		System.out.println("method1");
	}
	public static void method2() {
		int a = 334;
		System.out.println(a);
	}
	public static void method3() {
		int b = 1093;
		System.out.println(b);
	}
	
	public static String h4() {
		return "Hello world - return";
	}
	
	public static void h2(String fname, String sname) {
		System.out.println("Hello World" + fname + sname);
	}
	

	public static void runAll() {
		method1();
		method2();
		method3();
	}
}
