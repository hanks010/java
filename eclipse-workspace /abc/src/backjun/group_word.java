package backjun;

import java.util.Scanner;
/*
 * 21/04/12
 */
public class group_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0, alp = 0, no = 0;
		String[] str = new String[N];
		int[] alphabet = new int[26];
		// char[] res =
		for (int i = 0; i < N; i++)
			str[i] = sc.next();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				alp = (int) str[i].charAt(j);
				if (alphabet[alp - 97] == 0)	//알파벳 배열이 0이면(처음)
					alphabet[alp - 97]++;		//알파벳 배열 1 증가
				else {							//알파벳 배열이 0이 아니고
					if (str[i].charAt(j) == str[i].charAt(j - 1))	//이전 인덱스 값과 같으면 스킵(다음 인덱스로 넘어감) 
						continue;	
					else {
						no++;		//이전 인덱스 값과 다르면 그룹 단어가 아님
						break;
					}
				}
			}	//2중 for
			alphabet = new int[26];
		} // for
		System.out.println(N - no);
	}// main
}
