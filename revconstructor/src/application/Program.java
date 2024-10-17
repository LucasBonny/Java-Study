package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine(); //variavel local
		System.out.print("Price: ");
		double price = sc.nextDouble(); //variavel local
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt(); //variavel local
		Product product = new Product(name, price); // tipo composto / objeto = instanciando = um contrutor com os atributos necessarios
		System.out.println("Updated name: " + product.getName());

		System.out.println("\nProduct data: " + product);

		System.out.print("\nEnter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());

		System.out.println("\nUpdated data: " + product);

		System.out.print("\nEnter the number of products to be removed from stock: ");
		product.RemoveProducts(sc.nextInt());

		System.out.println("\nUpdated data: " + product);

		sc.close();
	}

}
