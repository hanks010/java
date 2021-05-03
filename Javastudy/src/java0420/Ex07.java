package java0420;

abstract class AbsTest1 {}
abstract class AbsTest2{}

interface ITest1{
	void iTest1Method();
}
interface ITest2{
	void iTest2Method();
}
interface ITest3 extends ITest1,ITest2{	//인터페이스끼리는 다중상속 가능
	public void iTest3Method();
}
class SubTest extends AbsTest1 implements ITest1{

	@Override
	public void iTest1Method() {
		System.out.println("iTest1Method()");
	}
}
class SubTest2 /*extends Object*/ implements ITest1,ITest2{	//다중상속 개념에 해당함

	@Override
	public void iTest1Method() {
		System.out.println("iTest1Method()");
	}

	@Override
	public void iTest2Method() {
		System.out.println("iTest2Method");
	}
}
class SubTest3 implements ITest3{

	@Override
	public void iTest1Method() {
		System.out.println("iTest1Method()");
	}

	@Override
	public void iTest2Method() {
		System.out.println("iTest2Method");
	}

	@Override
	public void iTest3Method() {
		System.out.println("iTest3Method");
	}
	
}
public class Ex07 {

	public static void main(String[] args) {
		
	}

}
