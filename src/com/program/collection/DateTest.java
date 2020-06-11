package com.program.collection;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {

		Date date = Calendar.getInstance().getTime();
		System.out.println(date);
		System.out.println(LocalDateTime.now());
		System.out.println("================");
		
		String dateStr = "Jun 2, 2020 8:57:36 PM";
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
	//	Date date1 = (Date) formatter.parse(dateStr);
		//System.out.println(date1);

		//Calendar cal = Calendar.getInstance();
		//cal.setTime(date1);
		//String formatedDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/"
			//	+ cal.get(Calendar.YEAR);
		//System.out.println("formatedDate : " + formatedDate);

	}
}
