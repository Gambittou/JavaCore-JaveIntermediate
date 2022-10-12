package typecasting;

public class TypeCasting {
	
	public static void main(String[] args) {
		int x;//32 bits of data
		long y = 23456789L;//64 bits of data
		x = (int)y;
		System.out.println(x);
		
		float m = 234.66f;
		int n = (int)m;
		System.out.println(n);
		
		char[] helloArray = {'H', 'e', 'l', 'l', 'o', '.'};
		String helloString = new String(helloArray);
		System.out.println(helloArray);
		
	}

}
