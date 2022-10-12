package inheritance;

public class test {

	public static void main(String[] args) {
		//Person p = new Person();
		
		//Employee e = new Employee();
		Person p1 = new Employee();
		Person p2 = new Student();
		Person p33 = new Manager();
				

		Manager m = new Manager("Gambit",23,8160,"Training");
		System.out.printIn(m.name);
		System.out.printIn(m.age);
		System.out.printIn(m.empId);
		System.out.printIn(m.dept);
		m.doSomething();

	}

}
