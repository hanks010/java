package abc;

public class JoinExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5 thread = new MyThread5();
		thread.start();
		
		System.out.println("시작");
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("종료");
	
	}

}
