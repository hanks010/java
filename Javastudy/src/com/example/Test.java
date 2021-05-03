package com.example;

import java.util.HashMap;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strArr;
		String nation = null, pop = null, stdin = null, search = null;
		HashMap<String, String> nations = new HashMap<String, String>();
		System.out.println("나라 이름과 인구를 10개 입력하세요.(예: Korea 5000)");
		System.out.print("나라 이름, 인구 >>");
		stdin = sc.nextLine();
		strArr = stdin.split(" ");
		nation = strArr[0];
		pop = strArr[1];

		nations.put(nation, pop);
	}

}
