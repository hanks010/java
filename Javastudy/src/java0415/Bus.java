package java0415;

public class Bus {
	int busNumber; //버스 번호
	int passengerCount; //승객수
	int money;		// 버스 수입

	Bus(int busNumber){
		this.busNumber = busNumber;
	}
	void take(int money) { 	//승객이 버스에 탄 경우
		this.money += money;//버스 수입 증가
		passengerCount++;	//승객 수 1 증가
	}
	void showInfo() {
		System.out.printf("버스 %d번의 승객은 %d명이고, 수입은 %d입니다.\n",busNumber,passengerCount,money);
	}
}
