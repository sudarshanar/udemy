package com.java8.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Java8DemoFormating {

	public static void main(String[] args) {
		String dateFormat = "MMMM D, YYYY";
		LocalDate date = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
		date = LocalDate.parse("JULY 05, 1989",formatter);
	}

}
