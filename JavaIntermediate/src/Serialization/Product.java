package Serialization;

import java.io.Serializable;

public class Product  implements Serializable{
	public static final String prodId = null;
	public int prodid;
	public String name;
	public transient int price;
	public String brand;
	public Product(int prodid, String name, int price, String brand) {
		super();
		this.prodid = prodid;
		this.name = name;
		this.price = price;
		this.brand = brand;
	}

}
