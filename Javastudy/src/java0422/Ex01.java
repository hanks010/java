package java0422;

import java.util.Collection;
import java.util.HashSet;

public class Ex01 {

	public static void main(String[] args) {
		// 컬렉션 프레임워크(Collection FrameWork)
		// 자료구조 클래스:객체들만 저장하고 관리할 수 있음.	기본자료형은 관리가 불가능함
		// Set(집합)	: 순서 없는 여러형 저장 공간.	저장순서 없음. ->  동일값 중복저장 불가능함
		// List(목록): 순서 있는 여러형 저장 공간.	저장순서 있음. -> 동일값 중복저장 가능함. 일종의 가변크기 배열구조
		// Map(키, 값 쌍 관리)
		
		//Set에는 HashSet, TreeSet, LinkedHashSet 클래스가 대표적이다
		HashSet set = new HashSet();	//업캐스팅
		
		set.add("하나");
		set.add(1);	//Integer.valueOf(1) //오토박싱으로 Integer객체로 변환되어 추가됨	
		set.add(2.5);
		set.add('삼');
		set.add(2.5);	//중복값 저장 불가능
		System.out.println(set);
		
		System.out.println(set.contains(2.2));
		
		set.remove(2.5);
		System.out.println(set);
		set.clear();
		System.out.println(set); //[]
		System.out.println(set.isEmpty());	//true
		
		System.out.println(set.size());	//요소의 갯수
		
		// 배열과 컬렉션 차이점
		// -배열 : 고정크기 이상의 값(객체)를 관리할 수 없음
		//		  배열의 중간 요소 값이 삭제되면 프로그램에서 자리를 옮겨줘야 함
		// -컬렉션:가변크기로써 값(객체)의 개수를 염려할 필요 없음
		//		 컬렉션 내의 한개의 값(객체)이 삭제되면 컬렉션이 자동으로 자리를 옮겨줌
		
		
	}//main

}
