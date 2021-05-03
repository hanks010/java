package java0426;

class A{
	// 멤버변수(필드)
	int num;
	// 메소드
	int getNum() {
		return num;
	}
	class B{
		
	}//B
	// 특정 클래스의 [멤버단위 내부클래스] (member inner class)
		class MyTask implements Runnable {

			@Override
			public void run() {
				System.out.println("MyTask");
			}
		}
} //A

public class Ex10 {
	
	public static void main(String[] args) {
		// 내부 클래스(inner class) : 클래스 내부에 선언한 클래스
		
		//내부 클래스가 포함하는 외부 클래스와 관련이 깊을 때 내부클래스로 표현함
		int aNum = 10; //지역변수
		
		// 메소드 안에서 선언된 [지역 내부클래스](local inner class)
		class MyTask2 implements Runnable{

			@Override
			public void run() {
				System.out.println("MyTask2");
				
			}
			
		}
		Thread thread = new Thread(new MyTask2());
		thread.start();
		
		System.out.println("==========================");
		//이름이 없는 익명의 내부 클래스 정의하는 방법(지역 내부클래스 기준)
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("runnable");
			}
		};
		Thread thread2 = new Thread(runnable);
		thread2.start();
		

		System.out.println("==========================");
		
		// 여기서 Runnable 구현 클래스는 익명의 지역 내부 클래스이다
		Thread thread3 = new Thread(new Runnable() {	
			@Override
			public void run() {
				System.out.println("thread3");
			}
		});
		thread3.start();
		System.out.println("==========================");
		//람다식 표현
		//: 인터페이스에 선언된 추상메소드가 한 개일 때만 사용가능함
		
		Thread thread4 = new Thread(() -> {	//run() 메소드 형식과 일치시킴
			System.out.println("thread4");
		});
		thread4.start();
	}//main

}
