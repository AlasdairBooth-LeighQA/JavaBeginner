package com.qa.day1;

//* Given a string, return the boolean True if it ends in "java" and False if
/* does not end in "java". Ignore Case.
 */

public class QuestionSix {
	
	public boolean endsJava(String input) {
			String str = "ThisEndsInJava";
			String str1 = "Thisdoesn't";
			
			if (str.endsWith("Java")) {
				System.out.println("True");
//			}
//			else {
//				System.out.println("False");
			}
	
			if (str1.endsWith("Java")) {
				System.out.println("True");
			}
//			else {
//				System.out.println("False");
//			}
			return true;
	}
	
//	//	new String("Java").equals("Java");
//		new String("Javanot").equals("Javanot");
		
	
//		String str = new String("This ends in Java");
//		String str1 = new String("This doesn't");
//		
//		boolean var = str.endsWith("Java");
//		boolean var1 = str.endsWith("doesn't");
//		boolean var2 = str1.endsWith("Java");
//		boolean var3 = str1.endsWith("doesn't");
//		
//		System.out.println("str ends with Java: " + var);
//		System.out.println("str ends with doesn't: " + var1);
//		System.out.println("str1 ends with Java: " + var2);
//		System.out.println("str1 ends with doesn't: " + var3);
		
    	
	}
	


