package Constructor;

public class Constructor {
	String name;
	int age;
	String address;
	int phone;
	
	//public Constructor() {}
	
	public Constructor() {
		System.out.println("Person class instantiated");
	}
	
	public person(String n, int a, String add, int p) {
		name=n;
		if(a<=0)
		{
			System.out.printIn("age can not be less than 0");
		}
		else {
			age=a;
		}
		
		address=add;
		phone=p;
	}
	public Constructor(String n, int a) {
		name=n;
		if(a<=0)
	}

}
