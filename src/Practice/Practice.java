package Practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		System.out.println(multiChar("The"));
	}
// Questions question 2
	public static String multiChar(String input) {
		String output = "";
		int len = input.length();
// To practice this for loop, change the len to a value and change around the "The" string etc
		for (int j = 0; j < len; j++) {     		 // Outer loop
			for (int i = 0; i < 3; i++) {    		 // Inner loop
				output = output + input.charAt(j);   // equivalent to output += input.charAt(j);
			}
		}
				
		return output;
	}

// Questions question 3
	
//	public static void StringReverse() {
//		String reverseString = "";
//		System.out.println("Enter string to reversed");
//		
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
//		
//		char[] inputArray = input.toCharArray();
//		
//		for(int i=inputArray.length-1;i>=0;i--)
//		{
//			reverseString = reverseString+inputArray[i];
//		}
//		System.out.println("Original String: "+input);
//		System.out.println("Reversed String: "+reverseString);
//		
//		}
//	}
		
		//	public class StringReverse{
		//		String reverseString = "";
	
//	public static void backwardsString() {
//		
//		System.out.println("Bread");
//		
//		Scanner read = new Scanner(System.in);
//		String str = read.nextLine();
//		String reverse= "";
//		
//		for(int i = str.length() - 1; i >= 0; i--)
//		{
//			reverse = reverse + str.charAt(i);
//		}
//		System.out.println("Reversed string is:");
//		System.out.println(reverse);
//	}
	
}	
	
