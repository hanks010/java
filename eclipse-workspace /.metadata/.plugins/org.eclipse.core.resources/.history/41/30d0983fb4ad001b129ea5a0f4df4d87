package testbook;


public class test1 {
	public static void main(String[] args) {
		String[] text = {
				"   + -- + - + -   ",
				"   + --- + - +   ",
				"   + -- + = + -   ",
				"   + - + - + - +   "
		};
		
		solution(text);
	}//main

	public static void solution (String[] text) {
		for(int i =0; i<text.length; i++) {
			int n =Integer.parseInt(text[i].strip().replace(" ", "").replace("+","1").replace("-","0"),2);
			text[i] = String.valueOf((char)n);
			System.out.println(text[i]);
		}
		
	}

}
