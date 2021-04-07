package com.qa.inheritance;
// Subclass of Bird
public class Chicken extends Bird {

    private int eggCount = 0;

    public void doThing(){
        System.out.println("Flight? " + super.getFly());
    }

    public void cluck() {
        System.out.println("bwark");
    }
    
 //   public void layegg() {
   // 	System.out.println("Lays eggs");
   // }
}
