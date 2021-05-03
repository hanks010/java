package java0416;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Point2Dv {	//2차원좌표
	private int x; 
	private int y;
	
	public String getInfo() {
		//System.out.print(x + ", "+ y);
		return x + ", "+ y;
	}

	
}
@Getter
@Setter
class Point3Dv extends Point2Dv{//3차원 좌표
	private int z;
	

	//showInfo 메소드 재정의 x, y, z 출력
	@Override
	public String getInfo(){
		//super.ShowInfo();
		//System.out.print(", "+z);
		//System.out.println(getX() + ", "+ getY()+", "+z);
		return super.getInfo()+ ", "+z; 	//注意
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Point3Dv p3d = new Point3Dv();
		p3d.setX(10);
		p3d.setY(20);
		p3d.setZ(30);
		System.out.println(p3d.getInfo());
		

	}

}
