package Unit;

public class TestAnnotation {
	int maths;
	int english;
	int chemistry;
	
	public static void m1()
	{
		System.out.println("@BeforeClass");
	}
	
	public void m2()
	{
		System.out.println("initialise the marks");
		this.chemistry = 40;
		this.english = 66;
		this.maths = 40;
	}
	public void m3()
	{
		this.chemistry = 0;
		this.english = 0;
		this.maths = 0;
		System.out.println("Result calculation completed");
	}
	public static void m4()
	{
		System.out.println("@AfterClass");
	}
	public void m5()
	{
		System.out.println("We are ignoring other subject marked calculation");
	}
	public void runFindBig() {
		assertEquals(true,Caculator.findAvgMarks(maths,chemistry,english);)
	}

}
