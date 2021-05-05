package backjun;

import java.util.Scanner;

public class number_of_words {
/*
 * 21/04/09
 * 비교적 간단
 * str.split("str")
 * 문자열을 괄호 안의 내용을 기준으로 자름
 * str.split("str",n)
 * 반환을 원하는 갯수만큼 제한을 둘 수도 있음
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int cnt =0;
		str = sc.nextLine();
		
		String [] s = str.split(" ");
		for(int i =0; i<s.length; i++) {
			if(s[i]!="") { //공백을 거를 때 " " 아니고 "" //
				cnt ++;
				//System.out.println("s["+i+"]: "+s[i]);
			}
		}
		System.out.println(cnt);
	}
}
