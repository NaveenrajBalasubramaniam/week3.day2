package week3.day2;

public class Automation extends MultipleLanguage implements Language, TestTool{

	public void ruby() {
		System.out.println("Ruby is a lanuage");
	}
	public void selenium() {
		System.out.println("Selenum is a test tool");
	}
	public void java() {
		System.out.println("Java is a language");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation automtion = new Automation();
		automtion.ruby();
		automtion.python();
		automtion.selenium();
		automtion.java();
	}

}
