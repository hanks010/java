package java0420;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Object 클래스
//	최상위 클래스, 모든 클래스는 Object를 상속함
//	클래스의 공통적인 요소를 정의
//	모든 클래스는 extends Object 표현을 가지며 생략돼있음

@Getter 
@Setter 
@ToString //toString 메소드 오버라이딩(재정의) 해줌
class Point extends Object{
	private int x;
	private int y;
	
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj ==null) {
			return false;
		}
		if(obj instanceof Point) {
			Point p = (Point)obj;
			if(this.x == p.x && this.y == p.y) {
				result = true;
			}else {
				result = false;
			}
		}else { 
			result = false;	//비교대상 Point타입 객체가 아닌 엉뚱한 타입의 객체라면 false를 반환
		}
		return result;
}	
}

public class Ex08 {

	public static void main(String[] args) {
		Point point = new Point();
		point.setX(10);
		point.setY(20);
		System.out.println(point.toString());
		System.out.println(point);	//콘솔 출력 메소드에서 참조변수만 넣으면 toString()이 자동호출됨
		
		Point point2 = new Point();
		point2.setX(10);
		point2.setY(20);
		
		System.out.println("point와 point2 객체의 내용비교 결과는 "+point.equals(point2));
		System.out.println("========================");
		//리터럴 표기법(")으로 표현된 String 객체는 [String 리터럴 테이블]에서 특별 관리함
		//리터럴 표기법으로 문자열 객체를 표현하면
		//문자열 관리 테이블에서 기존에 존재하는 문자열인지를 매번 확인해서
		//이미 동일한 내용의 문자열이 있으면 그 객체를 사용함
		String str1 = "안녕";
		String str2 = "안녕";

		if(str1 == str2) { //각 객체의 주소값 비교. 내용비교는 아님에 주의
			System.out.println("두 문자열이 같다");	//출력, 주소값이 같기 때문
		}else {
			System.out.println("두 문자열이 다르다");
		}
		
		String str3 = new String("반가워");
		String str4 = new String("반가워");
		if(str3 == str4) { //각 객체의 주소값 비교
			System.out.println("두 문자열이 같다");	//내용비교는 아님에 주의
		}else {
			System.out.println("두 문자열이 다르다");
		}
		//문자열 내용 비교는 문자열 객체의 equals() 메소드로 비교함
		if(str3.equals(str4)) {
			System.out.println("두 문자열이 같다");	//출력
		}else {
			System.out.println("두 문자열이 다르다"); 
		}
		

	}//main
	
}
