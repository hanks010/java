package homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class generic_Test2 {	//2번

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Character> list = new ArrayList<>();
		double sum = 0, avg = 0;
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >>");
		String score = sc.nextLine();			//한 줄 입력
		String[] strArr = score.split(" ");		//공백기준으로 분리, 스트링 배열에 저장
		for (String str : strArr) {
			char c = str.charAt(0);
			list.add(c);						//리스트에 추가
		}

		for (int i = 0; i < list.size(); i++) {	//학점을 기준으로 합계 구함
			char s = list.get(i);
			switch (s) {		
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				sum += 0;
				break;
			}
		}
		avg = sum / list.size();
		System.out.println(avg);
	}// main

}
