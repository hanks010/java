package backjun;
import java.io.*;
import java.util.Scanner;
public class Word_study {
/*
 * 21/04/08
 * str.charAt(index) - 문자열을 하나씩 쪼개서 문자형 반환
 * 중복 판별에 max_i ==0을 썼는데, 첫 인덱스값은 0이기에 -1로 설정해줘야 했음 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int cnt = 0,cnt2=0,max =0,max_i=-1;
		for(int i =0; i<a.length(); i++) {cnt ++;} //문자열 개수 확인
		
		int[] result = new int[26];	//알파벳 갯수 세기 위한 배열
		char[] word = new char[cnt];//문자열 하나씩 담기 위한 배열
		
		for(int i =0; i<cnt; i++) {word[i] = a.charAt(i);} //하나씩 쪼개서 배열에 담
		
		for(int i =0; i<cnt; i++) {		//알파벳 갯수만큼 알파벳 배열의 수를 증가시킴 
			if(word[i]>=97)	result[word[i]-97]++;	//
			else	result[word[i]-65]++;
		}
		
		for(int i =0; i <result.length; i++) {	//제일 많은 알파벳을 찾음
			if(result[i]>max) 
				max = result[i];		
	}
		for(int i =0; i<result.length; i++) {
			if(result[i]==max) {
				if(max_i==-1) {
					max_i=i;  
				}
				else cnt2++; 
			}
			char c= (char) (i+97);
			System.out.println(c+"의 cnt2: "+cnt2+" max_i: "+max_i +" max: "+max+" result["+i+"]: "+result[i]);
			
		}
	
		if(cnt2 ==0) System.out.printf("%c",max_i+65);
		else System.out.println('?');
	}

}
