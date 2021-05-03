package java0422;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {
		//Set에 제내릭 타입 적용하기
		Set<Integer> set = new LinkedHashSet<>();
		
		//set.add("문자열");
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);	//set은 중복값 저장불가
		
		System.out.println(set);
		
		//Set에서 값을 한개씩 꺼내는 방법. 첫번째: Iterator	타입으로 참조 가져와서 사용하기
		Iterator<Integer> iter = set.iterator();	//반복자 객체 가져오기
	
		while(iter.hasNext()) {
			int num = iter.next();
			System.out.println("num = "+num);
		}
		System.out.println("===============================");
		for(int num :set) {
			System.out.println("num = "+ num);
		}
	}//main

}
