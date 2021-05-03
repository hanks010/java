package java0414;

public class Ex04 {

	public static void main(String[] args) {
		// 생성자(constructor) : 생성된 객체의 상태(멤버변수)를 초기화하는 역할이다
		Student stu1 = new Student();
		stu1.name = "이몽룡";
		stu1.hakbun = 10;
		System.out.println(stu1.name);
		System.out.println(stu1.hakbun);
		
		stu1.scores[0] = 100;
		stu1.scores[1] = 85;
		stu1.scores[2] = 90;
		
		System.out.println(stu1.name + "의 총점은 "+stu1.getSum());
		System.out.println(stu1.name + "의 총점은 "+stu1.getAvg());
		System.out.println("============================");
		
		Student stu2 = new Student();
		stu1.name = "성춘향";
		stu1.hakbun = 20;
		
		stu1.scores[0] = 90;
		stu1.scores[1] = 87;
		stu1.scores[2] = 76;
		System.out.println(stu1.name + "의 총점은 "+stu1.getSum());
		System.out.println(stu1.name + "의 총점은 "+stu1.getAvg());
	}//main

}
