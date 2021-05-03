package java0421;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력: ");
		String strNum1 = sc.nextLine();	//엔터키 쳤을 때 입력되는 줄바꿈 문자("\n") 이전까지 문자열을 리턴함
		
		System.out.print("두번째 숫자를 입력: ");
		String strNum2 = sc.nextLine();	
		
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		System.out.println("두 수의 합은: "+ (num1+num2));
	}	//main
}
