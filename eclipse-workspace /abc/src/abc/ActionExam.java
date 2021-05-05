package abc;

public class ActionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//		Action action = new MyAction();
	//		action.exec();
		Action action = new Action() { //추상 클래스라 객체가 생성되지는 않음	
									//해당 생성자 이름에 해당하는 클래스를 상속받은 이름없는 객체를 만듦
			@Override
			public void exec() {
				// TODO Auto-generated method stub
			System.out.println("exec");
			
		}
	  };
	  	action.exec();
	}
  }
