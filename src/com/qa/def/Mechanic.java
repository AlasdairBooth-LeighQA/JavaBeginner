package com.qa.def;

public class Mechanic {
// Instantiated the method
	Car c = new Car();
	
//Can now directly access c.exhausts from the other class	
	public int readExhausts() {
		return c.exhausts;
	}
	
}
