package java0420;

//인터페이스 = 가능한 역할을 나열한 명세서 = 규격
//	인터페이스 이름짓는 관례: I로 시작하거나, 또는 ~able ~가능한 형식으로 이름지음

//모든 구성요소는 자동으로 public 접근지정자가 적용됨.
	// 멤버변수는 static final 상수만 가능함
	// 메소드는 추상메소드 선언만 가능함
	// -> 클래스처럼 구체적인 요소는 가지지 않음
interface IRobot{
	int RED =1;	//public static final 생략 가능함
	int BLUE = 2;
	
	//추상 메소드
	void sayHello(); //public abstract 생략 가능
	public abstract void sayGoodbye();
}


//추상클래스
abstract class Animal{
	private String name; //동물 이름
	private String gender;//동물 성별
	private int age;	//동물 나이
	
	public abstract void speak();	//추상메소드
	
	public void sleep() {
		System.out.println("잠을 잔다");
	}
	public void eat() {
		System.out.println("먹는다");
	}
}

class DroneBot implements IRobot{

	@Override
	public void sayHello() {
		System.out.println("윙~ 도레미파솔");
	}

	@Override
	public void sayGoodbye() {
		System.out.println("삐- 솔파미레도");
	}
	
}
class Puppy extends Animal implements IRobot{

	@Override
	public void speak() {
		System.out.println("멍멍~!");
	}
	void playWithPeople() {
		System.out.println("주인이랑 함께 놀이하기");
	}
	@Override
	public void sayHello() {
		System.out.println("안녕하세요");
	}
	@Override
	public void sayGoodbye() {
		System.out.println("안녕히 가세요");
	}	
}
class Cat extends Animal{

	@Override
	public void speak() {
		System.out.println("야옹~~!");
	}
}
//수의사
class Vet{
	void giveShot(Animal animal) { //매개변수를 상위타입으로 다형성 적용
		//동물이 주사를 맞으면 운다
		animal.speak();
	}
	
	
}
public class Ex06 {

	public static void main(String[] args) {
		//참조변수는 상위타입으로 접근하는 게 다형성을 사용하는 코드
		Animal ani = new Puppy();
		ani.speak();
		System.out.println("==================");
		Vet vet = new Vet();
		Cat cat = new Cat();
		vet.giveShot(cat);
		vet.giveShot(ani);
		
		System.out.println("==================");
		
		ani.eat();	//먹기
		ani.sleep();//잠자기
		ani.speak();//소리내기
		Puppy puppy = (Puppy)ani;	//다운캐스팅
		
		IRobot iRobot = puppy; //인터페이스 타입 참조변수로 강아지객체 저장
		iRobot.sayHello();	   //로봇 기능 사용  //인사하기
		iRobot.sayGoodbye();
		System.out.println("==================");
		
		Animal[] animals = new Animal[3]; //동물객체를 3개 저장할 수 있는 배열객체 한 개 생성
		animals[0]= new Puppy();
		animals[1] = new Cat();
		animals[2] = new Puppy();
		
		for(int i =0; i< animals.length; i++) 
			animals[i].eat();	//동물들이 먹는다
		System.out.println("==================");
		
		IRobot bot = new DroneBot();
		bot.sayHello();
		bot.sayGoodbye();
	}//main

}
