package java0409;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 숫자 맞추기 게임
		// 컴퓨터가 1 ~ 100 사이의 임의의 정수를 생각한다.
		// 사람은 컴퓨터가 생각하고 있는 숫자를 맞히면 게임에서 이긴다.
		Scanner sc = new Scanner(System.in);
		int comNum = (int) (Math.random() * 100) + 1;
		int cnt = 0, myNum = 0;

		// 컴퓨터가 생각한 숫자가 짝수면 "맞힐 수는 짝수입니다"라고 힌트를 줌
		// 홀수면 "맞힐 수는 홀수입니다"라고 힌트를 줌
		// 컴퓨터수와 나의 숫자 비교
		// 컴퓨터수가 나의 수보다 크면 "더 큰 수입니다."
		// 컴퓨터수가 나의 수보다 작으면 "더 작은 수입니다"
		// 컴퓨터수가 나의 수와 같으면 "맞혔습니다!"

		// 게임은 맞힐 때까지 반복 //(제일 마지막에 생각해보기)
		// while(true) {
		// if(조건식) {
		// break; //자신을 감싸는 가장 가까운 반복문과 switch문을 탈출함
		// }
		// }
		while (true) {
			System.out.print("숫자 입력(1~100): ");
			myNum = sc.nextInt();
			if (comNum > myNum) {
				System.out.println("더 큰 수를 입력하세요!");
				cnt++;
				System.out.println("(시도한 횟수: "+cnt+"회)");
			} else if (comNum < myNum) {
				System.out.println("더 작은 수를 입력하세요!" );
				cnt++;
				System.out.println("(시도한 횟수: "+cnt+"회)");
			} else {
				System.out.println("축하합니다! 정답을 맞췄습니다");
				cnt++;
				System.out.println("(시도한 횟수: "+cnt+"회)");
				break;
			}
			System.out.println();
			if (cnt == 5) {
				if (comNum % 2 == 0) {
					System.out.println("맞힐 수는 짝수입니다");
				} else {
					System.out.println("맞힐 수는 홀수입니다");
				}
			}
		} // while
	}//main
}
