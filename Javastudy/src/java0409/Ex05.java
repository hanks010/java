package java0409;

public class Ex05 {

	public static void main(String[] args) {
//		//반복문: while문
//		while(조건식) {
//			반복실행할 문장;	}
	
		//while문을 for문 역할(일정횟수만큼 반복)로 사용하기
		for(int i =0; i<=5; i++) {
			System.out.println(i+ ": 안녕");
		}
		System.out.println();
		int j = 1;		//초기식
		while(j<=5) {	//조건식
			System.out.println(j+ ": 안녕");
			j++;		//증감식
		}
		
	}

}
