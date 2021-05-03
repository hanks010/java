package homework;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class generic_test {	//1번

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0, max = 0, num = 0;
		List<Integer> vector = new Vector<>();// List 컬렉션 Vector 객체 준비
		System.out.print("정수(-1)이 입력될 때까지) >>"); // 공백문자(스페이스바, 줄바꿈문자, 탭문자 등)앞까지 하나씩 가져옴
		do {
			num = sc.nextInt();
			vector.add(num);
		} while (num != -1);
		for (int v : vector) {
			if (v > max) {
				max = v;
			}
		}
		System.out.println("가장 큰 수는 " + max);
	}// main

}
