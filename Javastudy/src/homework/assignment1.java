package homework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Point2 {
	private int x, y;

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

@Getter
@Setter
class ColorPoint2 extends Point2 {

	private String color;

	ColorPoint2() {
		super(0, 0);
		color = "BLACK";
	}

	ColorPoint2(int x, int y) {
		super(x, y);
	}

	ColorPoint2(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		setX(x);
		setY(y);
	}

	@Override
	public String toString() {
		return color + "색의 (" + getX() + "," + getY() + ")의 점";
	}
}

@Getter
@Setter
class Point23D extends Point2 {

	private int z;

	Point23D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public void moveUp() {
		z++;
	}

	public void moveDown() {
		z--;
	}

	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + "," + z + ")의 점";
	}
}

class PositivePoint2 extends Point2 {

	PositivePoint2() {
		super(0, 0);
	}

	PositivePoint2(int x, int y) {
		super(x, y);
		if (getX() < 0 && getY() < 0) {
			setX(0);
			setY(0);
		}
	}

	@Override
	public void move(int x, int y) {
		if (x > 0 && y > 0) {
			super.move(x, y);
		}
	}

	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ")의 점";
	}

}

public class assignment1 {

	public static void main(String[] args) {
		ColorPoint2 cp = new ColorPoint2(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다");
		System.out.println("==============================5번");
		ColorPoint2 zeroPoint2 = new ColorPoint2();// (0,0)위치의 BLACK 색 점
		System.out.println(zeroPoint2.toString() + "입니다");
		cp = new ColorPoint2(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다");
		System.out.println("==============================6번");
		Point23D p = new Point23D(1, 2, 3); // 1,2,3은 각각 x,y,z축의 값.
		System.out.println(p.toString() + "입니다");

		p.moveUp(); // z축으로 위쪽 이동
		System.out.println(p.toString() + "입니다");

		p.moveDown(); // z축으로 아래쪽 이동
		p.move(10, 10); // x,y 축으로 이동
		System.out.println(p.toString() + "입니다");

		p.move(100, 200, 300); // x, y, z 축으로 이동
		System.out.println(p.toString() + "입니다");
		System.out.println("==============================7번");
		PositivePoint2 p1 = new PositivePoint2();
		p1.move(10, 10);
		System.out.println(p1.toString() + "입니다");

		p1.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p1.toString() + "입니다");

		PositivePoint2 p2 = new PositivePoint2(-10, -10);
		System.out.println(p2.toString() + "입니다");
		System.out.println("==============================8번");
	}// main
}
