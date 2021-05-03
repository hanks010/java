package java0415;

class MethodOvereLoad {
	// showInf(값) 메소드: 값을 출력하기
	// 메소드 오버로딩
	void showInfo(int num) {
		System.out.println(num);
	}

	void showInfo(double num) {
		System.out.println(num);
	}

	void showInfo(char ch) {
		System.out.println(ch);
	}

	void showInfo(String str) {
		System.out.println(str);
	}

	void showInfo(boolean bool) {
		System.out.println(bool);
	}

	String showInfoStr(String str) {
		System.out.println(str);
		return str + "!";
	}

	// 매개변수 2개일 경우 자료형 또는 자료형 순서가 다르면

	void printNum(int a) {
		System.out.printf("%d\n", a);
	}
	void printNum(int a, int b) {
		System.out.printf("%d\t%d\n", a, b);
	}

	void printNum(int a, int b, int c) {
			System.out.printf("%d\t%d\t%d\n", a, b, c);
	}

	// 비정형 인자. 가변인자 Variable Argument(Varargs)
	// 가변인자는 다른 매개변수와 함께 사용할 때 가장 마지막에 위치해야 함 
	void printNum(int... num) { // 매개변수 0개 이상 전달 가능. 배열로 전달받음
		for(int i =0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
	}
	
	void printNum(String str, int... num) {
		
	}
//void printNum(int... num, String str, ) { 가변인자 뒤에 다른 매개변수 선언이 오면 오류
		
//	}
	//void printNum(int[] num) { // 매개변수 0개 이상 전달 가능. 배열로 전달받음
	//}
}

public class Ex03 {

	public static void main(String[] args) {
		// 메소드 오버로딩 : 동일한 이름의 메소드를 여러개 중복 정의(사용자 편의를 위해)

		// 메소드 오버로딩 규칙
		// : 같은 클래스 내에서 메소드 이름은 동일하게
		// 매개변수 갯수는 다르게
		// 매개변수 갯수가 같다면 자료형이 다르게.
		// 메소드의 리턴형(반환형)은 오버로딩과 관련이 없음(호출문 기준으로 정해짐)

		MethodOvereLoad mo = new MethodOvereLoad();

		mo.showInfo(10);
		mo.showInfo(false);
		mo.showInfo('한');
		mo.showInfo(2.7);
		mo.showInfo("안녕하세요");

		mo.printNum(10, 20, 30);
		mo.printNum(10, 20, 30, 40, 50, 60, 70);
	}// main

}
