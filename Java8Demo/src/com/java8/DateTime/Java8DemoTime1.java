package com.java8.DateTime;

import java.time.LocalTime;
public class Java8DemoTime1 {


	public static void main(String[] args) {
		LocalTime  now, nowPlus , lunch,bedTime;
		now = LocalTime.now();
		nowPlus = LocalTime.now().plusHours(2).plusMinutes(20);
		lunch =  LocalTime.of(12, 30);
		bedTime = LocalTime.of(21, 00);
		System.out.println(now);
		System.out.println(nowPlus);
		System.out.println(lunch);
		System.out.println(bedTime);
	}

}
