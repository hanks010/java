package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class generic_Test5_2 { // 5(2)번

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Student> hm = new HashMap<>();

		System.out.println("학생 이름,학과,학번,학점평균 입력하세요");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String stu = sc.nextLine();
			String[] stuArr = stu.split(",");
			for (int j = 0; j < 4; j++) {
				stuArr[j] = stuArr[j].trim();

			}
			Student student = new Student(stuArr[0], stuArr[1], Integer.parseInt(stuArr[2]),
					Double.parseDouble(stuArr[3]));
			hm.put(student.getName(), student);
		}
		//-----------------------------------------------------------------------------1
		Set<String> keyNames = hm.keySet();//Set에 키로 구성된 키셋을 저장
		
		for (String name : keyNames) { //keySet에서 for:each문을 이용해 키 요소를 하나씩 빼와서 사용, 출력
			Student student = hm.get(name);
			System.out.println("--------------------------");
			System.out.println("이름:" + student.getName());
			System.out.println("학과:" + student.getMajor());
			System.out.println("학번:" + student.getStu_Num());
			System.out.println("학점평균:" + student.getAvg());
		}
		System.out.println("--------------------------");
		//-----------------------------------------------------------------------------2
		keyNames = hm.keySet();		//Set에 키로 구성된 키셋을 저장
		Iterator<String> iter = keyNames.iterator(); //키셋을 iterator에 저장
		//Iterator<String> iter = hm.keySet().iterator(); //위 두 줄을 한 줄로 축약 가능
		while(iter.hasNext()) {	//iterator 사용하여 키 값을 하나씩 받아온 뒤 키 값을 이용해 value값 얻어옴
			String key = iter.next();
			Student stu = hm.get(key);
			System.out.println("--------------------------");
			System.out.println("이름:" + stu.getName());
			System.out.println("학과:" + stu.getMajor());
			System.out.println("학번:" + stu.getStu_Num());
			System.out.println("학점평균:" + stu.getAvg());
		}
		System.out.println("--------------------------");
		//-----------------------------------------------------------------------------3
		Set<Map.Entry<String, Student>> set = hm.entrySet(); //Set에 key,value 쌍으로 된 entrySet을 저장
		Iterator<Map.Entry<String, Student>> entryIter = set.iterator();	//entrySet을 iterator에 저장
		// Iterator<Map.Entry<String, Student>> entryIt = hm.entrySet().iterator(); //위의 두 줄을 한 줄로 축약
		while(entryIter.hasNext()) {
			Map.Entry<String, Student> entry = entryIter.next();	//entrySet이 저장된 iterator로 요소접근을 통해 key,value 한 쌍의 entrySet을 가져옴
			String key = entry.getKey();		//한 쌍의 entrySet에서 키 값 가져옴
			Student value = entry.getValue();	//한 쌍의 entrySet에서 value 값 가져옴
			System.out.println("--------------------------");
			System.out.println("이름: "+value.getName());
			System.out.println("학과:" + value.getMajor());
			System.out.println("학번:" + value.getStu_Num());
			System.out.println("학점평균:" + value.getAvg());
		}
		System.out.println("--------------------------");
		
		while (true) {
			System.out.print("학생 이름 >> ");
			String name = sc.next();
			if (name.equals("그만")) {
				break;
			}
			if (hm.containsKey(name)) {
				Student student = hm.get(name);
				System.out.print(student.getName() + ", " + student.getMajor() + ", " + student.getStu_Num() + ", "
						+ student.getAvg());
			}
			System.out.println();
		} // while

	}// main
}
