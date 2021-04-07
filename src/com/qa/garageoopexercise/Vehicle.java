package com.qa.garageoopexercise;
// Superclass
public class Vehicle {
	
	private boolean exhaust = true;
	private int wheels = 2;
	private boolean multiplegears = true;
	
	public boolean isExhaust() {
		return exhaust;
	}

	public void setExhaust(boolean exhaust) {
		this.exhaust = exhaust;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public boolean isMultiplegears() {
		return multiplegears;
	}

	public void setMultiplegears(boolean multiplegears) {
		this.multiplegears = multiplegears;
	}

	public Vehicle(boolean exhaust, int wheels, boolean multiplegears) {
		this.exhaust = true;
		this.wheels = 2;
		this.multiplegears = true;
	}
	
	

	
	
}
