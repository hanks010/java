package java0423;

class A {
	public void methodA(B b) {
		System.out.println("methodA() 호출됨");
		C c = new C();
		try {
			b.methodB(c);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("methodA() 종료됨");
	}
}

class B {
	public void methodB(C c) throws Exception {
		System.out.println("methodB() 호출됨");
		c.methodC(-10);
		System.out.println("methodB() 종료됨");
	}
}

class C {
	public void methodC(int num) throws RuntimeException, Exception{
		System.out.println("methodC() 호출됨");
		if(num <100) {
			   throw new Exception("num값이 100보다 작으면 동작이 안됩니다");
		}
		System.out.println("methodC() 종료됨");
	}
}

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("===프로그램 시작됨===");
		A a = new A();
		B b = new B();
		C c = new C();
		try {
		a.methodA(b);
		}catch (Exception e) {
			e.printStackTrace();
		}
		// 실행문...
		System.out.println("===프로그램 정상 종료됨===");
	}// main
}
