package com.qa.garageoopexercise;

public class GarageRunner {

	public static void main(String[] args) {
	

		Motorcycle motorcycle = new Motorcycle(true, 2, true);
		motorcycle.bike();
		System.out.println("--------------------------------");
		
		Car car = new Car(true, 4, true);
		car.car();
		System.out.println("--------------------------------");
		
		Dirtbike dirtbike = new Dirtbike(true, 2, true);
		dirtbike.dirtbike();
		System.out.println("--------------------------------");
	}

}
