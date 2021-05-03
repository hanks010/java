package java0423;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ec07 {

	public static void main(String[] args) {
		//문자세트를 직접 지정해서 텍스트 파일 읽기
		InputStreamReader reader = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("/Users/user/Documents/work-space/Javastudy/temp/b.txt"); //베이스 클래스
			reader = new InputStreamReader(fis,"UTF-8");
			
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}//main

}
