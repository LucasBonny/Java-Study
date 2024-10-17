package estoque;
import calculo.soma;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product data: ");
		System.out.printf("Name: ");
		String nome = sc.next();
		System.out.printf("Price: ");
		double pricing = sc.nextDouble();
		System.out.printf("Quantity in stock: ");
		int quantidade = sc.nextInt();
		soma v = new soma(nome, pricing, quantidade);
		
		double res = v.registro();
		System.out.println("\nProduct data: " + v.nome + ", $ " + String.format("%.2f", v.pricing) + ", " + v.quantidade + " units, Total: $ " + String.format("%.2f", res));
		System.out.printf("\nEnter the number of products to be added in stock: ");
		int addestoque = sc.nextInt();
		res = v.adcestoque(addestoque);
		System.out.println("\nUpdated data: " + v.nome + ", $ " + String.format("%.2f", v.pricing) + ", " + v.quantidade + " units, Total: $ " + String.format("%.2f", res));
		System.out.printf("\nEnter the number of products to be removed from stock: ");
		int remestoque = sc.nextInt();
		res = v.adcestoque(remestoque);
		System.out.println("\nUpdated data: " + v.nome + ", $ " + String.format("%.2f", v.pricing) + ", " + v.quantidade + " units, Total: $ " + String.format("%.2f", res));
		sc.close();
	}

}
