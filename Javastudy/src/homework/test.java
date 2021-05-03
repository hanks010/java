package homework;

import java.util.HashMap;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strArr;
		String nation = null, pop = null, stdin = null, search = null;
		HashMap<String, String> nations = new HashMap<String, String>();
		System.out.println("나라 이름과 인구를 10개 입력하세요.(예: Korea 5000)");
		while (true) {
			System.out.print("나라, 이름, 인구 >>");
			nation = sc.next();
			if (nation.equals("그만")) {	
				break;
			}
			pop = sc.next();
			nations.put(nation, pop);
		}
		System.out.println(nations);
		while (true) {

			System.out.print("인구 검색 >>");
			search = sc.next();
			if (search.equals("그만")) {
				break;
			} else {
				if (nations.containsKey(search)) {
					System.out.println(search + "의 인구는 " + nations.get(search));
				} else {
					System.out.println(search + " 나라는 없습니다");
				}
			}
		}

	}// main

}
