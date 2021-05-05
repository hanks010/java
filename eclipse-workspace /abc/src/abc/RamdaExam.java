package abc;

public class RamdaExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(()-> {
				for(int i =0; i< 10; i++) {
					System.out.println("hello");
				}
		}).start();
	}

}
