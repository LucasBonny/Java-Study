package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas deseja fazer a media de altura? ");
		int pessoas = sc.nextInt();
		double total = 0;
		double[] altura = new double[pessoas];
		for(int i = 0; i < pessoas; i++) {
			System.out.printf("Digite a altura da pessoa %d: ", i+1);
			altura[i] = sc.nextDouble();
			total += altura[i];
		}
		System.out.println("A média da altura é: " + String.format("%.2f", total / pessoas));
		sc.close();
	}

}
