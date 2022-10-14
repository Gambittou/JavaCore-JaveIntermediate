package com.example;

import java.util.Date;

public class TimezoneTest {
	
	public void testCurrentDate() {
		Date now = new Date();
		Date before = new Date(1661832030000L);
		assertThat(now).isAfter(before);
	}

}
