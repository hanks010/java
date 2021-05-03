package java0407;


public class Ex02 {

	public static void main(String[] args) {
		// 변수: 메모리 상의 이름 있는 기억공간
		//보조기억장치 - 비휘발성,저렴, 속도가 느리다
		//ram - 휘발성, 속도 빠름
		
		//숫자 저장공간을 하나 만들고 이름을 a로 지정
		// ->a라는 숫자형 변수 선언하기
		int a;
		a = 5;	
		System.out.println("a변수의 값은 "+a);
		a = 10;	
		System.out.println("a변수의 값은 "+a);
		a = 20;	
		System.out.println("a변수의 값은 "+a);
		a += 5;	
		System.out.println("a변수의 값은 "+a);
	
		byte b;
		b =127;
		//b = 128;
		//리터럴 상수: 값 그자체를 의미함
		//리터럴 상수도 자료형을 가진다
		//정수 리터럴은 int형, 실수 리터럴은 double형
		long c;
		c =3_000_000_000L;
		
		double d = 3.14;	//double은 8바이트
		System.out.println("d = "+d);

		float e = 3.14f;	//double은 4바이트
		System.out.println("d = "+d);	
		//문자형
		char ch;
		ch = 'A';
		ch = '한';
		System.out.println("ch = "+ch);
		
		boolean isGood; //논리형, 진위형(참, 거짓);
		isGood = true; 
		System.out.println("isGood = "+isGood);
		double pi = 3.14;
		int r = 5;
		//원의 면적 = 반지름 * 반지름 * 원주율
		double area; // 원의 면적
		area = r*r*pi;
		System.out.println("반지름이 "+r+"인 \n \t \\원의 면적은\\ "+area+"이다");
		
		//문자열형(기본자료형이 아닌 객체형. 기본자료형이 아닌 객체형
		String hello = "안녕하세요";
		String name = "김예환";
		String song = "동해물과 ";
		
		//int song = 50; 중복된 이름의 변수는 사용불가
		
		System.out.println(name + "님, " + hello);
		System.out.println("애국가: "+song);
		System.out.println("\"홍길동\"");
		
		
		
	}//main

/*
 기본자료형
 	-정수형(byte, short, int,long)
 	-실수형(float,double)
 	-문자형(char)
 	-논리형(boolean)
 	-문자열형(String) 기본자료형이 아닌 객체형이지만 기본자료형 취급을 받기도 함

 */
}
