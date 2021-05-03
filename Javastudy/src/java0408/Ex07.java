package java0408;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor, eng, math; //사용자가입력할 교과목 점수를 저장할 변수
		int sum = 0;	//세 과목의 합계를 구할 변수
		double avg = 0;	//0.0 세 과목의 평균을 구할 변수
		// 합계 구하기
		// 평균 구하기
		// 출력 국어: ㅇㅇ 영어: ㅇㅇ 수학: ㅇㅇ
		// 합계: ㅇㅇ 평균: ㅇ
		
		//평균 60점 이상이고, 각 과목이 40점 이상이면 "합격"
		//위 조건이 거짓이면 "불합격"
		//조건연산자 사용하여 판단
		System.out.print("국어점수 입력: "); kor = sc.nextInt();
		System.out.print("영어점수 입력: "); eng = sc.nextInt();
		System.out.print("수학점수 입력: "); math = sc.nextInt();
		sum = kor + eng + math;
		avg = sum/3.0;
		String str = new String();
		str = avg >= 60 
				&& kor >=40
				&& eng >=40 
				&& math >=40
				? "합격" : "불합격"; 
				
		System.out.println("국어: "+kor+" 영어: "+eng+" 수학: "+math);
		//System.out.println("합계: "+sum+" 평균: "+avg);
		System.out.printf("합계: %d 평균: %f\n",sum, avg);
		System.out.println("결과: "+str);
	}//main

}
