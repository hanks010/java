package java0413;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수형 2차원 배열 scores 선언
		int[] sum =new int[5];
		double[] avg =new double[5];
		int[][] scores = { {85, 60, 70},
						   {90, 95, 80},
						   {75, 80, 100},
						   {80, 70, 95},
						   {100, 65, 80} };
		
		for(int i =0; i<scores.length; i++) {
			for(int j =0; j<scores[i].length; j++) {
				sum[i] += scores[i][j];
			}
			avg[i] = sum[i]/scores[i].length; 
		}
		//출력형식
				//1번 학생 85 60 70 총점 평균
				//2번 학생 90 95 80 총점 평균
				//3번 학생 75 80 100 총점 평균
				//4번 학생 80 70 95 총점 평균
				//5번 학생 100 65 80 총점 평균

		for(int i =0; i<scores.length; i++) {
			System.out.print(i+1+"번 학생 ");
			for(int j =0; j<scores[i].length; j++) {
				System.out.print(+scores[i][j]+" ");
			}
			System.out.println("총점: "+sum[i]+" 평균: "+avg[i]);
		}
		System.out.println();
		
		int s =0; double a = 0;		

		for(int i =0; i<scores.length; i++) {
					System.out.print(i+1+"번 학생 ");
					for(int j =0; j<scores[i].length; j++) {
						s += scores[i][j];
						System.out.print(+scores[i][j]+" ");
					}
					a = s/scores[i].length;
					System.out.print("총점: "+s+" 평균: "+a);
					System.out.println();
					s= 0;
				}
			
				
		
	}//main	
}
	

