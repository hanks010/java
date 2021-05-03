package java0423;

import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		sc.hasNextInt(); // 다음 입력 정수가 있는지 확인 true/false 리턴
//		sc.nextInt(); // 호출할 때마다 공백문자(엔터키, 탭, 스페이스바 키 입력) 이전의 숫자 한 개를 가져옴
		
//		sc.hasNext();	//다음 입력 문자열이 있는지 확인 true/false 리턴
//		sc.next();		//호출할 때마다 공백문자(엔터키, 탭, 스페이스바 키 입력) 이전의 문자열 한개를 가져옴
		
//		sc.hasNextLine(); // 한 줄 입력된 문자열("\n" 으로 끝나는)이 있는지 확인
//		sc.nextLine();	  // 호출할 때마다 줄바꿈문자(엔터키 입력) 이전의 문자열 한 개를 가져옴
		try {
		System.out.print("숫자을 입력하세요: ");
		int num = sc.nextInt();
		System.out.println("입력한 숫자는 "+num);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//finally 블록은 예외처리와 관련없음
			//예외가 발생하든 안하든 try블록 실행 후 정리작업이 필요할 때 finally 블록 사용할 수 있음
			
				// 입출력 객체는 사용이 끝난 시점에는 시스템 자원을 반환해야 함
				//하드웨어 사용과 관련된 자원은 운영체제가 담당함
				//하드웨어 사용하려면 운영체제의 자원을 사용해야함
				//운영체제로부터 빌려온 자원을 사용이 끝나면 반납해줘야함
			sc.close();	//비유: 가스밸브 잠그기는 예외발생 여부와 관계없이 공통작업
		}
		
		
		System.out.println("===프로그램 정상 종료===");
		
	}//main

}
