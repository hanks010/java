package java0419;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
class Shape{
//클래스 Shape 도형	//부모클래스
//	멤버변수	double area //도형의 면적
	private double area;
//	메소드 getArea()	return area;	//면적 area 리턴하는 메소드
	public double area() {
		return area;
	}
}
@Getter @Setter
class Circle extends Shape{
//	클래스 Circle 원
//	멤버변수 int radius 반지름 5
	private int radius = 5;
//	메소드 getArea()	메소드 오버라이딩 // 원의 면적 구해서 리턴하는 메소드
	@Override
	public double area() {
		setArea(3.141592 * radius * radius);
		return getArea();
		
	}
}
@Getter @Setter
class Rectangle extends Shape{
	
	private int width =10;
	private int height = 10;
	@Override
	public double area() {
		setArea(width * height);
		return getArea();
		
	}
//클래스 Rectangle 사각형	//상속 Shape
//멤버변수		int width  가로 10	int height 세로 10
//메소드 getArea()	메소드 오버라이딩 // 사각형 면적 구해서 리턴하는 메소드

}
@Getter @Setter
class Triangle extends Shape{
	private int width = 10;
	private int height = 10;
//클래스	Triangle	삼각형	//상속 Shape
//멤버변수 int width 밑변 10, int height 높이 10
//메소드 getArea()	메소드 오버라이딩 // 삼각형 면적 구해서 리턴하는 메소드
	@Override
	public double area() {
		setArea(width * height /2.0);
		return getArea();
	}
	
}
public class Ex04 {
	
	//매개변수에 다형성(업캐스팅) 적용. 부모타입 매개변수를 사용함
	public static void printShape(Shape shape) {	//자식 객체들이 매개변수로 입력될 때 업캐스팅
			//instanceof 연산자: 부모타입 변수에 잡혀있는 실제 객체의 타입을 확인하는 연산자
			//객체를 기준으로 타입을 검사해서 true / false 결과로 내줌
		if(shape instanceof Circle) {
			//다운캐스팅
			Circle circle = (Circle)shape; // 자식(작은) 부모타입 = (작게) 부모(큰)타입
			System.out.print("원의 반지름은 "+circle.getRadius()+"\n");
			System.out.print("원의 면적은 "); 
	}	else if(shape instanceof Rectangle) {
		System.out.print("사각형의 면적은 ");
		//Rectangle rec = (Rectangle)shape;
	}	else if(shape instanceof Triangle) {
		System.out.print("삼각형의 면적은 ");
	}
		
		System.out.println(shape.area());	//다형성을 활용해서 기능 호출
	} //printShape
	
	public static void main(String[] args) {
		//	호출 메소드를 결정하는 방식
		//	객체의 타입과 동일한 타입의 참조변수로 접근할 때는 정적 바인딩만 발생함
		// 	정적 바인딩(static binding) : 컴파일 시점에 정해지는 바인딩(연결)
	Circle circle = new Circle();
	System.out.println("원의 면적은 "+circle.area()); //원의 면적은 78.5
	Rectangle rectangle = new Rectangle();
	System.out.println("사각형의 면적은 "+rectangle.area()); //사각형의 면적은 100.0
	Triangle triangle = new Triangle();
	System.out.println("삼각형의 면적은 "+triangle.area());
	System.out.println("=================================");
	//업캐스팅 = 다형성
	// -> 동적 바인딩이 발생함
	Shape shape; 	// 부모(상위)타입 참조변수 준비
	shape = new Circle();	// 부모타입 = 자식타입; (업캐스팅) 자동형변환
	System.out.println(shape.area());
	
	shape = new Rectangle();
	System.out.println(shape.area());
	
	shape = new Triangle();
	System.out.println(shape.area());
	
	System.out.println("=================================");
	
	//String[] strArr = new String[5];
	
	Shape[] shapeArr = new Shape[3];
	shapeArr[0] = new Circle();
	shapeArr[1] = new Rectangle();
	shapeArr[2] = new Triangle();
	
	for(Shape sh:shapeArr) {
		System.out.println("면적은 "+sh.area());
	}
	
	System.out.println("================================");
	printShape(new Circle());
	printShape(new Rectangle());
	printShape(new Triangle());
	
	}//main
}
