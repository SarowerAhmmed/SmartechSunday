package com.java.interview.code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndTimeCheck {

	public static void main(String args[]) {
		// Instantiate a Date object
		Date date = new Date();

		// display time and date using toString()
		System.out.println(date.toString());

		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println("Current Date: " + ft.format(date));

		// display time and date
		String str = String.format("Current Date/Time : %tc", date);

		System.out.printf(str);
		System.out.println("");
		// display time and date
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "=======", date);
		System.out.println("");
		// display formatted date
		System.out.printf("%s %tB %<te, %<tY", "=======", date);

		SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");
		String input = args.length == 0 ? "1818-11-11" : args[0];

		System.out.println(input + " Parses as ");

		Date t;
		try {
			t = ft1.parse(input);
			System.out.println(t);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft1);
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		Date d = cal.getTime();
		System.out.println(d);

	}
}
