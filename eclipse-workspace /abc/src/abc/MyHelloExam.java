package abc;

import java.lang.reflect.Method;

public class MyHelloExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myhello hello = new Myhello();
		
		try {
			Method method = hello.getClass().getDeclaredMethod("hello");
			if(method.isAnnotationPresent(Count100.class)) { //Count 100의 어노테이션이 적용되었는지 확인
			for(int i =0; i<100; i++) {
				hello.hello();
			}
				
			}else {
				hello.hello();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
