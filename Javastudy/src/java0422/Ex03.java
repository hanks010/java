package java0422;

public class Ex03 {

	public static void main(String[] args) {
		
		ThreeDPrinter printer =  new ThreeDPrinter();
		
		Powder powder = new Powder();
		printer.setMaterial(powder); //자동 형변환(업캐스팅
		printer.getMaterial();
		
		Powder powder2 = (Powder)printer.getMaterial();	//자식(작은)타입 = (작게) 부모(큰)타입
		
		System.out.println("==========================");
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder3 = powderPrinter.getMaterial();
		System.out.println(powderPrinter.toString());
	
		System.out.println("==========================");
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter.getMaterial());
		
	
	}//main



}
