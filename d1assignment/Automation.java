package Week3.d1assignment;


public class Automation extends MultipleLanguage implements TestTool,Language{

	public static void main(String[] args) {
		
		Automation lang = new Automation();
		lang.Java();
		lang.python();
		lang.ruby();
		lang.Selenium();
}

	public void Java() {
		System.out.println("Java is a object oriented programming language.");
		
	}

	public void Selenium() {
        System.out.println("Selenium is a tool that will allow you to automate web applications.");		
	}

	@Override
	public void ruby() {
        System.out.println("Ruby is an interpreted, high-level, general-purpose programming language which supports multiple programming paradigms.");		
	}
}