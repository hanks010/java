package java0419;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
class Point2D{
	private int x;
	private int y;
	
	//클래스 정의 안에 생성자 정의가 없으면 컴파일러가 자동으로 기본생성자를 아래와 같이 삽입해줌
	//Point2D() {}
	
	//클래스 정의 안에 사용자가 직접 정의한 생성자가 한 개라도 있으면 기본 생성자를 삽입하지 않음 
	Point2D(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void showInfo() {
		System.out.printf("%d, %d\n",x, y);
	}
}
// 생성자를 가지지 않는 클래스는 존재하지 않는다.
// 기본 생성자를 가지지 않은 클래스를 상속받으면
// 상속받는 클래스의 생성자 블록 첫 라인에서 자동으로 삽입해주는 super(); 기본 생성자 호출이 불가능하므로
// 개발자가 명시적으로 부모클래스의 다른 생성자를 호출할 필요가 있을 때 super 생성자 호출을 사용함
@Getter @Setter
class Point3D extends Point2D{
	private int z;
	
	Point3D(){
		super(1, 2); //컴파일러가 무조건 super(); 표현을 넣어주기 때문에, 필요하다면 super()호출을 수정해야함
		z = 3;
	}
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	@Override
	public void showInfo() {
		System.out.printf("%d, %d, %d\n",getX(), getY(), z);
		
	}
	//메소드 오버라이딩 alt + shift + s
	
}
public class Ex01 {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		p.showInfo();
		Point3D p2 = new Point3D(10,20,30);
		p2.showInfo();
	}

}
