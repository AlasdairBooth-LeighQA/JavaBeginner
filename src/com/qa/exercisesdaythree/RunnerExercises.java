package com.qa.exercisesdaythree;

import java.util.ArrayList;

public class RunnerExercises {

	public static void main(String[] args) {
		
		Person example1 = new Person("Manfred", 25, "Wasteman");
		Person example2 = new Person("Jim", 30, "Footballer");
		Person example3 = new Person("AL", 22, "Waiter");
		
		example2.personString();
		
		
		// specify the datatype u want to store (in<>)
		//this e.g. below is creating the ListImp in the runner
		//, for this exercise we were supposed to add
		//a different class for the ListImp, therefore
		//under this example is the correct one, not this 1.
//		ArrayList<Person> people = new ArrayList<Person>();
//		people.add(example1);
//		people.add(example2);
//		people.add(example3);
		
		
		//This links to the ListImplementation.java Class
		ListImplementation Implementation = new ListImplementation();
		Implementation.addHuman(example1);
		Implementation.addHuman(example2);
		Implementation.addHuman(example3);
		
		//Gone into the for loop and found the bloke called
		//Jim
		Implementation.search("Jim");
	}
	
		
	//my attempt don't look below here
//		Person c = new Person("Charlie", "20", "Waiter");
//				c.Person();
//	}

//	Person person = new Person("Jim", 40, "Waiter");
//	Person person2 = new Person("Val", 30, "Waitress");
//	Person person3 = new Person("Tony", 20, "Apprentice");
//		
//	}
	
	
//	RunnerExercises example;{
//	example = new RunnerExercises();
//	}
//	RunnerExercises example2;{
//	example2 = new RunnerExercises();
//	}
	//my attempt
	
	

	
}

