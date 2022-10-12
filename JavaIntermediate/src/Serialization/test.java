package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class test {

	public static void main(String[] args) {
		Product prod = new Product(1001, "TV", 1000, "Apple");
		try {
			
			FileOutputStream fileOut = new FileOutputStream("object.txt");
			
			ObjectOutputStream oOut = new ObjectOutputStream(fileOut);
			
			oOut.writeObject(prod);
			
			FileInput fileIn = new FileInputStream(fileIn);
			objectInputStream oin = new ObjectInputStream(fileIn);
			Product prodCopy = (Product) oin.readObject();
			System.out.println(Product.prodId);
			System.out.println(prodCopy.name);
			System.out.println(prodCopy.brand);
			System.out.println(prodCopy.price);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
