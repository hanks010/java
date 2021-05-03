package java0415;

public class Student {
	String studentName ;	//학생 이름
	//int grade;				//학년
	int money;		//학생이 가지고 있는 돈
	
	Student(String studentName, int money){
		this.studentName = studentName;
		this.money = money;
	}
	Student(String studentName, int money, Subway subway){
		
	}
	
	//버스타기 메소드
	void takeBus(Bus bus) {	//
		bus.take(1000);
		money -=1000;
	}
	//지하철타기 메소드
	void takeSubway (Subway subway) {
		subway.take(1500);
		money -= 1500;
	}
	
	void showInfo() {
		System.out.printf("%s님의 남은 돈은 %d입니다.\n", studentName, money);
	}
}
