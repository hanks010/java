package java0408;

public class Ex02 {

	public static void main(String[] args) {
		//형변환은 호환되는 자료형 사이에서만 가능하다
		//기본자료형에서는 숫자형(정수, 실수) 사이에서 호환
		//자료형 형변환은 형변환 연산자를 사용한
		//자동 형변환	큰 기억장소 = 작은 기억장소
		//수동 형변환  작은 기억장소 = (작게)큰 기억장소
		
		int a = 10; 	//int = int
		long b = 20;	//long = int	자동 형변환
		b = a;
		//정수끼리 또는 실수끼리 형변환은 바이트 크기가 기준이 됨
		
		//a = (int)b;		int = (int)long
		//==========================================정수간 형변환		
		b = 3_000_000_000L;	//30억 (int 범위 초과)
		a= (int)b;
		System.out.println(a);
		//=========================================실수간 형변환
		float c = (float)3.14;	//float = (float)double;	
		double d = 4.56;	//double = double;
		//========================================== 
		//정수와 실수 사이에 형변환
		// 실수가 정수보다 항상 큰 타입이다. (바이트 수에 관계없음)
		int iNum = 10;
		double dNum = 2.7;
		
		dNum = iNum; //double = int
		
		long lNum = 10;
		float fNum = 2.7f;
		
		fNum = lNum; //float(큰) = long(작은)	자동형변환 일어남
		lNum = (long)fNum; //long(작은) =(long)float(큰)
		
		//=============================
		//char 문자형은 숫자형과 호환관계에 있다
		char ch = 'A';
		System.out.printf("%c -> %d\n",ch,(int)ch);
		ch = 'a';
		System.out.printf("%c -> %d\n",ch,(int)ch);
		ch = '한';
		System.out.printf("%c -> %d\n",ch,(int)ch);
	}
	

}
