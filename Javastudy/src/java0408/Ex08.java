package java0408;

public class Ex08 {

	public static void main(String[] args) {
		// 단항연산자:++ -- 증감
		// ++ 1증가, -- 1감
		int a =0;
		a = a+1; //a변수에 두 번 접근 
		System.out.println("a = " + a);
		
		a++;	//a 변수에 한 번 접근 -> 성능적으로 우수
		System.out.println("a = " + a);
		
		a--;
		System.out.println("a = " + a);
		//===========================
		// ++변수 :1증가를 제일 먼저 수행하고, 다른 연산을 수행함
		// 변수++ :다른 연산을 다 수행한 다음에, 마지막에 변수 1을 증가시킴
		
		a = 0;
		int b = 0;
		System.out.println("++a :"+ (++a));
		System.out.println("b++ :"+ (b++));
		System.out.println("a : "+a); //1
		System.out.println("b : "+b);
		
		a = b = 0; //0이 b에 먼저 저장, b에 있는 값을 a에 저장
		int sum = 0;
		sum = ++a + ++b;
		System.out.println("++a +++b: "+ sum);
		a = b = sum = 0; 
		sum = a++ + b++;
		System.out.println("a++ + b++: "+ sum);
	}//main

}
