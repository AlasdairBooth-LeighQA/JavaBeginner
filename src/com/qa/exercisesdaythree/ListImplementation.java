package com.qa.exercisesdaythree;

import java.util.ArrayList;
//Below is public so I can create an instance of this elsewhere
public class ListImplementation {
	//Under - specify the data type u want to store in <>, 
	//then 'people' is a referencevariable
	private ArrayList<Person> people = new ArrayList<Person>();
	
	// Under is a constructor taking in a parameter 'Person p'
	public void addHuman(Person p) {
		this.people.add(p);
		
	}
	
	// search a person by their name (searchName)
	public void search(String searchName) {
	//	for(int i=0; i<people.length; i++) // Also works
		for (Person p : people) {
			if(p.getName().equals(searchName)) {
				System.out.println("found - " + p);
			}else {
				System.out.println("Sorry, couldn't find you!");
			}
		}
	}
	
}
	
	


	//my attempt - don't look below here
	//	public class List<E>{
//		private Person person = new Person("Jim", 40, "Waiter");
//		private Person person2 = new Person("Val", 30, "Waitress");
//		private Person person3 = new Person("Tony", 20, "Apprentice");
//	} //my attempt

