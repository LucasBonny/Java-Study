package estoque;
import calculo.soma;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		soma v = new soma();
		System.out.println("Enter product data: ");
		System.out.printf("Name: ");
		v.nome = sc.next();
		System.out.printf("Price: ");
		v.pricing = sc.nextDouble();
		System.out.printf("Quantity in stock: ");
		v.quantidade = sc.nextInt();
		
		double res = v.registro();
		System.out.println("Product data: " + v.nome + ", $ " + v.pricing + "0, " + v.quantidade + " units, Total: $ " + res + "0");
		System.out.printf("\nEnter the number of products to be added in stock: ");
		int addestoque = sc.nextInt();
		res = v.adcestoque(addestoque);
		System.out.println("\nUpdated data: " + v.nome + ", $ " + v.pricing + "0, " + v.quantidade + " units, Total: $ " + res + "0");
		System.out.printf("\nEnter the number of products to be removed from stock: ");
		int remestoque = sc.nextInt();
		res = v.adcestoque(remestoque);
		System.out.println("\nUpdated data: " + v.nome + ", $ " + v.pricing + "0, " + v.quantidade + " units, Total: $ " + res + "0");
		sc.close();
	}

}
