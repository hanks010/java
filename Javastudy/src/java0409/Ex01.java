package java0409;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("=== 프로그램 시작 ===");
		// 코드 블록
		if (true) {
			System.out.println("좋은 아침이에요");
		}
		// 제어문의 분류(조건문, 반복문)
		// 조건문의 종류(if, switch)
		// 반복문의 종류(for, while, do-while)

		/*
		 * if(조건식){ //문장... }
		 */
		int a = -7;
		if (a < 0)
			a = -a; // a= a*(-1); // a *= -1;
		System.out.println("절댓값: " + a);

//		if(조건식) {
//			//참일 때 실행할 문장;
//		}else {
//			//거짓일 때 실행할 문장;
//		}
		a = 30;
		int b = 20;
		int max = 0;

		if (a > b) {
			max = a;
		} else {// a <= b
			max = b;
		}
		System.out.println("max = " + max);

		int num = 6;
		// 짝수 : num를 2로 나누었을 때 나머지가 0이면
		// 홀수 : num를 2로 나누었을 때 나머지가 1이면
		if (num % 2 == 0) {
			System.out.println(num + "은 짝수입니다");
		} else {
			System.out.println(num + "은 홀수입니다");
		}

		a = 30;
		b = 20;
		int min = 0;
		// 최소값 구하기
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		System.out.println("최소값: " + min);

		// ==================
		// 중첩 if문
		if (num % 3 == 0) {

		} else { // 3으로 나눴을 때 나머지가 1 또는 2인 경우
			if (num % 3 == 1) {

			} else {
				if (num % 3 == 2) {

				}
			}
		}
		// 다중 if문
//		if(조건1) {
		// 조건1이 참일 때 실행문;
//		}
//		else if(조건2) {
		// 조건2가 참일 때 실행문;
//		}else if(조건3) {
		// 조건3이 참일 때 실행문;
//		}else {
		// 위의 조건식 모두가 거짓일 때 실행할 문장
//		}

		num = -5;
		// 양수 영 음수 출력하기
		if (num > 0) {
			System.out.println(num + ": 양수");
		} else if (num == 0) {
			System.out.println(num + ": 영(zero)");
		} else {
			System.out.println(num + ": 음수");
		}
		int score = 93;
		// 90점 이상이면 "A" (94~97)
		// 98점 이상이면 "A+" (98~100)
		// 94점 미만이면 "A-" (90~93)
		// 90~ 100점이면 A
		// 80~ 89점이면 B
		// 70~ 79점이면 D
		// 60~ 69점이면 D
		// 0 ~ 59점이면 F
		String grade = "";
		if (score >= 98) {
			grade = "A+";
			System.out.println("학점: " + grade);
		} else if (score >= 94) {
			grade = "A";
			System.out.println("학점: " + grade);
		} else if(score >= 90){
			grade = "A-";
			System.out.println("학점: " + grade);
		
			
		if (score >= 90) { // && score <=100 필요없음
			if (score >= 98) {
				grade = "A+";
				System.out.println("학점: " + grade);
			} else if (score >= 94) {
				grade = "A";
				System.out.println("학점: " + grade);
			} else {
				grade = "A-";
				System.out.println("학점: " + grade);
			}
		} else if (score >= 80) {
			grade = "B";
			System.out.println("학점: " + grade);
		} else if (score >= 70) {
			grade = "C";
			System.out.println("학점: " + grade);
		} else if (score >= 60) {
			grade = "D";
			System.out.println("학점: " + grade);
		} else {
			grade = "F";
			System.out.println("학점: " + grade);
		}

		//중첩if문 방식if (score >= 90) { // && score <=100 필요없음
		if(score >= 90) {
			grade = "A";
		if (score >= 98) {
			grade += "+";
		} else if (score < 94) {
			grade += "-";
		} 
		}
		System.out.println("학점: " + grade);
	}
	}
}
