package interface1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();

		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

		System.out.print("Entre com o preço por hora: ");
		double hora = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double dia = sc.nextDouble();
		
		System.out.println("FATURA:");
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		RentalService rs = new RentalService(hora, dia, new BrazilTaxService());
		
		rs.processInvoice(cr);
		
		System.out.printf("Pagamento basico: %.2f\n", cr.getInvoice().getBasicPayment());
		System.out.printf("Imposto: %.2f\n", cr.getInvoice().getTax());
		System.out.printf("Pagamento total: %.2f\n", cr.getInvoice().getTotalPayment());
		sc.close();
	}

}
