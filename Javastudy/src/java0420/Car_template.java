package java0420;

abstract class Car{
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}
class AICar extends Car{
	public void drive() {
		System.out.println("자율주행합니다");
		System.out.println("자동차가 스스로 방향을 스스로 전환합니다");
	}
	public void wiper() {
		System.out.println("비나 눈의 양에 따라 빠르기가 자동으로 조절됩니다");
	}
	public void stop() {
		System.out.println("브레이크로 정지합니다");
	}
}
class ManualCar extends Car{

	@Override
	public void drive() {
	System.out.println("사람이 운전합니다");	
	System.out.println("사람이 핸들을 조작합니다");
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다");
	}

	@Override
	public void wiper() {
		System.out.println("사람이 빠르기를 조절합니다");
		
	}
	
}

public class Car_template {

	public static void main(String[] args) {
		AICar aic = new AICar();
		ManualCar man = new ManualCar();
		aic.run();
		System.out.println("=====================");
		man.run();
		
	}

}
