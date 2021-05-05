package backjun;

import java.util.Scanner;

public class sugar_deliever {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0, cnt2 =0;
		if(N < 5 && N % 3 ==0) cnt = N/3;
		if(N>5) cnt = 1;
		while(N>5) {
			N -=5;
			
			if(N % 3 !=0 && N < 5)	 
				break;
			else if(N % 3 !=0) { 
				cnt++;
				continue;
			}
			else if(N % 3 ==0 && N>5) { //6
				cnt += N/3;
				break;
			}
			else {
				cnt++;
			
			}
		}
		if(N % 3==0 && N>5)
			cnt2 = N/3;
		
		System.out.println(cnt);
	
	
	}

}
