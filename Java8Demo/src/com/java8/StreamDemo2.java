package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.java8.filters.Employe;
import com.java8.noterminalmethods.Student;

public class StreamDemo2 {

	public static void main(String[] args) {

		List<Employe> myList = Arrays.asList(new Employe("Sandhya", "MD", 25), new Employe("Sam", "CEO", 33),
				new Employe("Navdeep", "TL", 22), new Employe("Raj", "SSE", 29), new Employe("Johny", "SE", 66));
		// filter method
		System.out.println("Id greater than 22 : ");
		myList.stream().filter(emp -> (emp.getId() > 22)).forEach(id -> System.out.println(id));
		System.out.println("Name starts with S : ");
		myList.stream().filter(emp -> emp.getName().startsWith("S")).forEach(name -> System.out.println(name));

		// Map method
		myList.stream().map(emp -> emp.getName().toUpperCase() + " Designation is " + emp.getRole().toLowerCase())
				.forEach(System.out::println);

		// Flat Map method
		
		List<String> name1 = Arrays.asList("Sam", "ram", "jam");
		List<String> name2 = Arrays.asList("jaanu", "Baanu", "Taanu");
		List<String> name3 = Arrays.asList("Savi", "kavi", "pavi");
		List<String> name4 = Arrays.asList("Tom", "Rom");
		List<List<String>> finalList = Arrays.asList(name1, name2, name3,name4);

		finalList.stream().filter(n -> n.size() > 2 )
				.flatMap(name -> name.stream().map(nam -> (nam).toUpperCase())).forEach(System.out::println);
		
		
		
		//NonTerminal Methods
		List<String> myList1 = Arrays.asList("Ravi", "Ramamurthy", "Sam", "Nandi", "Navdeep", "Mishra", "Raj",
				"Ramesh", "Sandeep", "Sundar");
		// Distinct
		myList1.stream().distinct().forEach(s -> System.out.println(s));
		// Count
		System.out.println(myList1.stream().distinct().count());
		// Limit
		myList1.stream().distinct().limit(5).forEach(s -> System.out.println(s));
		
		List<Integer> newList = Arrays.asList(10, 25, 62, 45, 77, 62, 14, 35, 11);
		List<String> strList = Arrays.asList("I"," Love"," You", " 3000");

		// counting how many are even
		System.out.println(newList.stream().distinct().filter(num -> (num % 2) == 0).count());
		// Minimum value
		System.out.println("Min Value " + newList.stream().min((val1, val2) -> val1.compareTo(val2)).get());
		// Maximum value
		System.out.println("Max Value " + newList.stream().max((val1, val2) -> val1.compareTo(val2)).get());
		//Reduce method
		System.out.println(strList.stream().reduce((val, combinedVal)->val+combinedVal).get());
		//toArray method
		System.out.println(strList.stream().toArray());
		
		//Sorted
		System.out.println("Ascending Sorted List");
		newList.stream().distinct().sorted().forEach(System.out::println);
		System.out.println("Descending Sorted List");
		newList.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//Using parallel stream 
		List<Student> student = Arrays.asList(new Student("Sam", 85), new Student("Ram", 95), new Student("Tom", 66),
				new Student("Mam", 45),new Student("Raj", 99));
	
		student.parallelStream().filter(stu->stu.getScore()>65).forEach(System.out::println);
		
		
	}

}
