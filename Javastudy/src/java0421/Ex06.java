package java0421;

import java.util.Calendar;

public class Ex06 {

	public static void main(String[] args) {
		//Callendar 클래스 : 현재 날짜와 시간정보를 가져올 수 있음
		// new 연산자가 아닌 getInstance() 스태틱 메소드 호출로 객체참조를 가져옴
		
		Calendar cal = Calendar.getInstance(); //현재날짜와 시간정보를 가짐
		
		System.out.println(cal.get(Calendar.YEAR));		//현재년도 2021
		System.out.println(cal.get(Calendar.MONTH+1)+"월");	// 4
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		switch(day) {
		case 1: System.out.println("일요일"); break;
		case 2: System.out.println("월요일"); break;
		case 3: System.out.println("화요일"); break;
		case 4: System.out.println("수요일"); break;
		case 5: System.out.println("목요일"); break;
		case 6: System.out.println("금요일"); break;
		case 7: System.out.println("토요일"); break;
		}
	}

}
