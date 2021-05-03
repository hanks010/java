package java0420;
//싱글톤 디자인 패턴
class WaterMachine {
	private static WaterMachine instance = new WaterMachine();
	
	public static WaterMachine getInstance() {
		return instance;
	}

	private WaterMachine() {
		
	}
	public void drawWater() {
		System.out.println("물을 받는다");
	}
}
public class Ex03 {

	public static void main(String[] args) {
		//싱글톤 객체를 가져오는 방식
		WaterMachine wm = WaterMachine.getInstance();
		wm.drawWater();
	}

}
