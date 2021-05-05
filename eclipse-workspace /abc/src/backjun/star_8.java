package backjun;

import java.util.Scanner;

public class star_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i =1; i <= N; i++) {
			for(int j =1; j<=i; j++ )
				System.out.print("*");
			for(int k =0; k<10-2*i;k++)
			System.out.print(" ");
			for(int o =1; o<=i; o++ )
				System.out.print("*");
			System.out.println();
		}
		for(int i =N-1; i>0; i--) {
			for(int j =i; j>0; j--)
				System.out.print("*");
			for(int k=0; k<10-i*2; k++)
				System.out.print(" ");
			for(int o =i; o>0; o--)
				System.out.print("*");
			if(i!=1)
			System.out.println();
		}
		
	}//main
}
