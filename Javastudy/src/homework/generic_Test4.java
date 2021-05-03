package homework;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class generic_Test4 {	//4번

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> vector = new Vector<>();
		int sum = 0, avg = 0;
		
		while (true) {
			System.out.print("강수량 입력(0 입력시 종료)>>");
			int pre = sc.nextInt();
			if (pre == 0) {
				break;
			}
			vector.add(pre);
			sum +=pre;
			
			for (int v : vector) {
				System.out.print(v + " ");
			}
			System.out.println();
			
			avg = sum/vector.size();
			
			System.out.print("현재 평균 "+avg);
			System.out.println();
		}

	}

}
