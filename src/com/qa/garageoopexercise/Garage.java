package com.qa.garageoopexercise;
//For storage

import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle f) {
		this.vehicle.add(f);
	}
	
	public void anotherVehicle(Vehicle f) {
		this.vehicle.remove(f);
	}
	
	public void billGarage(Vehicle v) {
		System.out.println("Vehicle ");
	}
}
