package inheritance;

public  abstract class Person {
	String name;
	int age;
	public Person() {}
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
		System.out.printin("Person Constructor");
	}
	public abstract void doSomething();//no body
	
	public void talk()
	{
		System.out.printIn("People talk to each other to express their feelings");
	}

}
