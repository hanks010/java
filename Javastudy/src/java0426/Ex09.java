package java0426;

public class Ex09 {

	public static void main(String[] args) {
		//스레드 클래스의 static 메소드
		Thread thread = Thread.currentThread();
		
		System.out.println(thread.getName());
		thread.setName("메인 스레드");
		System.out.println(thread.getName());
		
		System.out.println(thread.getPriority()); //우선순위 5
		
		System.out.println(Thread.MAX_PRIORITY);	//10	우선순위 높음
		System.out.println(Thread.NORM_PRIORITY);	//5		(기본값)
		System.out.println(Thread.MIN_PRIORITY);	//1 	우선순위 낮음
		
		System.out.println(Thread.MAX_PRIORITY); 	// 우선순위 설정
	
	}

}
