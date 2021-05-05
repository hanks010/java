package abc;
/*import java.util.Calendar;
public class CalenderExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		cal.add(Calendar.HOUR, 5);
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		cal.add(Calendar.HOUR, 5);
		
	}

}*/
import java.util.*;

public class CalendarExam{
    public String hundredDaysAfter(){
        //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DATE,100);
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH)+1;
    int date = cal.get(Calendar.DATE);
    String now = year+"년"+month+"월"+date+"일";
    return now;
    }
    public static void main(String[] args){
    CalendarExam ce = new CalendarExam();
    System.out.println(ce.hundredDaysAfter());
}
}
