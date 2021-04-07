package com.qa.exercisesendofdaythree;

public class FootballClass {
	private String Team;
	private String Colour;
	private String Stadium;
	private int Founded;
	
	public FootballClass(String Team, String Colour, String Stadium, int Founded) {
		this.Team = Team;
		this.Colour = Colour;
		this.Stadium = Stadium;
		this.Founded = Founded;
	}
	
	public void footballclassString() {
		System.out.println("Team: " + this.Team + " play in a " + this.Colour + " kit, and play at " + this.Stadium + " and was founded in " + this.Founded);
	}
}
