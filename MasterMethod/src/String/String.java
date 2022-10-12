package String;

public class String {
	public String(java.lang.String string) {
	}

	public static void main(String args[]) {
        java.lang.String strLiteral = "Hello World!";
        System.out.println(strLiteral); // output will be: Hello World!
     // Method 1     
        java.lang.String str1 = "I like strings";
        java.lang.String str2 = "I like strings";
        System.out.println(str1 == str2); // output will be: true

        // Method 2
        String str3 = new String("I like strings");
        String str4 = new String("I like strings");
        System.out.println(str3 == str4); // output will be: false
        {
        	
        }

