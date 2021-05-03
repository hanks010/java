package java0423;
import java.io.*;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		//키보드로 입력받은 내용을 텍스트 파일로 쓰기
		Scanner sc = new Scanner(System.in);	//키보드 입력스트림 객체 준비
		//텍스트 파일 출력스트림 객체 준비
		//출력스트림은 내부적으로 항상 버퍼를 가지고 있어서
		//출력스트림 객체를 닫거나, 버퍼를 비워야만 출력이 일어남
		FileWriter fw = null;
		try {
			//두 번째 인자가 true이면 기존 내용이 있을 때 뒤에 내용 추가(append)
			fw = new FileWriter( "/Users/user/Documents/work-space/Javastudy/temp/c.txt", false);
			System.out.println("/q 입력하면 종료합니다");
			System.out.println("텍스트 파일로 출력할 내용을 키보드로 입력해보세요");
			while(true) {
			String line = sc.nextLine();	//\n은 내용에 포함되지 않고 가져온다.
			//StringBuilder에 모아서 출력가능
			if(line.equals("/q")) {
				break;
			}
			fw.write(line +"\n");
			
			}
			//fw.flush();
			//출력스트림 객체의 버퍼 안의 내용을 비우기 -> 출력이 발생
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();	//출력스트림 객체 닫으면 내부적으로 flush() 자동 호출됨
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("===프로그램 정상 종료===");
		
	}//main

}
