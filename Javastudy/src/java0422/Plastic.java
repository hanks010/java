package java0422;

//3D 프린터 클래스 재료 역할을 하는 파우더 클래스 
public class Plastic {
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력");
	}

	@Override
	public String toString() {
		
		return  "재료는 Plastic 입니다";
				}
	
}
