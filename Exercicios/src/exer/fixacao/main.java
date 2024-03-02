package exer.fixacao;
import java.util.Locale;
import java.util.Scanner;

import util.Currency;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the dollar price? ");
		Currency.multiplier = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		Currency.quantity = sc.nextDouble();
		System.out.println("Amount to be paid in reais = " + Currency.CurrencyConverter() + "0");
		sc.close();
	}

}
