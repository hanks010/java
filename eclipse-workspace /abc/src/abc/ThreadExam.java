package abc;

public class ThreadExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		
		t1.start();
		t2.start();
		
		System.out.println("main end!!!");
	}

}
