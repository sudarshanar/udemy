package com.java8.DateTime;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters.*;
public class Java8DemoDate1 {

	private static final String WEDNESDAY = null;

	public static void main(String[] args) {
		LocalDate bDate, now, nextWednesday, nowPlusMonth;
		now = LocalDate.now();
		System.out.println(now);
		bDate = LocalDate.of(1989, 07, 22);
		System.out.println("LeapYear or not : "+bDate.isLeapYear());
	}

}
