package java0420;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Account {
	public static int total; // 숫자는 기본값 0으로 초기화

	public static void printTotal() {
		// total 출력
		System.out.println("total = " + total);
	}

//================================	
	private int count; // 숫자는 기본값 0으로 초기화

	Account(int num) {
		total += num;
		count += num;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		System.out.println(Account.total);
		Account.printTotal();

		// 객체생성 acc1
		Account acc1 = new Account(10);
		System.out.println(Account.total);
		System.out.println(acc1.getCount());
		System.out.println("========================");
		// 객체생성 acc2
		Account acc2 = new Account(10);
		System.out.println(Account.total);
		System.out.println(acc1.getCount());
		System.out.println("========================");
		// 객체생성 acc3
		Account acc3 = new Account(10);
		System.out.println(Account.total);
		System.out.println(acc1.getCount());
	}

}
