package methodref;

public class Test {
	
	public static void main(String[] args) {
		School sch = new School();
		Noteable nt = sch::noteSomething;
		nt.note(null);
	}

}
