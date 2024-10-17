package atividadeInterface1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.nextLine(),fmt);
		System.out.print("Valor do contrato: ");
		Double valor = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		int parc = sc.nextInt();
		System.out.println("Parcelas: ");
		
		Contract obj = new Contract(numero, date, valor);
		
		System.out.println(obj);
		
		sc.close();
	}

}
