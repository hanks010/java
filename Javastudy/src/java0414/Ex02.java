package java0414;


// 클래스  정의 Book(책종류)
// 책제목 문자열 title
// 책가격	 정수형 price (한권당 가격)
// 책갯수  정수 num

// 책의 총액 구해서 리턴하는 메소드 (단위가격 * num)
class Book{
	String title;
	int price;
	int num;
	int sumPrice() {
		return num * price;
	}
}




public class Ex02 {

	public static void main(String[] args) {
		//Book 사용
		
		//출력형식
		//책제목:	Java	가격: 10000	갯수 :30
		//총액: 300000
		
		//책제목: Oracle	가격: 20000	갯수 :20
				//총액: 400000
		//Book 사용
		Book book1 = new Book();
		Book book2 = new Book();
		book1.title  = "Java";
		book1.price = 10000;
		book1.num = 30;
		
		book2.title  = "Oracle";
		book2.price = 20000;
		book2.num = 20;
		
		System.out.println("책제목: "+book1.title+" 가격: "+book1.price+" 갯수: "+ book1.num);
		System.out.println("총액: "+book1.sumPrice());
		
		System.out.println("책제목: "+book2.title+" 가격: "+book2.price+" 갯수: "+ book2.num);
		System.out.println("총액: "+book2.sumPrice());
		
	}

}
