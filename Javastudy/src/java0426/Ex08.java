package java0426;

class GoTask implements Runnable{ //스래드가 사용할 작업 클래스

	@Override
	public void run() { // 스레드의 시작점 메소드 역할
		methodGo();
	}
		public void methodGo() {
			while (true) {
				System.out.println("Go");
			}
		}
}
class ComeTask implements Runnable{
	public void methodCome() {
		while (true) {
			System.out.println("Come");
		}
	}
	@Override
	public void run() {
		methodCome();
	}
	
}

public class Ex08 {

	public static void main(String[] args) {
		//멀티 스레드 사용방법 두가지
		//두번째 방법:java.lang.Runnable 인터페이스를 구현한 클래스 정의함
		//		   -> 스레드 객체가 사용할 작업내용을 가진 클래스
		
		GoTask goTask = new GoTask();
		ComeTask comeTask = new ComeTask();
		
		
		Thread thread1 = new Thread(goTask);
		Thread thread2 = new Thread(comeTask);
		
		// 스레드 종류 두 가지
		// 1. 일반 스레드 : 일반스레드가 한 개라도 남아 있으면 프로그램이 종료되지 않음
		//				 일반스레드가 하나도 없으면 프로그램이 종료됨
		// 2. 데몬 스레드 : 일반스레드가 모두 종료되면 데몬스레드가 실행중이라도 프로그램이 종료됨
		//				 보조스레드라고도 불림 (백그라운드 작업에 주로 데몬스레드를 사용함)
		thread1.setDaemon(true); //기본값 false임
		thread2.setDaemon(false); //기본값 false임
		//...
		
		thread1.start();
		thread2.start();
	}//main

}
