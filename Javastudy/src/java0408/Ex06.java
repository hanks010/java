package java0408;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//주민번호 뒷번호에 첫자리 숫자가 
		//1 남 2 여 3 남 4 여
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 뒷번호 첫자리 숫자 입력: ");
		int ju = sc.nextInt();	//1 2 3 4 중 한 가지 숫자가 입력
		String gender = (ju ==1 || ju ==3)? "남자": "여자";
		System.out.println(ju+" -> " + gender);
	}

}
