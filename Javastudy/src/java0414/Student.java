package java0414;

public class Student {
	// 멤버변수
	int hakbun =1;  //학번
	String name= "홍길동"; //이름
	
	//int kor, math, eng; //국, 영, 수
	int[] scores = new int[3];	// 세 과목 점수를 저장할 배열 선언, 참조변수만 선언
	//기본 생성자(default constructor) : 매개변수 없는 생성자
	// - 클래스 정의 안에 생성자 코드블록이 없으면 컴파일러가 컴파일 시에 자동으로 생성한다.
	// - 생성자는 반환형 정보가 없음
	Student() {
		//생성자의 역할: 생성된 객체의 속성(멤버변수)을 초기화 하는 역할
		System.out.println("===생성자 호출됨===");
	}
	
	// 세 과목 점수의 합계를 리턴하는 메소드
	int getSum() {
		int sum =0;
		for(int i =0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	} //sum
	// 세 과목 점수의 평균을 리턴하는 메소드
	double getAvg() {
		//double avg = 0;
		//avg = getSum()/scores.length;
		// return avg;
		return (double)getSum()/scores.length;
	}
}
