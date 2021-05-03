package java0414;

public class Ex05 {

	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p.x + ", "+ p.y);
		
		p.x = 10;	//멤버변수 x를 10으로 수정
		p.y = 20;
		
		p.showData();
		
		p.setX(100); //멤버변수 x를 100으로 수정(메소드 방식)
		System.out.println("=================");
		
		Point p2 = new Point(300);
		p2.showData();
		System.out.println("=================");
		
		Point p3 = new Point(400, 500);
		p3.showData();
	}//main
}
