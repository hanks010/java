package backjun;

import java.util.Scanner;
/*
 * 21/04/11
 * Integer.parseInt(str)
 * 	str.charAt(index)	//index의 인덱스에 해당하는 문자를 가져온다 
 */
public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		int rev_num1=0 , rev_num2 = 0;
		char[] n1 = new char[3];
		char[] n2 = new char[3];
		char tmp =' ';
		
		for(int i =0; i<3; i++) {	//입력받은 숫자를 하나씩 문자배열에 저장
			n1[i]= num1.charAt(i);
			n2[i]= num2.charAt(i);
		}
		num1 ="";
		num2 ="";
		tmp = n1[0];	n1[0] = n1[2];	n1[2] = tmp;
		tmp = n2[0];	n2[0] = n2[2];	n2[2] = tmp;
		
		for(int i =0; i<3; i++) {
			num1 += n1[i];
			num2 += n2[i];
		}

		rev_num1 = Integer.parseInt(num1);
		rev_num2 = Integer.parseInt(num2);
		
		if(rev_num1 > rev_num2)
			System.out.println(rev_num1);
		else
			System.out.println(rev_num2);
		
	}//main
}
