package ListOfObjects;

import java.util.ArrayList

public class test {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList();
		list.add(new Person("Gambit",32,"Master"));
		list.add(new Person("Gambit",32,"Master"));
		list.add(new Person("Gambit",32,"Master"));
		list.add(new Person("Gambit",32,"Master"));
		
		Person p = new Person();
		p.getPerson(list);

	}

}
