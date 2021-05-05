package backjun;

import java.util.Scanner;
/*
 * 21/04/11
 * 배열 선언할 때 null값으로 선언한 상태에서 값을 저장할 시 
 * NullPointerException 발생
 */
public class dial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int res = 0;
		char []s = new char[str.length()];
		for(int i=0; i<str.length(); i++) 
			s[i] = str.charAt(i);
		
		for(int i =0; i<str.length(); i++) {
			switch(s[i]) {
			case 'A': case'B': case'C':
				res += 3; 
				break;
			case 'D': case'E': case'F':
				res += 4; 
				break;
			case 'G': case'H': case'I':
				res += 5; 
				break;
			case 'J': case'K': case'L':
				res += 6; 
				break;
			case 'M': case'N': case'O':
				res += 7; 
				break;
			case 'P': case'Q': case'R': case'S':
				res += 8; 
				break;
			case 'T': case'U': case'V':
				res += 9; 
				break;
			case 'W': case'X': case'Y':case'Z':
				res += 10; 
				break;	
			}
		}
		System.out.println(res);
		
	}//main
}
