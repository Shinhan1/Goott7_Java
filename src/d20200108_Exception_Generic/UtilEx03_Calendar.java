package d20200108_Exception_Generic;

import java.util.Calendar;

// 날짜 - Calendar

public class UtilEx03_Calendar {
	public static void main(String[] args) {
		// Calendar cal = new Calendar();			추상 클래스
		Calendar cal = Calendar.getInstance();
		
		// System.out.println(cal);
		
		// getter나 상수로 호출해서 사용
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println("이번 주는 올해의 " + week + " 번째 주입니다.");
		
		// ex) Serial Number 등과 같은 정보 생성시 많이 사용
		
		
		// 년, 월, 일, 시, 분, 초 출력해보세요
		
		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);		// DAY_OF_MONTH 도 가능
		int hour = cal.get(Calendar.HOUR);		
		int minute = cal.get(Calendar.MINUTE);	
		int second = cal.get(Calendar.SECOND);	
		
		System.out.println(year + "년 " + mon + "월 " + date + "일 " 
		+ hour + "시 " + minute + "분 " + second + "초");
		
		
		
		
	}

}
