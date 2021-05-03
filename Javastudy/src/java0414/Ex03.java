package java0414;

//	텔레비전 클래스 Tv
// 	멤버변수
//	전원 상태 on/off boolean
//	채널정보 정수형 channel

//메소드
// 전원 켜고 끄기
//poweOnoff()  false - > true -> false

//channelUp()	 채널 1 증가
//channerlDown() 채널 1 감소

class Tv {
	boolean power;	//기본값 false
	int channel;	//기본값 0

	void powerOnoff() {
		if (power == false) {
			power = true;
		} else {
			power = false;
		}
		
		// power = (power == true)? false : true; 
		
		// power = !power;
		
	} //powerOnOff
	void channelUp() {
		channel ++;
	}
	void channelDown() {
		channel --;
	}
	
}
//클래스는 프로그램이 시작하자마자 생성된다
public class Ex03 {

	public static void main(String[] args) {
		// Tv 객체 생성 tv
		Tv tv = new Tv();
		// 전원 켜기
		tv.powerOnoff(); //코드 오류를 줄이기 위해(값 변경 권한은 객체 내부에서 가지고 있게 만든다)
		// 전원 현재상태 출력
		System.out.println(tv.power);
		// 채널 올리기
		tv.channelUp();
		// 채널 올리기
		tv.channelDown();
		// 채널 현재값 출력
		System.out.println("현재 채널값: " + tv.channel);
		// 채널 내리기
		tv.channel--;
		// 채널 현재값 출력
		System.out.println("현재 채널값: " + tv.channel);
		

	}

}
