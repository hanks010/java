package java0412;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중첩 반복문의 제어변수 사용
		//바깥쪽 제어변수를 안쪽 반복문 조건식 등에서 사용 가능함
		
		for(int r =1; r<=5; r++){//for(int r=5; r>=1;r--) {	//행(row)
			for(int c =1; c<=r; c++){//for(int c = r; c<=5; c++) {	//열(column)
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//(문제2) 두개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 수 출력
		//for for if
		//1, 5
		//3, 3
		//4, 2
		//5, 1
		for(int i =1; i<=6; i++) {	//첫번째 주사위
			for(int j =1; j<=6; j++) {	//두번째 주사위
				if(i+j == 6) {
					System.out.println(i+", "+j);
				}
			}
		}
		System.out.println();
		
		//(문제3) 2x + 4y = 10
		//0 <= x <=10	0 <= y <=10
		for(int x = 0; x <=10; x++) {
			for(int y = 0; y<=10; y++) {
				if(2 * x + 4 * y ==10) {
					System.out.println("x: "+x+", y: "+y);
				}
			}
		}
	}//main

}
