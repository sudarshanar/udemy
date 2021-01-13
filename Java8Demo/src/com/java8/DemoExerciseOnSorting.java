package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DemoExerciseOnSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> myList = Arrays.asList(new Person("Sudarshan", "Ramamurthy", 25), new Person("Sam", "Caran", 33),
				new Person("Navdeep", "Saini", 22), new Person("Raj", "Ramesh", 22), new Person("Soma", "Sundar", 66));
		Collections.sort(myList, (lName1, lName2) -> lName1.getlName().compareTo(lName2.getlName()));
//		myList.stream().forEach((p) -> System.out.println(p));
		System.out.println("LastName with R");
		performConditionally(myList, person -> person.getlName().startsWith("R"),
				person -> System.out.println("Person is " + person));
		System.out.println("FirstName with S");
		performConditionally(myList, person -> person.getfName().startsWith("S"),
				person -> System.out.println("Person is " + person));
		System.out.println("Printing All Element");
		performConditionally(myList, person -> true, person -> System.out.println("Person is " + person));
	}

	public static void performConditionally(List<Person> myList, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person demo : myList) {
			if (predicate.test(demo))
				consumer.accept(demo);
		}
	}
}

/*
 * interface Conditionally { boolean passConditionally(Person p); }
 */
