package java0422;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
class Person {
	private String name;
	private int age;
	private String address;

}

public class Ex05 {

	public static void main(String[] args) {
		// List에 제네릭 타입 적용하기
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("홍길동",20,"부산"));
		personList.add(new Person("성춘향",18,"서울"));
		personList.add(new Person("이몽룡",22,"대전"));
		
		System.out.println(personList);
		System.out.println("======================================");
		
		for(int i =0; i<personList.size(); i++) {
			Person person = personList.get(i);
			System.out.println(person);
		}
		System.out.println("======================================");
		//반복자 표현으로 접근하기
		Iterator<Person> iter =personList.iterator();
		
		while(iter.hasNext()) {
			Person person = iter.next();
			System.out.println(person);
		}
		System.out.println("======================================");
		for(Person person :personList) {
			System.out.println(person);
		}
	}// main

}
