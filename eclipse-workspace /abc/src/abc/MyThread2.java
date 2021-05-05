package abc;
//일반 클래스는 다중 상속을 지원하지 않기 때문에 쓰레드를 이미 상속받고 있는 경우를 대비해
//Runnable 인터페이스를 상속받을 수 있게 만들었다 
public class MyThread2 implements Runnable {
	String str;
	public MyThread2(String str) {
		this.str = str;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<10; i++) {
			System.out.println(str);
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
