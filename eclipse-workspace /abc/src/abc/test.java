package abc;

public class test {

		public int plus(int x, int y) {
			return x +y;
		}
		
		String name;
		int number;
		
		public test(String name) {
			this.name = name;	//this - 객체 자신을 참조하는 키워드
	}
		public test() {
			//this.name ="이름없음";
			//this.number = 0;
			this("이름없음",0);
		}
		public test(String name, int number) {
			this.name = name;
			this.number = number;
		}
	
}

