package java0420;

//final 키워드
//final class.	final method.	final variable
/*final*/ class FinalTest{	//상속 못하게 막아줌
	private static final int a =10; //final: 멤버변수 값 변경 못하게함. 변수의 상수화
	
	public/* final */void showInfo() { //final: 메소드 오버라이드(재정의)못하게 막아줌
		System.out.println("FinalTest의 showInfo() 호출");
	}
}
class FinalTest2 extends FinalTest{

	@Override
	public void showInfo() {
		System.out.println("FinalTest2의 showInfo() 호출됨");
	}
	
}
public class Ex04 {

	public static void main(String[] args) {
		
	}

}
