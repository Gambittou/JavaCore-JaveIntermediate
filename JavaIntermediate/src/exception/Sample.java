package exception;

import java.sql.DriverManager;

public class Sample {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			int z = x / y;
			int[] nums = new int[5];
			nums[4] = 200;
			Connection con = DriverManager.getConnection("", "","");
		}catch (ArthmeticException e) {
			System.out.printin(e.getMessage());
			System.out.println("We can not dividie a number by zero");
		}catch (ArrayIndexOutOfBoundsException());
		    System.out.printin(e.getMessage());
		    System.out.println("We can not place elements out of array's");
		
		 
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("something went wrong");
		}
	}


