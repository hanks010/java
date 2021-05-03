package java0422;

//3D 프린터 클래스 재료 역할을 하는 파우더 클래스 
public class Powder {
	public void doPrinting() {
		System.out.println("Powder 재료로 출력");
	}

	@Override
	public String toString() {
		
		return "재료는 Powder입니다";
	}
	
}
