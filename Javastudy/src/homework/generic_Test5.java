package homework;

import java.util.ArrayList;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class Student {
	private String name;
	private String major;
	private int stu_Num;
	private double avg;

}

public class generic_Test5 { //5(1)번

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();

		System.out.println("학생 이름,학과,학번,학점평균 입력하세요");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String stu = sc.nextLine();
			String[] stuArr = stu.split(",");
			for (int j = 0; j < 4; j++) {
				stuArr[j] = stuArr[j].trim();
			}
			Student student =new Student(stuArr[0], stuArr[1], Integer.parseInt(stuArr[2]), Double.parseDouble(stuArr[3]));
			list.add(student);
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("--------------------------");
			System.out.println("이름:" + list.get(i).getName());
			System.out.println("학과:" + list.get(i).getMajor());
			System.out.println("학번:" + list.get(i).getStu_Num());
			System.out.println("학점평균" + list.get(i).getAvg());
		}
		System.out.println("--------------------------");
		while (true) {
			System.out.print("학생 이름 >> ");
			String name = sc.next();
			if (name.equals("그만")) {
				break;
			}
			for (Student stu : list) {
				if (stu.getName().equals(name)) {
					System.out.print(
							stu.getName() + ", " + stu.getMajor() + ", " + stu.getStu_Num() + ", " + stu.getAvg());
				}
			}
			System.out.println();
		} // while

	}// main

}//
