package abc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
Set: 중복을 허용하지 않는다
 */
public class setExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<>();
		boolean flag1 = set1.add("Kang");
		boolean flag2 = set1.add("Kim");
		boolean flag3 = set1.add("Kang");
		
		System.out.println(set1.size());
		
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		System.out.println();
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) { //요소가 있으면 계속해서 찾음
			String str = iter.next();
			System.out.println(str);
		}
	}

}
