package com.qa.inheritance;
//This is the Superclass
public class Bird {
	
	private boolean fly = true;
	private boolean layEgg = true;
	
	
    public void noise(){
        System.out.println("tweet");
    }

    public void egg() {
    	System.out.println("Lays eggs");
    }
    // getters and setters for Fly
    public boolean getFly(){
        return fly;
    }

    public void setFly(boolean newValueOfFly){
        this.fly = newValueOfFly;
    }
    
//    public boolean getlayEgg() {
//    	return layEgg;
//    }
//    
//    public void setlayEgg(boolean newValueOfEgg) {
//    	this.layEgg = newValueOfEgg;
//    }
}
