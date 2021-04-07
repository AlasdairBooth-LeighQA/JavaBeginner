package com.qa.oopexercisebook;
//Subclass of Animal
public class Dog extends Animal{
	
	private int taillengthh = 12;
	private int Height = 35;
	
	public void other() {
		System.out.println("The dog's tail length is: " + this.taillengthh + ", it's height is: " + this.Height + " and does it run?: " + super.isRun());
	}
	
}
