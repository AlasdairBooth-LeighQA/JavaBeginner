package com.qa.oopexercisebook;
//Subclass of Animal
public class Bird extends Animal{

	private int wingspan = 25;
	private boolean run = false;
	
	public void other() {
		System.out.println("The bird's wingspan length is: " + this.wingspan + ", and does it fly?: " + super.isFlyy() + ", and does it run?: " + this.run);
	}
	
}
