package java0412;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중첩 반복문
		
		for(int i =0; i<3; i++) {	//바깥쪽 반복	(행 row)
			for(int j=0; j<5; j++)	//안쪽 반복 	(열 column)
			System.out.print("*");
			System.out.println();
		}
		System.out.println();
		// 구구단 2단~ 9단 출력
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i * j+"\t");
					}
				System.out.println();
				}
		System.out.println();
		//구구단 2단~9단 세로출력
		for(int i =1; i<=9;i++) {
			for(int j =2; j<=9; j++) {
				System.out.print(j + " * " + i + " = " + i * j+"\t");
			}
			System.out.println();
		}
		
		
	}// main
}
