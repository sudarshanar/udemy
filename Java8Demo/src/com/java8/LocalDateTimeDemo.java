package com.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// Current Date
		LocalDate date = LocalDate.now();
		System.out.println(date);

		// perticular date
		LocalDate date1 = LocalDate.of(1989, Month.MAY, 22);
		System.out.println(date1);

		// current time
		LocalTime time = LocalTime.now();
		System.out.println(time);

		// Perticular time
		LocalTime time1 = LocalTime.of(12, 30, 54);
		System.out.println(time1);
		System.out.println();

		// Formating Date
		DateTimeFormatter oldPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("MMMM DD,YYYY");
		LocalDate datetime = LocalDate.parse(LocalDate.now().toString(), oldPattern);
		System.out.println(datetime.format(newPattern));

		// getting zoneids
		for (String s : ZoneId.getAvailableZoneIds()) {

			// current time//adding zoneids
			LocalTime zoneTime = LocalTime.now(ZoneId.of(s));
			System.out.println(s + " : " + zoneTime.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
		}
	}

}
