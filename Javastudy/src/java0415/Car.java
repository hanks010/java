package java0415;
//접근 제어자(access modifier)
//public	: 다른 패키지에 있는 클래스들에게 공개(모두 공개)
//protected	: 같은 패키지 + 다른 패키지라면 상속 관계에 있는 자식 클래스들에게만 공개
//(package)	: 같은 패키지에 있는 클래스들에게 공개
//private   : 클래스 내부에서만 사용가능. 클래스 밖에서는 사용 불가능함

public class Car {
	//멤버 변수(필드 field)
	private String color;	 // 색상
	private String gearType; // "auto" 자동 "manual" 수동
	private int doorCount; 	 //	문 갯수
	
	//기본생성자
	Car(){
	//	color = "white";
	//	gearType = "auto";
	//	doorCount = 4;
		// this() 생성자 용법은 생성자 코드블록 안에서만 사용가능함
		this("white","auto",4);	//this() 호출문은 첫문장이 되어야함
		
		// 1) 매개변수를 가장 많이 받는 생성자 쪽으로 호출해서 초기화하는 방식
	}

	Car(String color){
		this.color = color;
		gearType = "auto";
		doorCount = 4;
	}
	Car(String color, String gearType){
		this.color = color;
		this.gearType = gearType;
		doorCount = 4;
	}
	Car(String color, String gearType,int doorCount){
		super(); //컴파일러가 컴파일러 결과물에 super(); 호출문을 넣어줌
		
		this.color = color;
		this.gearType = gearType;
		this.doorCount = doorCount;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	String getGearType() {
		return gearType;
	}

	void setGearType(String gearType) {
		this.gearType = gearType;
	}

	int getDoorCount() {
		return doorCount;
	}

	void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}
	void showInfo() {
		System.out.printf("자동차 색: %s, 기어타입: %s, 문갯수: %d\n", color, gearType, doorCount);
	}
}
