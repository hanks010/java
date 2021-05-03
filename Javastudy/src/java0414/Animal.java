package java0414;

public class Animal {
	// 멤버변수
	// 문자열 name
	//정수형 age
	String name;
	int age;
	//기본생성자 이름은 "강아지" 나이는 3살
	Animal(){
		name = "강아지";
		age = 3;
	}
	//생성자 오버로딩(overloading) : 생성자를 중복(여러개) 선언
	//age 받아서 초기화하는 생성자
	
	//age 받아서 초기화하는 생성자
	Animal(int age){
		//this 참조변수: 생성된 객체 자기 자신을 가리키는 참조변수 역할
		this.age = age;
	}
	//name age 받아서 초기호하는 생성자 
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	//name에 대한 setter와 getter 메소드 2개 정의
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	//age에 대한 setter와 getter 메소드 2개 정의
	void setAge(int age) {
		this.age  = age;
	}
	int getAge() {
		return age;
	}
	//메소드 doRun()
	// 출력 "age 살 name 이(가) 뛴다."
	void doRun() {
		System.out.println(age+"살 "+name+"가(이) 뛴다");
	}
	void showData() {
		System.out.printf("이름: %s, 나이: %d\n",name, age);
	}
	
}
