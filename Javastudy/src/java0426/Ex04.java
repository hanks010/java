package java0426;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex04 {

	public static void main(String[] args) {
		//네트워크 프로그래밍
		//	URL 클래스 : URL 주소를 사용하여 여러 기능을 제공해주는 클래스
		
		try {
			URL url = new URL("http://www.naver.com/");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getPath());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
