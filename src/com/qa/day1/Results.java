package com.qa.day1;

public class Results {

	static int Physics;
	static int Chemistry;
	static int Biology;
	
	static int total;
	static int percentage;
	
	public static void displayResults() {
		total = Physics + Chemistry + Biology;
		
		String result = "PHYSICS:" + Physics + "\n" // \n is newline character
				+"CHEMISTRY:" + Chemistry + "\n"
				+"BIOLOGY:" + Biology + "\n"
				+ "TOTAL:" + total + "/450";
		
		System.out.println(result);
	}
	
	public static void displayTotalAsPercentage() {
		total = Physics + Chemistry + Biology;
		
		System.out.println("PERCENTAGE:" + (total * 100 / 450) + "%");
	}
}
