package com.qa.exercisesendofdaythree;

public class RunnerEODPractice {

	public static void main(String[] args) {
		
		FootballClass example1 = new FootballClass("Arsenal", "Red", "Emirates Stadium", 1886);
		FootballClass example2 = new FootballClass("AstonVilla", "Claret", "VillaPark", 1874);
		FootballClass example3 = new FootballClass("WiganAthletic", "Blue&White", "DW", 1932);
		
		example1.footballclassString();
		example2.footballclassString();
		example3.footballclassString();
	}
	
	@Override
	public String toString() {
		return String.format("Team: %s, Colour: %s, Stadium %s, Founded %d");
		
//		System.out.println();
	}
	
	

}
