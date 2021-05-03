package java0408;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//비교(관계)연산자: > >= < <= == !
			//연산 결과로 논리값이 만들어짐
			//논리값은 조건식에 사용됨
		
		int a = 10, b =20;
		System.out.println("a > b ="+(a > b));
		System.out.println("a < 100 ="+(a < 100));
		System.out.println("a == b ="+(a == b));
		System.out.println("a != b ="+(a != b));
		
		//조건(삼항)연산자
		//변수 = (조건식) ? 참값 : 거짓값;
		System.out.print("첫 번째 숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		//a = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		//b = sc.nextInt();
		int max = 0;
		max = (a>b) ? a : b;
		System.out.println("최댓값: "+max);
		//===============
		//num의 절대값 구하기
		System.out.print("절대값을 구할 숫자(양수 또는 음수)를 입력하세요: ");
		int num = sc.nextInt();
		int abs = 0;
		abs = (num <0)? -num : num; //-num도 가능
		//abs = Math.abs(num);
		System.out.println("절댓값: "+abs);
	
	}

}
