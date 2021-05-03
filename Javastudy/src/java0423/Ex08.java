package java0423;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		//Ex6 예제에 버퍼 적용하기
		//텍스트 파일 읽기
				//입력 스트림 객체 준비
				BufferedReader reader = null;
				try {
					//FileReader는 베이스 클래스로서 직접 외부자원 처리를 담당하는 클래스이다
					reader = new BufferedReader(new FileReader("/Users/user/Documents/work-space/Javastudy/temp/a.txt"));
					//readLine() 메소드는 파일 등의 입력내용의 끝을 만나면 null값을 리턴해줌
					//한 번 호출될 때마다 줄바꿈 문자(\n) 이전까지 내용을 문자열로 리턴해줌
					//줄바꿈 문자는 포함하지 않기 때문에 필요하면 줄바꿈 문자를 넣어줄 필요가 있다.
					String line;
					while((line = reader.readLine())!= null) {
					System.out.println(line);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		
	}//main

}
