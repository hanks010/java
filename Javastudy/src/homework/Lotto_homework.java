package homework;

import java.util.HashSet;
import java.util.Iterator;

public class Lotto_homework {

	public static void main(String[] args) {
		// 로또 번호 1~45 사이의 임의의 정수 6개를 중복없이 생성하여 출력하는 프로그램을 작성해 보세요.
		HashSet<Integer> list = new HashSet<>();
		int lottoNum = 0, i = 0;
		while (list.size() < 6) {
			lottoNum = (int) (Math.random() * 45 + 1);
			list.add(lottoNum);
		}
		System.out.print("추첨된 로또 번호는 ");
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			if (i != list.size() - 1) {
				System.out.print(iter.next() + ", ");
			} else {
				System.out.print(iter.next());
			}
			i++;
		}
		System.out.println("입니다");

	}

}
