package java0416;
import lombok.Getter;
//클래스 Tv
//멤버변수 정수형 channel
//메소드 void channelUp() 채널값 1 증가
//메소드 void channelDown() 채널값 1 감소
import lombok.Setter;

//클래스 CaptionTv (자막기능 TV) 상속 Tv
// 멤버변수 boolean isCaptionOn	자막상태
// 메소드 	void displayCaption	"자막상태: true/false"
@Getter
@Setter
class Tv{
	private int channel;
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		 channel--;
	 }
}
@Getter
@Setter
class CaptionTv extends Tv{
	private boolean isCaptionOn;
	public void displayCaption() {
		if(isCaptionOn) {
			System.out.println("자막상태 On");
		}else {
			System.out.println("자막상태 Off");
		}
	}
}
public class Ex02 {

	public static void main(String[] args) {
		CaptionTv capTv = new CaptionTv();
		
		System.out.println("현재 채널값은 "+ capTv.getChannel());
		capTv.displayCaption();
		
		capTv.setChannel(11);
		capTv.channelUp();
		capTv.setCaptionOn(true);
		System.out.println("현재 채널값은 "+ capTv.getChannel());
		capTv.displayCaption();
	}

}
