package java0415;
//객체지향 프로그래밍에서 객체 간의 관계 2가지
// 1) 포함 관계(A has a a) : A는 B를 가지고 있다. 
//		자동차는 엔진을 가지고 있다
// 2) 상속 관계(A is a B	 : A는 B이다.
//	   중학생은 학생이다.(o) <-> 학생은 중학생이다 (x) 
//	   강아지는 동물이다.(o)	<-> 동물은 강아지이다 (x)
//Child클래스의 부모클래스
//부모클래스 = 수퍼클s래스 = 상위클래스
class Parent{
	Parent(){
		System.out.println("Parent 생성자");
	}
	void showParent() {
		System.out.println("Parent 클래스의 showParent() 메소드");
	}
}
//자식클래스 extends 부모클래스명
// 자식클래스 = 서브클래스 = 하위클래스
class Child extends Parent{
	Child(){
		System.out.println("Child 생성자");
	}
	void showChild() {
		System.out.println("Chile 클래스의 showChile() 메소드");
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Child child = new Child();
		child.showParent();
		child.showChild();
	}

}
