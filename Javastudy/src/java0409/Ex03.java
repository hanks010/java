package java0409;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int height;		//cm 단위 키 	175cm
		double dHeight;	//m단위 키 1.75m
		double weight = 0;	//체중 kg단위
		double bmi;		//bmi 비만지수 구할 변수
		//비만지수 bmi = 몸무게kg / 키m의 제곱
		// cm를 m단위로 바꾸기 
		//비만지수 출력
		//비만지수		출력문장
		//30.0 이상			고도비만
		//25.0 이상 30.0 미만	비만
		//23.0 이상 25.0 미만	과체중
		//18.5 이상 23.0 미만	표준체중
		//18.5 미만			체중미달
		Scanner sc = new Scanner(System.in);
		System.out.print("키 입력(cm): ");
		height = sc.nextInt();
		System.out.print("체중 입력(kg): ");
		weight = sc.nextInt();
		
		//height = 172;
		//weight = 72;
		dHeight = height / 100.0;
		bmi = weight / (dHeight * dHeight);
		
		if(bmi >= 30.0) {
			System.out.println("bmi: "+bmi+"\n고도비만입니다");
		}else if(bmi >=25.0) {
			System.out.println("bmi: "+bmi+"\n비만입니다");
		}else if(bmi >=23.0) {
			System.out.println("bmi: "+bmi+"\n과체중입니다");
		}else if(bmi >=18.5) {
			System.out.println("bmi: "+bmi+"\n표준체중입니다");
		}else{
			System.out.println("bmi: "+bmi+"\n체중미달입니다");
		}
		

	}

}
