package java0415;

	class CarAudio{
		
	}

	class Engine{
		
	}
	//포함관계(has a 관계) : 자동차는 차번호, 엔진, 카오디오를 포함한다.
public class MyCar {
	//포함할 대상을 멤버변수(필드) 로 선언
	String carNum = "부산1234";
	Engine engine;
	CarAudio carAudio;
	
	public MyCar(){
		engine = new Engine();
	}
	//게터(확인자 메소드) 세터(수정자 메소드) 자동완성 단축기 alt +shift + s

	void setCarAudio(CarAudio carAudio) {
		this.carAudio = carAudio;
	}

	void setEngine(Engine engine) {
		this.engine = engine;
	}
}
