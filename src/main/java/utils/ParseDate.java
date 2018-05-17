package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDate {
	public static String getString(Date date) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
}
