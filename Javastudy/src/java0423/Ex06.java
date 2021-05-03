package java0423;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		//텍스트 파일 읽기
		//입력 스트림 객체 준비
		FileReader fr = null;	//입력 스트림 객체 준비
		//FileInputStream fis = null;
		try {
			//FileReader는 베이스 클래스로서 직접 외부자원 처리를 담당하는 클래스이다
			fr = new FileReader("/Users/user/Documents/work-space/Javastudy/temp/a.txt");
			//read() 메소드는 파일 등의 입력내용의 끝을 만나면 -1 음수값을 리턴해줌
			//한 번 호출될 때마다 한 개의 문자(2byte)를 int 형으로 리턴해줌
			int data; 
			while((data = fr.read())!=-1) {
			System.out.print((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}//main

}
