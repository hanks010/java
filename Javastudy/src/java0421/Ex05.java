package java0421;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		//Random 클래스 : 임의의 값을 생성시켜주는 클래스
		
		Random random = new Random();
		
		System.out.println(random.nextBoolean());
		
		System.out.println(random.nextInt(100)); //0 이상 100 미만의 임의의 정수 리턴 0 ~ 99
		
		System.out.println(random.nextInt());	 //int 범위의 임의의 정수
		
		System.out.println(random.nextLong());   //long 범위의 임의의 정수
		
		System.out.println(random.nextFloat());	 //float 범위의 0 이상 1 미만의 임의의 실수
		
		System.out.println(random.nextLong());	 //double 범위의 0 이상 1 미만의 임의의 실수
		
		System.out.println("===============================");
		
		//날짜와 시간
		Date date = new Date(); // 현재시점의 날짜 시간정보를 가진 객체 생성
		
		System.out.println(date);
		//SimpleDateFormat 클래스는 자체적으로 날짜 시간정보를 가지지는 않는다
		//단지 날짜시간정보를 표현할 형식정보만 가질 뿐이댜
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH시 mm분 ss초 ");
		String strDate = sdf.format(date);	//실제 날짜시간 정보를 가진 Date객체를 sdf 객체에 전달해서 원하는 문자열을 가져옴
		System.out.println(strDate);
		
		System.out.println("===============================");
		
		//Math 클래스 : 수학관련 메소드를 가진 클래스
		//			  static 멤버변수와 메소드로 구성됨
		System.out.println(Math.PI);
		System.out.println(Math.random());		
		System.out.println(Math.max(10,20));	//20
		System.out.println(Math.min(10,20));	//10
		System.out.println(Math.pow(2,3));		// 8.0
		System.out.println(Math.round(3.57));	//반올림해서 4
		System.out.println(Math.ceil(3.12));    //올림해서 4.0
		System.out.println(Math.floor(3.98));	//내림해서 3.0
		System.out.println(Math.abs(-3.6));	  	//절대값 3.6
	}//main

}
