package java0408;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연산자는 기본적으로 왼쪽에서 오른쪽으로 수행됨
		//대입 연산자만 예외적으로 오른쪽에서 왼쪽으로 수행
		
		//1. 단항연산자: + - 부호 ++ -- 증감연산자	! 논리부정 (형변환)
		//2. 산술연산자: * / % + - 
		//3. 비교(관계)연산자: > >= <  <= == !=
		//4. 논리연산자: && (and) || (or)
		//5. 삼항(조건)연산자: (조건식)? 참값 : 거짓값
		//6. 대입연산자: =	+=	-=	*=	/=	%=
		
		//자바는 정수 나눗셈과 실수 나눗셈을 구분함
		// 정수끼리 나눗셈은 정수 몫만 구함
		// 실수가 나눗셈에 사용되면 실수 몫을 구함
		int a = 5, b =2;
		//정수형 / 정수형 = 정수
		System.out.println("a / b 나눈 결과: "+ a / b);
		//실수형 / 정수형 = 실수
		System.out.println("a / b 나눈 결과: "+ (double)a / b);
		
		//나머지 구하기 연산
		System.out.println("a % b 나눈 나머지"+ a % b); //1
		
		System.out.println("a + b = "+ a + b); //a + b = 52
		
		
		
	}//main

}
