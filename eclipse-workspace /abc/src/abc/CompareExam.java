package abc;

public class CompareExam {
	public static void exec(Compare compare) {
		int k = 10;
		int m = 20;
		int value = compare.compareTo(k,m);
		System.out.println(value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exec((i,j)->{
			return i-j;
		});
	}

}
