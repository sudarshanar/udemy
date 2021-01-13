package com.java8.noterminalmethods;

import java.util.Arrays;
import java.util.List;

public class DemoParallelStream {

	public static void main(String[] args) {
		List<Student> student = Arrays.asList(new Student("Sam", 85), new Student("Ram", 95), new Student("Tom", 66),
				new Student("Mam", 45),new Student("Raj", 99));
		//Using normal stream
		student.stream().filter(stu->stu.getScore()>65).limit(3).forEach(System.out::println);
		//Using Parallel stream
		student.parallelStream().filter(stu->stu.getScore()>65).forEach(System.out::println);
	}

}
