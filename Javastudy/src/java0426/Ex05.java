package java0426;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.omg.CORBA.portable.InputStream;

public class Ex05 {

	public static void main(String[] args) {
		//네트워크 프로그래밍
		//	URL 클래스 : URL 주소를 사용하여 여러 기능을 제공해주는 클래스
		BufferedReader reader = null;
		StringBuilder sb = new StringBuilder(); //문자열 버퍼 객체
		try {
			//입력스트림 준비
			URL url = new URL("http://www.naver.com/");
			reader = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
			
			String line = "";
			while((line = reader.readLine())!=null) {
				sb.append(line +"\n");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sb.toString());
		
	}

}
