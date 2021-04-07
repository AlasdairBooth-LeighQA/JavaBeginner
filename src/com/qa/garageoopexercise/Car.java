package com.qa.garageoopexercise;
//Subclass of Vehicle
public class Car extends Vehicle{

	public Car(boolean exhaust, int wheels, boolean multiplegears) {
		super(exhaust, wheels, multiplegears);
		
	}
	
	private int wheels = 4;
	private String windows = "has six windows";
	
	public void car() {
		System.out.println("Does the vehicle have an exhaust?: " + super.isExhaust() + ", it has " + this.wheels + " wheels, it " + this.windows + " and also has multiple gears?: " + super.isMultiplegears());
	}

}
