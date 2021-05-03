package java0409;

public class Ex08 {

	public static void main(String[] args) {
		// 1~5 사이의 임의의 정수 만들기

		System.out.println(Math.random()); // 0.0 이상 1.0 미만의 임의의 실수
		// 최소값 0.0 최대값 0.999999

		// 최대값이 나올 경우를 기준으로 생성할 경우의 수를 곱한다
		// 0.0 ~ 4.5ooo (정수만 사용함. 소수점 이하 제거하기)
		// 0 ~ 4(더하기 1)
		// 1 ~ 5
		
		int num = (int)(Math.random() * 100)+1;
		System.out.println("num = "+num);
	}

}
