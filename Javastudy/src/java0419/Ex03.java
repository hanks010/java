package java0419;

class Parent{
	void showParent() {
		System.out.println("showParent()");
	}
}

class Child extends Parent{	//상속 Parent
	void showChild(){
		System.out.println("showChild()");
	}
}
class Child2 extends Parent{
	void showChild2(){
		System.out.println("showChild2()");
	}
}

public class Ex03 {

	public static void main(String[] args) {
		//자료형 형변환: 서로 호환되는 자료형끼리는 형변환이 가능함
		
		//기본자료형에서 형변환: 숫자형(정수형, 실수형)끼리 형변환이 가능함
	double dNum = 3; // double형 = int형	//자동 형변환(암시적 형변환)
	System.out.println("dNum = "+dNum); //dNum = 3.0
	
	dNum = 2.7; 
	System.out.println("dNum = "+dNum);
	
	int iNum = (int)3.14;	//int형 = (int)double형;	//수동 형변환 (명시적 형변환)
	System.out.println("iNum = "+iNum);
	System.out.println("===============================");
	
	//기본자료형 <-> 참조자료형(참조형, 레퍼런스형, 객체형)
	
	//참조형(레퍼런스형) 형변환 : 서로 호환되는 객체(상속관계)끼리 형변환이 가능하다
	Child child = new Child();	//자식타입 = 자식타입
	child.showParent();
	child.showChild();
	System.out.println("===============================");
	
	//부모클래스 타입이 자식클래스타입보다 큰 타입이다
	
	Parent parent = new Child(); //부모(큰)타입 = 자식(작은)타입; // 자동 형변환 (업캐스팅)
	parent.showParent();
	//parent.showChile();	//참조변수 타입을 기준으로 호출가능한 메소드 판별
	//부모타입 참조변수로 자식 멤버를 접근 못함
	
	//컴파일러가 참조변수의 타입을 기준으로 호출가능한 메소드를 판별함 (객체기준이 아님에 주의)
	//다양한 객체를 저장하기 위해 사용, 기능을 구현하기 위함이 아님
	System.out.println("===============================");
	
	parent = new Child2();	//부모(큰)타입 = 자식(작은)타입; // 자동 형변환 (업캐스팅)
	parent.showParent();
	System.out.println("===============================");	
	Child2 child2 = (Child2)parent;	//자식(작은)타입 = (작게) 부모(큰)타입
	//다운캐스팅. 명시적 형변환. 자식타입으로 형변환함
	child2.showParent();
	child2.showChild2();
	//업캐스팅된 객체를 다시 자기타입 변수로 잡고자 할 때 다운캐스팅이 필요하다.
	System.out.println("===============================");
	
	//아래 상황은 객체 형변환을 잘못 사용하는 예
	//	: 부모 객체를 자식타입 변수로 잡고 사용할 수 없음
	Child child3 = (Child) new Parent(); // 자식(작은)타입 = 부모(큰)타입;
	//child3 = null;
	child3.showParent();	//실행 중에 부모 객체를 자식타입 참조변수로 접근 시 에러 발생함
	//child3.showChild(); //
	
	
	
	
		
	}//main
}
