package ListOfObjects;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Product prod1 = new Product("Bluetooth",99,16,"King");
		System.out.println(prod1.toString());
		Product prod2 = new Product("Jackpot",777,"Bingo","Jackooo");
		System.out.println(prod2.toString());
		Product prod3 = new Product("Weapon","Katana",1,"Black Tornado");
		System.out.println(prod1.toString());
		Product prod4 = new Product("Medical","Medkit",5,"Ordinance");
		System.out.println(prod1.toString());
		ArrayList<Product> list = new ArrayList();
		list.add(prod1);
		list.add(prod2);
		list.add(prod3);
		list.add(prod4);
		list.add(new Product("Arsenal",8,10,"Inventory"));
		System.out.println(list);
		for(int i = 0;i<list.size();i++)
		{
			if(list.get(i).price>100 && list.get(i).quantity>5)
			{
				System.out.println(list.get(i));
			}
			Scanner scn = new Scanner()
		}
	}

}
