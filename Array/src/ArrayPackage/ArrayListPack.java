package ArrayPackage;

import java.util.ArrayList;

public class ArrayListPack {
	public static void main(String[] args) {
		int[] x=new int[5];
		ArrayList list=new ArrayList();
		list.add("Gambit");
		list.add("King");
		list.add(816);
		list.add(true);
		list.add("Y");
		System.out.println(list);
		
		ArrayList<String> names=new ArrayList<String>(4);
		//ArrayList<String> names=new ArrayList<STRING>();
		names.add("Gambit");
		names.add("Jackal");
		names.add("Havoc");
		names.add("Syndicate");
		names.add("Ghost");
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.get(5));
		
		
	}

}
