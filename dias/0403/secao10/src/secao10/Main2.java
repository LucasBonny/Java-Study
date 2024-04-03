package secao10;

import java.util.Locale;
import java.util.Scanner;
import application.class2;

public class Main2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos produtos deseja registrar: ");
		int n = sc.nextInt();
		class2[] product = new class2[n];
		for(int i = 0; i < n; i++) {
			String name = sc.nextLine();
			double price = sc.nextDouble();
			product[n] = new class2(name, price);
		}
		
		sc.close();
	}

}
