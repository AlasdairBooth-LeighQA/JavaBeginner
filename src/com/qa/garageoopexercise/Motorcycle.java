package com.qa.garageoopexercise;
//Subclass of Vehicle
public class Motorcycle extends Vehicle{

	public Motorcycle(boolean exhaust, int wheels, boolean multiplegears) {
		super(exhaust, wheels, multiplegears);
		
	}

	private boolean handlebars = true;
	private String colour = "red";
	private int width = 80;
	
	public void bike() {
		System.out.println("Does the vehicle have handlebars?: " + this.handlebars + " and it's colour is: " + this.colour + " it's width is: " + this.width + " and finally, it has " + super.getWheels() + " wheels ");
	}

}
