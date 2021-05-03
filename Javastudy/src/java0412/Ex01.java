package java0412;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문

		// (문제1)구구단 2단 출력
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ...
		// 2 * 9 = 18
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}
		System.out.println();
		// (문제2) 구구단 5단출력
		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		System.out.println();
		// (문제3)
		// for문 1부터 100보다 작은 수 중에서 3과 4의 공배수를 출력
		// 공배수: 3으로 나누어 떨어지고 4로도 나누어 떨어지는 수
		System.out.print("3과 4의 공배수:");
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.print(" "+i);
			}
		}
		System.out.println();
		// (문제4)
		// 1~10 사이의 홀수의 합: 짝수의 합: 출력하기
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 0; i<=10; i++) {
			if(i%2==0) {
				evenSum+=i;
			}
			else {
				oddSum +=i;
			}
		}
		System.out.println("홀수의 합: "+oddSum+" 짝수의 합: "+evenSum);
	}// main
}
