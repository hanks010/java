package abc;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.*;
public class ByteExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
		DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
		){
		out.writeInt(100);
		out.writeBoolean(true);
		out.writeDouble(50.5);
		}catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
