package backjun;

import java.util.Scanner;

public class alarm_clock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H, M;
		H = sc.nextInt();
		M = sc.nextInt();

		if (M >= 45)
			System.out.println(H + " " + (M - 45));
		else if (H == 0)
			System.out.println(23 + " " + (60 - (45 - M)));
		else
			System.out.println((H - 1) + " " + (60 - (45 - M)));
	}
}
