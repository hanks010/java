package java0409;

public class Ex04 {

	public static void main(String[] args) {
		// 반복문 (for, while, do-while)
		// for(초기식; 조건식; 증감식){
		// 반복실행할 문장;
		// }

		// 변수의 생명주기(life cycle)

		int num;
		num = 10;
		{
			int num2 = 20;
			System.out.println("num2 =" + num2);
		}
		// System.out.println("num2= "+num2);
		// 5번 반복해서 "안녕~" 출력하기
		// for문에서 반복 횟수를 세는 변수: 제어변수
		// 알파벳 i부터 시작하는 한글자를 주로 관례로 사용함
		// 조건: 참 ->반복, 거짓=> 반복끝냄
		// int = 1 / i<=5 / i++ 각자 단독 실행,
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ": 안녕");
		}
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		} // 1 2 3 4 5 6 7 8 9 10
		System.out.println();

		for (int i = 11; i <= 20; i++) {
			System.out.print(i + " ");
		} // 11 12 13 14 15 16 17 18 19 20
		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		} // 0 1 2 3 4 5 6 7 8 9
		System.out.println();

		for (int i = 2; i <= 20; i += 2) {
			System.out.print(i + " ");
		} // 2 4 6 8 10 12 14 16 18 20
		System.out.println();

		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		} // 10 9 8 7 6 5 4 3 2 1
		System.out.println();

		// 1+2+3+4+5+6+7+8+9+10
		int sum = 0; // 1~10 더한 값(누적값)을 저장할 변수
		for (int i = 1; i <= 100; i++) {
			sum += i; // 누적합
			System.out.println("i= " + i + ", sum = " + sum);
		}
		System.out.println("1~100 누적합: " + sum);

		// ==================================
		// 1~10 중에 홀수의 합
		sum = 0;// 누적합을 구할 변수는 0으로 초기화 필수
		//for문과 if문 중첩해서 해결
		for (int i = 1; i <= 10; i++) {	//10번 반복
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("1~10 중에 홀수의 합 1: " + sum);
		sum =0;
		//for문만으로 해결
		for(int i =1; i<=10; i +=2) {	//5번 반복	
			sum += i;
		}
		System.out.println("1~10 중에 홀수의 합 2: " + sum);
	}
}
