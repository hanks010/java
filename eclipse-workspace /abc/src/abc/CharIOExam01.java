package abc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = null;
		while(true) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//키보드로부터 한 줄씩 입력받을 수 있도록 함
		try {
			line = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(line.equals("q")) 
			break;
		System.out.println(line);
		}	
	}

}
