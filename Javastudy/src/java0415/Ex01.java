package java0415;

public class Ex01 {

	public static void main(String[] args) {
		//생성자 오버로딩: 클래스 안에 생성자가 2개 이상 선언된 것을 말함
		Car car = new Car();
		car.showInfo();
		//car.color = "gray";
		//car.gearType = "manual";
		
		
		car.setColor("yellow");
		car.setGearType("auto");
		car.setDoorCount(2);
		
		System.out.println(car.getColor());
		System.out.println(car.getGearType());
		System.out.println(car.getDoorCount());
		
		Car car2 = new Car("red");
		car2.showInfo();
		Car car3 = new Car("blue","manual");
		car3.showInfo();
		Car car4 = new Car("blue","manual",5);
		car4.showInfo();
		
		
		
		
		
		
	}

}
