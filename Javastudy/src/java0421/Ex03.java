package java0421;

public class Ex03 {

	public static void main(String[] args) {
		//Wrapper 클래스
		//	:자바 언어는 객체지향언어이므로 객체 형식으로 대상을 처리해야 되는 경우가 많다.
		//	 기본자료형의 값을 객체로 만들어 사용할 수 있도록 Wrapper 클래스들을 제공한다.
		// 기본자료형	->	클래스형
		// byte			Byte
		// short		Short
		// int			Integer
		// long			Long
		// float		Float
		// double 		Double
		// char			Char
		// boolean		Boolean
		
		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf("20");
		
		System.out.println(i1);
		System.out.println(i2);
		
		// 사용자 입력값은 항상 String 문자열 형식으로만 입력받음
		//"30"
		//문자열 -> 기본자료형을 바꾸기	
		int a = Integer.parseInt("30");
		//문자열형		-> Wrapper 객체형으로 바꾸기
		Integer i3 = Integer.valueOf("30");
		
		String str = "3.14F";
		float fNum = Float.parseFloat(str);
		System.out.println("fNum = "+fNum);
		
		//Wrapper클래스의 parse~~() 메소드가 문자열을 파싱(해석)해서 해당하는 기본자료형 값으로 리턴해줌
		//이 메소드의 사용비율이 높은 편
		System.out.println("===============================");
		
		int num1 = 10;
		int num2 = 20;
		int num3 = num1 + num2;
		System.out.println("num3 = "+num3);
		System.out.println("===============================");
		Integer intNum1 = Integer.valueOf(10);	//내부적으로 new로 객체 생성	//수동 박싱
		Integer intNum2 = Integer.valueOf(20);	//수동 박싱
		// 각 객체에서 언박싱 해서 꺼낸 int값을 다시 박싱해서 intNum3에 저장
		Integer intNum3 = Integer.valueOf(intNum1.intValue()+intNum2.intValue());
		System.out.println("===============================");
		//객체형: null도 저장이 가능하다는 장점
		Integer intNum4 = 10;	//Integer형 = int 형	자동(오토) 박싱
		Integer intNum5 = 20;	//자동(오토) 박싱
		//덧셈에서 각 객체에서 오토 언박싱 후 덧셈을 수행하고 다시 오토 박싱이 일어남
		Integer intNum6 = intNum4 + intNum5;
		System.out.println("intNum6 = " + intNum6);
		
		//배열 : 고정크기
	}//main

}
