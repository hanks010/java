package backjun;

import java.util.Scanner;

public class star_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i =1; i<=num; i++) {
			for(int j =i; j<num;j++)
				System.out.print(" ");
			for(int k =0; k<i*2-1; k++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=num, q=1; i>0; i--,q++) {
			for(int j =0; j< q; j++)
				System.out.print(" ");
			for(int k =0; k<i*2-3; k++) 
				System.out.print("*");
			System.out.println();
		}
	
	}//main
}
