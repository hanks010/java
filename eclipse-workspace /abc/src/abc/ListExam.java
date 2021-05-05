package abc;
/*
 리스트: 순서가 있는 자료구조, 중복도 허용한다
 */
import java.util.ArrayList;
import java.util.List;
public class ListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("kim");
		list.add("kang");
		list.add("kim");
		
		System.out.println(list.size()); 
		//list의 부모 클래스인 Collection 인터페이스가 가지고 있는 메서드
		
		for(int i=0; i<list.size();i++) {
			String str = list.get(i);
			System.out.println(str);
		}
	}

}
