package com.java8.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java8DemoDateTime1 {

	public static void main(String[] args) {
		LocalDateTime now, meeting;
		now = LocalDateTime.now();
		meeting = LocalDateTime.of(LocalDate.of(2021, 10, 25), LocalTime.of(10, 25));
		System.out.println(now);
		System.out.println(meeting);
	}

}
