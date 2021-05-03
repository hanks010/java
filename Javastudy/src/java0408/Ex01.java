package java0408;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//%d(decimal)	%f	%l %s		
		System.out.print("안녕 \n");
		System.out.print("안녕 \n\n");
	
		
		int a = 10; int b = 20;
		
		
		System.out.println("a = "+a );
		System.out.printf("a = %d\n",10);
		
		System.out.println("a = "+a+", b = "+b);
		System.out.printf("a = %d, b = %d\n",a,b);
		
		double c = 3.14, d = 4.56;
		System.out.println("c = "+c+", d = "+d);
		System.out.printf("c = %.2f, d = %.2f\n",c,d);
		
		char ch ='한';
		System.out.printf("문자: %c\n", ch);
		
		String str = "동해물과 백두산이 ";
		System.out.printf("문자열: %s", str);
		
		//변수 이름 짓는 규칙
		//변수 이름은 특수문자 _$ 두개만 가능
		//변수 이름은 숫자로 시작할 수 없다
		//변수 이름은 알파벳 소문자로 시작하는 게 관례다
		//변수 이름은 한글은 안 쓰는 게 관례
		
		final int MY_HEIGHT = 170; 	//C언어의 const와 동일, 첫 선언 이후 변경불가

	}//main

}
