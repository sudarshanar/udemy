package com.java8.again;

import java.util.Arrays;
import java.util.List;

public class Java8Filter4 {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("Sam","Ram","Guru",null,"Nagaraj","Nandi","Mahesh","Mallesh",null);
		myList.stream().filter(str->str!=null).forEach(System.out::println);
		
	}

}
