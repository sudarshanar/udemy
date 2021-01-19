package com.java8.again;

import java.util.Arrays;
import java.util.List;

import com.java8.Person;

public class Java8FlatMap3 {

	public static void main(String[] args) {
				
		List<Person> myList1 = Arrays.asList(new Person("Sudarshan", "Ramamurthy", 29), new Person("Sam", "Caran", 33));
		List<Person> myList2 = Arrays.asList(new Person("Navdeep", "Saini", 22), new Person("Raj", "Ramesh", 24));
		List<Person> myList3 = Arrays.asList(new Person("Ravi", "Kumar", 31), new Person("Naveen", "Somsundar", 29));
		List<Person> myList4 = Arrays.asList(new Person("Kerry", "Pathy", 25), new Person("Money", "Haiest", 30));
		List<List<Person>> myPersonList = Arrays.asList(myList1,myList2,myList3,myList4);
		myPersonList.stream()
		.flatMap(stream->stream.stream())
		.filter(person->person.getAge()<31)
		.map(per->per.getfName()+" "+per.getlName()+" "+per.getAge())
		.forEachOrdered(System.out::println);

	}

}
