package java0413;

public class Ex04 {

	// 사용자 정의 함수 정의하는 방법
	// 출력값정보_자료형 함수이름(입력값정보_자료형{
	//		자주 사용되는 명령문;
	//		자주 사용되는 명령문;
	//		return 값
	//}
	
	//매개변수(입력)값이 없고, 반환(출력)값도 없는 함수
	public static void star() {
		System.out.println("*****");
	}
	//매개변수(입력)값이 있고, 반환(출력)값은 없는 함수
	public static void multiplyTen(int n) {
		System.out.println(n+"값의 10배는 "+n * 10);
	}
	//매개변수(입력)값이 없고, 반환(출력)값은 있는 함수
	public static String hello() {
		//함수가 값을 반환할 때는 return 문을 사용함
		String str = "aaa";
		return str;
	}
	//매개변수(입력)값이 있고, 반환(출력)값도 있는 함수
	public static int getMultiply(int n1, int n2) {
		int result = n1 * n2;
		//return result;
		return n1 * n2;
	}
	public static void main(String[] args) {
		//메소드(함수)
		//	: 기능별 명령문들을 함수 단위 코드블록으로 묶어서 정의하고,
		//	  함수 이름으로 호출해서 사용하는 단위가 됨
		
		System.out.println("안녕");	//모니터 콘솔 출력 함수(미리 정의된 함수)
		
		//사용자 정의 함수: 사용자가 직접 정의한 함수
		//자바는 클래스 블록 바로 아래 레벨에서 정의 가능
		
		//함수는 이름을 호출할 때만 실행됨
		star();	//star() 함수 호출
		//함수를 호출하면 실행 흐름이 호출한 함수 블록으로 옮겨짐
		//호출한 해당함수의 실행이 완료되면 호출되었던 위치로 실행흐름이 돌아옴
		multiplyTen(7);
		multiplyTen(12);
		String str = hello();
		System.out.println("str = "+str);
		System.out.println("12 곱하기 3은 " + getMultiply(12, 3));
		System.out.println("===프로그램 종료===");
		
	}//main
}
