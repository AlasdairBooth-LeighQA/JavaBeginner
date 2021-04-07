package com.qa.garageoopexercise;
//Subclass of Vehicle
public class Dirtbike extends Vehicle{

	public Dirtbike(boolean exhaust, int wheels, boolean multiplegears) {
		super(exhaust, wheels, multiplegears);
		
	}

	private boolean helmettowear = true;
	private String easytoride = "no";
	
	public void dirtbike() {
		System.out.println("A dirtbike has " + super.getWheels() + " wheels. " + " Is it easy to ride?: " + this.easytoride + ", so do you need to wear a helmet?: " + this.helmettowear);
	}
	
}
