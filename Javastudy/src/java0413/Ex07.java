package java0413;

public class Ex07 {
	public static int calc(int a, int b, char c) { //매개변수
		switch(c) {
		case '+': return a + b;	
		case '-': return a - b;
		case '*': return a * b;
		case '/': return a / b;
		default: System.out.println("사칙연산 부호를 입력하세요");
				 return 0;
		}
	}
	
	public static void main(String[] args) {
		//사칙연산을 해주는 간단한 계산기 함수를 아래처럼 사용할 때
		// 해당 함수를 정의해 보세요
		System.out.println("20 + 10 = "+calc(20, 10, '+')); //인자(argument)값 전달
		System.out.println("20 - 10 = "+calc(20, 10, '-'));
		System.out.println("20 * 10 = "+calc(20, 10, '*'));
		System.out.println("20 / 10 = "+calc(20, 10, '/'));
	
	
	
	}

}
