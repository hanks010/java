package abc;

public class ThreadA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			try {
				System.out.println("b가 완료때까지 기다립니다");
				b.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is : "+b.total);
		}
	}

}
