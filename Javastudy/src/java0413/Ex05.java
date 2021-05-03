package java0413;

public class Ex05 {

	public static void hello() {
		System.out.println("Hello Java");
	}	//hello
	public static void printSum(final int a,final int b) {	//final 선언으로 매개변수 상수화
		System.out.println(a+"+"+b+"="+ (a+b));
	}
	public static int getAbs(int n) {
		if(n < 0) {
			n = -n;
		}
			//return n;
			
			return (n <0) ? -n : n;
	
	}
	public static int getMax(int a, int b) {
		if(a > b) {
			return a;
		}
		else if(b > a) {
			return b;
		}
		else {
			System.out.print("두 수는 같습니다 ");
			return b;
		}
		
		//int result 리턴에 사용할 변수 사용
		// return (a > b) ? a : b;
	}//getMax
	public static int getSum(int n) {
		int sum = 0;	// 누적합을 저장할 변수 0으로 초기화
		for(int i = 1; i<=n; i++) {
			sum +=i;
		}
		return sum;
	}//getSum
	public static void main(String[] args) {
		//함수 호출 
		//hello() 호출하면 "Hello Java" 출력함
		hello();
		//printSum(10,20) 호출하면 "10+20= 30" 출력함
		printSum(10,20);
		//getAbs(-5) 호출하면 절대값을 구해서 리턴해줌
		System.out.println("-5의 절대값: "+getAbs(-5));
		//getMax(10, 20) 호출하면 큰 값을 리턴해줌
		System.out.println("10과 20 중 더 큰 값: "+getMax(10, 20));
		System.out.println(getMax(10,10));
		//getSum(10) 호출하면 1부터 입력값까지의 누적합을 구해서 리턴해줌
		System.out.println("1부터 10까지 누적합: "+getSum(100));
	}

}
