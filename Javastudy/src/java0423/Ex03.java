package java0423;

import java0415.MyCar;

public class Ex03 {

	public static void main(String[] args) {
		MyCar car = new MyCar();
		car = null;
			try {
				System.out.println(car.toString());
			} catch (Exception e) {
				
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("널 참조변수 사용 예외 발생");
			}
		System.out.println("===프로그램 정상종료===");
		
	}//main
}
