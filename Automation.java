
public class Automation extends MultipleLanguage implements Language, TestTool {

	public void ruby()
	{
		System.out.println("ruby inside imeplemented class");
	}
	
	public void java()
	{
		System.out.println("java in implemented class");
	}
	
	public void selenium()
	{
		System.out.println("Selenium in implemented class");
	}
	
	public static void main(String[] args) {
		Automation a = new Automation();
		a.python();
		a.ruby();
		a.selenium();
		a.java();

	}

}
