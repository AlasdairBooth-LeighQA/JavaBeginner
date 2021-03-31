package com.qa.day1;



public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Hello World");
		
//		//COMMENT - this is a test
//		int age = 25;
//		System.out.println(age);
		
	//	Hello.method1();
	//	Hello.method2();
	//	Hello.method3();
	//	Hello.helloworld("i am ironman");
	//	System.out.println(Hello.h4());
	//	Hello.h2("ironman", "3");
		
//		Calculator.methodaddition(5, 5);
//		Calculator.methodsubtract(4, 2);
//		Calculator.methodmultiply(2, 6);
//		Calculator.methoddivision(50, 2);
		
		int r = Calculator.add(3, 4);
		System.out.println(r);
		
		double g = Calculator.multiply(50,20);
		System.out.println(g);
		
		int o = Calculator.subtraction(15, 12);
		System.out.println(o);
		
		int j = Calculator.division(50, 10);
		System.out.println(j);
		
		
//		Results Class-
		
		r *= 3; // 9
		System.out.println(r);
		
		r /= 3; // 3
		System.out.println(r);
		
		boolean b4 = true;
		
		System.out.println(false != b4);
		
		Results.Biology = 87;
		Results.Chemistry = 103;
		Results.Physics = 145;
		
		Results.displayResults();
		Results.displayTotalAsPercentage();
		
//		Class names are in PascalCase
//		variables are named in camelCase
		
		int num = 4;
		String str = "Helllo";
		float price = 5.99f;
		boolean bool = true;
		char myLetter = 'd';
		double doub = 232;
		long l = 64l;
		
		
//		//Assignment Operation(=)
//		int i = 0;
		
//		//Arithmetic Operators
//		//
//		int i2 = 3 + 3; // addition
//		int i3 = 3 - 3; // subtraction
//		int i4 = 3 * 3; // multiplication
//		int i5 = 3 / 3; // division
		
//		//Modulo
//		//This way of finding odd and even values only
//		//works when you modulo by 2
//		// - <num> % 2
//		int i6 = 4 % 2; // 0 - it's even
//		int i7 = 5 % 2; // 1 - it's odd
		
//		//Unary Operators
//		// +, -, ++, --, !
//		int i8 = +934; //equivalent to 'i8 = 934';
//		int i9 = -45; // negative number
		
//		int i10 = 10;
//		i10++; // i10 = i10 + 1; - incrementing by 1
//		System.out.println(i10);
//		i10--; // i10 = i10 -1; - decrementing by 1
//		System.out.println(i10);
		
//		boolean b = true;
//		boolean a = !b;
//		System.out.println(a); // will give false
//		System.out.println(!true); // will give false
		
//		//Compound Operators
//		//A shortcut operator; do operation then assignment
//		//+=, -=, *=, /=, %=, !=
		
		//+=   will do addition first then do assignment
//		int f = 3;
//		f += 3; // longform would be f = f + 3;
//		System.out.println(f);
		
//		f -=3; // gives 3
//		System.out.println(f);

//		f *= 3; // gives 9
//		System.out.println(f);
		
//		f /= 3; // gives 3
//		System.out.println(f);
		
//		boolean bool1 = true;
//		boolean bool2 = false;

		String st1 = "Hello";
		String st2 = "Hello";
		String st3 = "World";
		
//		Standard equality check//
//		checking if two items are equal//
		boolean didItMatch = (st1 == st2);
		
		
		if (st1 == st2) {
			System.out.println("hello");
		} else {
		System.out.println("st1 and st2 are not equal");
		}
		
		if (didItMatch) {
			System.out.println("hello");
		} else {
			System.out.println("sy1 is not equal to st3, woohoo");
		}
		
		if (st1 != st3) {
			System.out.println();
		}
		
		
//		//Logical Operators
		boolean bool1 = true;
		boolean bool2 = false;
		
		if (bool1 && getBool()) {
			System.out.println("Both are true 1 (logical AND)");
		}
		
		if (bool2 && getBool()) {
			System.out.println("Both are true 2");
		}
		
		if (bool2 & getBool()) {
			System.out.println("Both are true 3(bitwise AND)");}
		
//		Logical OR
		if (bool1 || getBool()) {
			System.out.println("bool1 or getBool() is true(logical OR)");}
		}
		
		int temp = 3;{
		
		if (temp > 25) {
			System.out.println("temp greater than 25");
		}else if (temp >= 10) {
			System.out.println("temp greater than or equal to 10, less than 25");
		}else {
			System.out.println("temp is less than 10");}
			
		}
	
		public static boolean getBool() {
			System.out.println("in get");
			return true;
		}
		
	}
		
		
		
		
		
