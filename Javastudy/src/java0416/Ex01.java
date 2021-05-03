package java0416;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Point2D{	//2차원좌표
	private int x; 
	private int y;
	
	public void ShowInfo2D() {
		System.out.println(x + ", "+ y);
	}

}
@Getter
@Setter
class Point3D extends Point2D{//3차원 좌표
	private int z;
	
	public void ShowInfo3D(){
		System.out.println(getX() + ", "+ getY()+", "+z);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//class Point3D
		Point3D point3d = new Point3D();
		
		point3d.setX(10);
		point3d.setY(20);
		point3d.setZ(30);
		
		point3d.ShowInfo2D();
		point3d.ShowInfo3D();
	}

}
