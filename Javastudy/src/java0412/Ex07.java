package java0412;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 점수 scores 100 90 83 77 65
		int[] scores = { 100, 90, 83, 77, 66};
		int sum =0;
		double avg = 0;
		
		for(int i =0; i<scores.length; i++) { // 배열객체에 직접 접근
			sum += scores[i];
		}
		avg = (double)sum/scores.length;
		
		System.out.println("합계: "+sum+"\n평균: "+avg);
		
		sum =0;
		for(int score:scores) {	//score에 값 복사 후 사용
				sum += score;
			}
		}//main
	}
