package com.qa.exercisesdaythree;

public class Person {
	//Private - can't be accessed outside of this class
	private String name;
	private int age;
	private String title;
	
	//Constructor underneath is called when
	//we instantiate an object of the Person class!
	public Person(String name, int age, String title) {
		this.name = name;
		this.age = age;
		this.title = title;
	}
	
	public void personString() {
		// Customer 'name' is 'age' is a 'title' will be outputted
		System.out.println("Customer: " + this.name + " is " + this.age + " is a " + this.title);
	}
	
	//getters = a method that returns the value
	//of a data member
	public String getName() {
		return this.name; //name relates to the private String above at the top
	}
	
	
	
	
	
}
// Can also (above) use the '@override' method to 
// print in the runner, which would be useful to know...
// e.g. @Override
//		pub String toString(){
//		return String.format("name: %s, age: %d, ......




	//my attempt - don't look below here
//	private String name;
//	private int age;
//	private String jobtitle;
//	
//	public Person (String fname, int aage, String jjobtitle) {
//		this.name = fname;
//		this.age = aage;
//		this.jobtitle = jjobtitle;
//	}
//	
//	public static void main(String[] args) {
//		Person c = new Person("Charlie", "20", "Waiter");
//			
//	}//my attempt


