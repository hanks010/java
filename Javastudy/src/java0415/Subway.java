package java0415;

public class Subway {
	String lineNumber; //지하철 번호
	int passengerCount; //승객수
	int money;		// 지하철 수입

	Subway(String lineNumber){
		this.lineNumber = lineNumber;
	}
	void take(int money) { 	//승객이 지하철에 탄 경우
		this.money += money;//지하철 수입 증가
		passengerCount++;	//승객 수 1 증가
	}
	void showInfo() {
		System.out.printf(" %s의 승객은 %d명이고, 수입은 %d입니다.\n",lineNumber,passengerCount,money);
	}
}
