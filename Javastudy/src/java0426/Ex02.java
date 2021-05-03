package java0426;

import java.io.*;
public class Ex02 {

	public static void main(String[] args) {
		
		//복사할 원본 파일명
		File srcFile = new File("/Users/user/Documents/work-space/Javastudy/temp/a.txt");
		
		//복사해서 생성할 대상 파일명
		File destFile = new File("/Users/user/Documents/work-space/Javastudy/temp/javasample/hello.txt");
		
		if(!srcFile.exists()) {
			System.out.println("복사할 대상 파일이 존재하지 않습니다");
			return;
		}
		
		//문자 입력스트림 객체 준비 (입력스트림은 버퍼가 없기 때문에 버퍼를 붙여줄 필요가 있음)
		BufferedReader reader = null;
		//문자 출력스트림 객체 준비 (출력스트림은 대부분 기본적으로 버퍼를 가지고 있음)
		FileWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(srcFile));
			writer = new FileWriter(destFile);
			String line ="";
			while((line = reader.readLine())!=null) {
				writer.write(line + "\n");
			}//while
			//출력스트림이 기본적으로 가지는 버퍼 때문에
			//write() 메소드 호출은 출력할 내용을 버퍼에 쌓아둠
			writer.flush(); //버퍼 비우기. 출력이 일어남
			
			System.out.printf("%s를 %s로 복사하였습니다 \n",srcFile.getPath(),destFile.getPath());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//스트림 객체는 사용이 끝나면 객체를 닫아줘야 함
			
			try {
				reader.close();
				writer.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
