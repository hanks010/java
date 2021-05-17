package mem;

public class Test1 {
	
	static int num = 1;
	int sum = 10;
void hello() {
	int sum = 10;
}
	public static void main(String[] args) {
		int minus = 20;

		Test1 t = new Test1();
		//minus 못 찾음
		t.hello();
		//minus 못 찾음
	}//main 메서드 종료 - JVM 종료
}
