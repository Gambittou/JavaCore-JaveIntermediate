package Lambda;

public class Test {

	public static void main(String[] args) {
		
		Greeting gr = new Greeting(){
			public void greet()
			{
				System.out.println("Hello World");
			}
			public void welcome() {
				System.out.println("Welcome");
			}
			
		};
		gr.greet();
		gr.welcome();
		
		


	}

}
