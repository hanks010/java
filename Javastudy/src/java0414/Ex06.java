package java0414;

import java0415.Car;
public class Ex06 {

	public static void main(String[] args) {
	Animal ani1 = new Animal();
	ani1.setName("기린");
	ani1.showData();
	ani1.doRun();
	
	Animal ani2 = new Animal(10);
	ani2.setName("악어");
	ani2.showData();
	
	Animal ani3 = new Animal("호야",6);
	ani3.showData();
	ani3.doRun();
	

	
	}//main
}
