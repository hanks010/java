package java0426;

class Go{
	public void methodGo() {
		while(true) {
		System.out.println("Go");
		}
		}
}
class Come{
	public void methodCome() {
		while(true) {
		System.out.println("Come");
		}
		}
}
public class Ex06 {

	public static void main(String[] args) {
		//스레드(Thread)
		Go go = new Go();
		Come come = new Come();
		
		//Go 객체의 methodGo()와 Come 객체의 methodCome()을 병렬로 호출하려고 함
		go.methodGo();
		come.methodCome();
	}

}
