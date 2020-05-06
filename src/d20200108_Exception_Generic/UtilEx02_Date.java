package d20200108_Exception_Generic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilEx02_Date {
	public static void main(String[] args) {
		
//		Date date = new Date();
//		System.out.println(date);
		
		Date d = new Date();
		System.out.println(d);			// KST -> Korea Standard Time
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");			// 대소문자 유의
		
		String time = sdf.format(d);
		System.out.println(time);
		
		
		
		
		
	}
	
}
