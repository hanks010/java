package java0419;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Tv {
	private int size;

	public Tv(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

@Getter
@Setter
class ColorTv extends Tv {
	private int color;

	ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}

	void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
}
@Getter @Setter
class IPTV extends ColorTv{
	private String ipAdd;
	IPTV(String ipAdd,int size, int color){
		super(size,color);
		this.ipAdd = ipAdd;
	}
	@Override
	void printProperty() {
		System.out.println("나의 IPTV는 "+ipAdd+"주소의 "+ getSize() + "인치 " + getColor() + "컬러");
	}
}

public class Ex05 {
	public static void main(String[] args) {
		ColorTv myTv = new ColorTv(32, 1024);
		myTv.printProperty();

		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}
}
