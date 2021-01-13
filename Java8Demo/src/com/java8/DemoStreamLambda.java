package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoStreamLambda {

	public static void main(String[] args) {
		List<Person> myList = Arrays.asList(new Person("Sudarshan", "Ramamurthy", 25), new Person("Sam", "Caran", 33),
				new Person("Navdeep", "Saini", 22), new Person("Raj", "Ramesh", 22), new Person("Soma", "Sundar", 66));
//		Collections.sort(myList, (lName1, lName2) -> lName1.getlName().compareTo(lName2.getlName()));
		myList
		.stream()
		.filter(p -> p.getlName().startsWith("R"))
		.forEach(p -> System.out.println(p.getfName() + " " + p.getlName()));

		
		long count =myList
				.stream()
				.filter(person-> person.getfName().startsWith("S"))
				.count();
		display(count,c->System.out.println("Total Elements are: "+count));
	}
	public static void display(long count,Consumer<Long> con) {
		con.accept(count);
	}

}
