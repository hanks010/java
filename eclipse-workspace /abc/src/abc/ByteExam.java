package abc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
		fis = new FileInputStream("src/abc/ByteExam.java");
		fos = new FileOutputStream("byte.txt");
		 
		int readCount = -1;
		byte[] buffer = new byte[512];
		while((readCount = fis.read(buffer))!= -1) {
			fos.write(readCount);
		} 
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
	}

}
