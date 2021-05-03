package java0413;

public class Ex01 {

	public static void main(String[] args) {
		//2차원 배열
		int [][] a = new int[3][4]; //3행 4열 2차원 배열 선언
		System.out.println("a[0][0]: "+a[0][0]);
		
		a[0][0]=10; a[0][1] = 20; a[0][2] = 30; a[0][3] = 40;
		a[1][0]=50; a[1][1] = 60; a[1][2] = 70; a[1][3] = 80;
		a[2][0]=90; a[2][1] = 100; a[2][2] = 110; a[2][3] = 120;
		
		for(int r =0; r<3; r++) {		//행
			for(int c = 0; c<4; c++) {	//열
				System.out.print("a["+r+"]["+c+"]: "+a[r][c]+"\t");
			}
			System.out.println();
		}
		System.out.println("=============================");
		int [][] b = { { 10, 20 },
					   { 30, 40 },
					   { 50, 60 } };	//정방향 배열
		System.out.println("행의 개수는 "+b.length);
		System.out.println("첫 번째 행을 기준으로 열의 개수는 "+b[0].length);
		
		for(int r =0; r< b.length; r++) {
			for(int c =0; c< b[0].length; c++) {
				System.out.print(b[r][c]+" ");
			}
			System.out.println();
		}
	
	
		}//main
	}

