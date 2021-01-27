package com.java8.DateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class Java8DemoZoneIds {


	public static void main(String[] args) {
		ZoneId SFO = ZoneId.of("America/Los_Angeles");
		ZoneId BOS = ZoneId.of("America/New_York");
		ZoneId BLR = ZoneId.of("Asia/Calcutta");
		
		LocalDateTime departure = LocalDateTime.of(2020, 05,13,22,11);
		ZonedDateTime departSFO=ZonedDateTime.of(departure, SFO);
		System.out.println(departSFO);
}

}
