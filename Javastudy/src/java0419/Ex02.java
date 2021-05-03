package java0419;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
class Employee{
	//멤버변수 문자열 name	정수형 salary
	private String name;
	private int salary;
	
	//name salary 받아서 초기화하는 생성자
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	//showInfo() 출력 "이름: name, 급여: salary
	void showInfo() {
		System.out.printf("이름: %d, 급여: %d\n",name, salary);
	}
}
@Getter @Setter
class Manager extends Employee{	//상속 Employee
	//멤버변수 문자열 depart
	private String depart;
	
	//name salary depart 받아서 초기화하는 생성자
	Manager(String name, int salary, String depart){
		super(name, salary);
		this.depart = depart;
	}
	//showInfo() 메소드 오버라이딩(재정의) 출력 "이름: name, 급여: salary, 부서명: depart"
	@Override
	void showInfo() {
		System.out.printf("이름: %s, 급여: %d, 부서명: %s\n",getName(), getSalary(), depart);
	}
}

public class Ex02 {

	public static void main(String[] args) {
		//Manager 객체 생성
		Manager man = new Manager("홍길동",3_500_000,"IT");
		//showInfo()메소드 호출
		man.showInfo();
		
		
	}//main
}
