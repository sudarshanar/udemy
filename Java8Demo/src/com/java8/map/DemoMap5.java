package com.java8.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoMap5 {

	public static void main(String[] args) {
		List<SBTest> myList = Arrays.asList(new SBTest(new StringBuffer("Sudarshan"), new StringBuffer("Hassan")),
				new SBTest(new StringBuffer("Sam"), new StringBuffer("Mangalore")),
				new SBTest(new StringBuffer("Navdeep"), new StringBuffer("Belgaum")),
				new SBTest(new StringBuffer("Sandeep"), new StringBuffer("Hassan")),
				new SBTest(new StringBuffer("Soma"), new StringBuffer("Hassan")));

		
		  myList.stream().filter(demo ->
		 demo.getAddress().toString().equals("Hassan")).map(demo -> demo.toString())
		  .forEach(emp -> System.out.println(emp));
		 
		/*
		 * ArrayList<ArrayList> myList1 = new ArrayList<>(); ArrayList<String> a1 = new
		 * ArrayList<>();a1.add("Sam"); ArrayList<String> a2 = new
		 * ArrayList<>();a2.add("Ram"); ArrayList<String> a3 = new
		 * ArrayList<>();a3.add("Kam"); ArrayList<String> a4 = new
		 * ArrayList<>();a4.add("Jam");
		 * myList1.add(a2);myList1.add(a1);myList1.add(a3);myList1.add(a4);
		 * System.out.println(myList1);
		 */
	}

}
