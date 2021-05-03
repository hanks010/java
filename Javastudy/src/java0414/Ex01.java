package java0414;

// 나무 클래스 정의
class Tree{
	// 멤버 변수(속성)
	String name;
	int age;
	int numberOfLeaf; //나뭇잎 개수 (1 ~ 100)
	//메소드(기능)
	void wave(){
		if(numberOfLeaf >= 50)
		System.out.println(age +"살 "+ name+"이(가) 바람에 세게 흔들린다");
		else //numberOfLeaf < 50
			System.out.println(age +"살 "+ name+"이(가) 바람에 살살 흔들린다");
	}
}



public class Ex01 {

	public static void main(String[] args) {
		//변수(한 개의 기억장소)
		// -> 배열(같은 자료형의 기억장소 여러개)
		// -> 구조체(다른 자료형의 기억장소 여러개)
		// -> 클래스( 구조체+ 함수)
		
		//클래스 : 객체 정의(멤버 변수 + 메소드) 
		//객체(인스턴스 instance) : 클래스로부터 생성한 객체.사용대상
		
		//클래스		객체
		//제품설계도	제품
		//붕어빵틀		붕어빵
		
		// 클래스 사용 -> 객체 생성 (기억장소 할당, 기본값으로 초기화 됨)
		//객체 자체가 하나의 값으로 처리됨
		int a; // 변수 선언
		a = 5; // 변수에 값 저장
		
		int arr[]; //배열변수(참조변수)선언
		arr = new int[5]; //크기가 5인 정수형 배열객체 생성하고 객체의 주소값을 참조변수에 저장
		
		//String str;
		Tree tree;			//Tree 형의 참조변수 tree 선언
		tree = new Tree();  //Tree 클래스 타입의 객체를 생성하고 객체의 주소값을 참조변수에 저장
		//new :객체 생성 연산자. 객체를 기억장소에 할당
		//tree: 참조변수. 레퍼런스 변수
		//객체를 접근할 때에는 (.)연산자를 사용. 참조연산자라고 함
		
		System.out.println(tree.age);
		System.out.println(tree.name);
		System.err.println();
		tree.name = "소나무";
		tree.age = 100;
		tree.numberOfLeaf = 80;
		System.out.println(tree.age);
		System.out.println(tree.name);
		tree.wave();
		System.out.println("==========================");
		Tree tree2 = new Tree(); 
		tree2.name = "대나무";
		tree2.age = 20;
		tree2.numberOfLeaf = 30;
		System.out.println(tree2.name);
		System.out.println(tree2.age);
		tree2.wave();
	}

}
