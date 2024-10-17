package interfaceProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

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
		LocalDate data = LocalDate.parse(sc.nextLine(),fmt);
		System.out.print("Valor do contrato: ");
		Double valorTotal = sc.nextDouble();
		
		Contract obj = new Contract(numero, data, valorTotal);
		
		System.out.print("Entre com o numero de parcelas: ");
		int parcelas = sc.nextInt();		

		ContractService service = new ContractService(new PaypalService());
		
		service.processContract(obj, parcelas);
		
		System.out.println("Parcelas: ");
		for(Installment installment : obj.getInstallment()) {
			System.out.println(installment);
		}
		
		sc.close();
	}

}