package java0416;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Employee{//사원 클래스
	// 멤버변수 name salary
	 private String name;
	 private int salary;
	
	//기본생성자.	아무 초기화도 하지않음
	//기본생성자는 다른 생성자가 있으면 자동으로 삽입되지 않음
	//그래서 필요하다면 명시적으로 선언해 줘야함
	Employee(){
		
	}
	//name salary 받아서 초기화하는 생성자
	Employee(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	//메소드 getEmployee() "이름 : name, 급여 : salary" 문자열 반환함
	public String getEmployee() {
		return "이름 : "+name+", 급여 : "+salary;
	}
}
class Manager extends Employee{ //관리자 클래스. 사원클래스를 상속받음
	//멤버변수
	private String depart;
	//생성자 name, salary, depart 받아서 초기화하는 생성자
	Manager(String name, int salary, String depart){
		//setName(name);
		//setSalary(salary);
		super(name,salary);
		this.depart = depart;
	}
	//메소드 getManager() "이름: name, 급여 : salary, 부서명: depart" 문자열 반환
	String getManager() {
		return "이름: "+getName()+", 급여 : "+getSalary()+", 부서명: "+depart;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		//Employee 객체생성 emp	"홍길동", 10000
		Employee emp = new Employee("홍길동", 10000);
		//getEmployee 메소드 호출해서 리턴받은 값을 출력
		System.out.println(emp.getEmployee());
		//Manager 객체생성 man
		Manager man = new Manager("김예환",100000,"IT");
		//getManager 메소드 호출해서 리턴받은 값을 출력
		System.out.println(man.getManager());
	}

}
