package java0423;

public class Ex02 {

	public static void main(String[] args) {
		// 예외 : 프로그램 실행동안의 예기치 못한 오류
		// 예외 처리 try-catch문
		int a = 10, b = 2, result = 0;
		int[] numArr = {100, 200, 300};
		
		try{
			result = a / b;	//나누는 수가 0일 때 예외 발생
			
			//배열의 요소 한 개 출력
			System.out.println(numArr[3]); // 인덱스 번호 범위를 초과하여 접근시 예외
			
			}catch(Exception e) {
				//try 블록 안에서 예외 발생 시 예외를 처리하는 부분
				e.printStackTrace();
			}
		
		System.out.println("result = " + result);

		System.out.println("===프로그램 정상종료===");

	}// main

}
