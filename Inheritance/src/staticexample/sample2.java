package staticexample;

public class sample2 {

	public static void main(String[] args) {
		MySample obj1 = new MySample();
		obj1.x=10;
		System.out.printin(obj1.x);
		obj1.x++;
		System.out.printin(obj1.x);
		System.out.printin(MySample.staticX++);
		System.out.printin(MySample.staticX++);
		
		MySample obj2 = new MySample();
		obj2.x = 20;
		System.out.printIn(obj2.x);
		onj2.x++;
		System.out.printIn(obj2.x);
		System.out.printIn(MySample.staticX++);
		
		MySample obj3 = new MySample();
		
		System.out.printin(MySample.staticX++);1
			

	}

}
