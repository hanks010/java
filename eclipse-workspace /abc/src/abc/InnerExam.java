package abc;

public class InnerExam {
	class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerExam t = new InnerExam();
		InnerExam.Cal cal = t.new Cal();
	}

}
