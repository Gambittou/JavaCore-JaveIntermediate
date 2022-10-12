package ArrayPackage;

public class ArrayExample {
	
	public static void main(String[] args) {
		//Declare
		//Instantiate
		//Intialize
		
		String[] student;//Declare
		student=new String[5];
		student[0]="Kaido";//intialize
		student[1]="Jahshin";
		student[2]="Takota";
		student[3]="Koda";
		student[4]="Jhin";
		
		String[] City=new String[5];
				
		String[] fruits= {"Banana","Grapes","Guava","Pineapple","Avacado"};
		System.out.println("Students------");
		for(int i=0;i<student.length;i++)
		{
			System.out.println(student[i]);
		}
		System.out.println("Fruits------");
		for(int i=0;i<fruits.length;i++)
		{
			System.out.println(fruits[i]);
		}
	
	
	}

}
