package java0426;

import java.io.*;
public class Ex3 {

	public static void main(String[] args) {
		
		//복사할 원본 파일명
		File srcFile = new File("/Users/user/Documents/work-space/Javastudy/temp/aaa.png");
		
		//복사해서 생성할 대상 파일명
		File destFile = new File("/Users/user/Documents/work-space/Javastudy/temp/javasample/hello.txt");
		
		if(!srcFile.exists()) {
			System.out.println("복사할 대상 파일이 존재하지 않습니다");
			return;
		}
		
		//바이트 입력스트림 객체 준비 (입력스트림은 버퍼가 없기 때문에 버퍼를 붙여줄 필요가 있음)
		BufferedInputStream bis = null;
		//바이트 출력스트림 객체 준비 (출력스트림은 대부분 기본적으로 버퍼를 가지고 있음)
		FileOutputStream fos = null;
		
		//문자 입력스트림 객체 준비 (입력스트림은 버퍼가 없기 때문에 버퍼를 붙여줄 필요가 있음)
		BufferedReader reader = null;
		//문자 출력스트림 객체 준비 (출력스트림은 대부분 기본적으로 버퍼를 가지고 있음)
		FileWriter writer = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(srcFile));
			fos = new FileOutputStream(destFile);
			int data;
			while((data = bis.read())!=-1){	//파일끝을 만나면 -1을 리턴함
				fos.write(data);
		}//while
			
			//출력스트림이 기본적으로 가지는 버퍼 때문에
			//write() 메소드 호출은 출력할 내용을 버퍼에 쌓아둠
			fos.flush(); //버퍼 비우기. 출력이 일어남
			
			System.out.printf("%s를 %s로 복사하였습니다 \n",srcFile.getPath(),destFile.getPath());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//스트림 객체는 사용이 끝나면 객체를 닫아줘야 함
			
			try {
				bis.close();
				fos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
