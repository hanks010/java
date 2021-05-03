package java0422;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		// List 인터페이스를 구현할 클래스
		//   : -ArrayList : 가변크기 배열을 구현한 클래스. 스레드 동기화를 지원안해서 가볍지만 스레드에 안전하지 않음
		//	 : -Vector	  : ArrayList와 기능면에서 동일함. 스레드 동기활르 지원해서 스레드에 안전함
	
		List list= new ArrayList();
		list.add(1);//마지막에 추가
		list.add(3.14);
		list.add('삼');
		list.add(true);
		list.add("다섯");
		// 요소의 갯수 리턴 size()
		System.out.println(list.size());
		System.out.println(list);
		System.out.println("========================");
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("========================");
		list.add(1,"둘"); //중간에 요소 삽입하기
		
		System.out.println(list);
		list.remove(2);//특정 인덱스 위치 요소 삭제하기
		System.out.println(list);
		
	}//main

}
