package abc;

public class BizExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BizService biz = new BizService();
		
		biz.bizMethod(1);
		try{
		biz.bizMethod(-3);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
