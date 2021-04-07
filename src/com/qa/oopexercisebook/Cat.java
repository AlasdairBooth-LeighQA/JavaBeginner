package com.qa.oopexercisebook;
//Subclass of Animal
public class Cat extends Animal{
	
	private int taillength = 10;
	
	public void other() {
		System.out.println("The cat's tail length is: " + this.taillength + ", it's height is: " + super.getHeight() + " and does it run?: " + super.isRun());
	}
}
