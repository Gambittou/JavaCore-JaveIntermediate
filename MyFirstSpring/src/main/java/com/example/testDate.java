package com.example;

import java.sql.Date;

public class testDate {
	@SuppressWarnings("deprecation")
	public void testCustomDate() {
		System.out.println("Create date for 14 October 2022 11:30");
		int year = 2022 - 1900;
		int month = 10 - 1;
		Date customDate = new Date(year, month, 14, 11, 30);
		assertThat(customDate.getYear()).isEqualT(year);
		assertThat(customDate.getMonth()).isEqualT(month);
		assertThat(customDate.getDate()).isEqualT(14);
	}

}
