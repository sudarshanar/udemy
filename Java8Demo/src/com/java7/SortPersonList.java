package com.java7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.Person;


public class SortPersonList {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List<Person> myList = Arrays.asList(new Person("Sudarshan", "Ramamurthy", 25), new Person("Sam", "Caran", 33),
				new Person("Navdeep", "Saini", 22), new Person("Raj", "Ramesh", 22), new Person("Soma", "Sundar", 66));
		Collections.sort(myList, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Person first = (Person) o1;
				Person second = (Person) o2;
				// Descending Order
				return second.getlName().compareTo(first.getlName());
			}

		});
		// Display All elements
		printAll(myList);
		// Display All elements whose last name starts with R
		System.out.println("last name starts with R");
		printConditionally(myList, new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getlName().startsWith("R");
			}
			
		});
		System.out.println("First name starts with S");
		printConditionally(myList, new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getfName().startsWith("S");
			}
			
		});
		
	}
public static void printAll(List<Person> myList) {
	for (Person demo : myList) {
		System.out.println(demo);
	}
}
public static void printConditionally(List<Person> myList,Condition c) {
	for (Person demo : myList) {
		if(c.test(demo))
		System.out.println(demo);
	}
}

}
interface Condition{
	public abstract boolean test(Person p);
}
interface Conditionally {
	boolean passConditionally(Person p);
}
