package ListOfObjects;

public class Product {
	String name;
	int price;
	int quantity;
	String brand;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public int getPrice() {
		return price;
		
	}
	
	public void setPrice(int price) {
		this.price = price;
		
	}
	
	public int getQuatity() {
		return quantity;
		
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
    }
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Product(String name, int price, int i, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = i;
		this.brand = brand;
	}
	public Product(String name2, int price2, String string, String brand2) {
		// TODO Auto-generated constructor stub
	}

	public Product(String name2, String string, int i, String brand2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product \n [name = "+ name+ "\n price ="
	+ price + "\n quantity =" + quantity + "\n brand =" + "]\n";
	}
	}
