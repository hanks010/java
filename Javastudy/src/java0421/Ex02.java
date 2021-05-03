package java0421;

import java.util.StringTokenizer;

public class Ex02 {

	public static void main(String[] args) {
		// 문자열을 처리할 때 버퍼(완충공간)을 사용하는 클래스
		// : StringBuilder 클래스(스레드에 안전하지 않음). StringBuffer 클래스(스레드에 안전)
		// String이 불변객체인 반면, StringBuilder는 일반적인 가변객체이다.

		StringBuilder sb = new StringBuilder(); // 버퍼를 내부에 가지고 있음
		sb.append("Java"); // 뒤에 추가
		System.out.println(sb.toString()); // Java
		
		sb.append(" Programming");
		System.out.println(sb); // Java Programming

		sb.replace(0, 4, "JSP");
		System.out.println(sb); // JSP Programming

		sb.insert(3, ",");
		System.out.println(sb);
		System.out.println("===============================");
		
		//StringTokeneizer : 문자열을 토큰단위로 분리해서 사용하는 용도
		//					 String 클래스의 split() 메소드와 동일한 기능
		
		String fruits = "사과#배#복숭아#감#포도";
		String[] arrFruits = fruits.split("#");
		for(String fruit:arrFruits) {
			System.out.println(fruit);
		}
		
		System.out.println("==========================");
		
		StringTokenizer st = new StringTokenizer(fruits,"#");
		System.out.println(st.countTokens());	//토큰의 갯수 5
		while(st.hasMoreTokens()) {	//다음 토큰이 있으면 true 리턴
			System.out.println(st.nextToken());	//다음 토큰을 꺼내기(리턴)
		}
		System.out.println(st.countTokens());//토큰의 갯수 0
		//토큰을 다 빼고 나면 다시 원상태로 되돌아갈 수 없으므로
		//또 사용하려면 다시 새로운 객체를 만들어야 함
		
		String query = "namd=홍길동&address=부산&age=27";
		StringTokenizer st2 = new StringTokenizer(query,"&="); // &, = 모두 구분문자가 
		System.out.println();//6
		while(st2.hasMoreTokens()) {	//다음 토큰이 있으면 true 리턴
			System.out.println(st2.nextToken());	//다음 토큰을 꺼내기(리턴)
		}
	
	}// main

}
