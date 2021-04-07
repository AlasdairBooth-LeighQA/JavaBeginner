package com.qa.inheritance;

public class InheritanceRunner {

	public static void main(String[] args) {
		
		Owl owlfriend = new Owl();
		//doThing is located in the Owl subclass
       owlfriend.doThing();
        //noise is located in the Bird superclass
        owlfriend.noise(); // will return "tweet", because Owl extends Bird!
        
        Chicken chikin = new Chicken();
        chikin.doThing();
        //cluck is located in the Chicken subclass
        chikin.cluck();	 // returns "bwark", as cluck is in Chicken subclass
        chikin.noise();  // returns "tweet", because Chicken also extends Bird!
 //       chikin.getlayegg();
	}
	
}


