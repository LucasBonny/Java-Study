import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Veiculo;

public class Interface01Atividade {
	/*
 	Uma locadora brasileira de carros cobra um valor por hora para locações de até 12 horas. 
 	Porém, se a duração da locação ultrapassar 12 horas, a locação serácobrada com base em um valor diário. 
 	Além do valor da locação, é acrescido nopreço o valor do imposto conforme regras do país que,
  	no caso do Brasil, é 20% para valores até 100.00, ou 15% para valores acima de 100.00. 
  	Fazer umprograma que lê os dados da locação (modelo do carro, instante inicial e final dalocação), 
  	bem como o valor por hora e o valor diário de locação. O programadeve então gerar a nota de pagamento 
  	(contendo valor da locação, valor doimposto e valor total do pagamento) e informar os dados na tela. 
  	Veja osexemplos. 
  
	Entre com os dados do aluguel
	Modelo do carro: Civic
	Retirada (dd/MM/yyyy hh:mm): 25/06/2018 10:30
	Retorno (dd/MM/yyyy hh:mm): 25/06/2018 14:40
	Entre com o preço por hora: 10.00
	Entre com o preço por dia: 130.00
	FATURA:
	Pagamento basico: 50.00
	Imposto: 10.00
	Pagamento total: 60.00
 
 	Entre com os dados do aluguel
	Modelo do carro: Civic
	Retirada (dd/MM/yyyy hh:mm): 25/06/2018 10:30
	Retorno (dd/MM/yyyy hh:mm): 27/06/2018 11:40
	Entre com o preço por hora: 10.00
	Entre com o preço por dia: 130.00
	FATURA:
	Pagamento basico: 390.00
	Imposto: 58.50
	Pagamento total: 448.50
 */

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Entre com os dados do aluguel");
			System.out.print("Modelo do carro: ");
			String modelo = sc.nextLine();
			System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
			Date retirada = sdf.parse(sc.nextLine());
			System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
			Date retorno = sdf.parse(sc.nextLine());
			System.out.print("Entre com o preço por hora: ");
			double perHour = sc.nextDouble();
			System.out.print("Entre com o preço por dia: ");
			double perDay = sc.nextDouble();
			
			Veiculo registro = new Veiculo(modelo,retirada,retorno,perHour,perDay);
			
			double imposto = registro.valorBasico() * (registro.valorBasico() < 100 ? 0.2 : 0.15);
			System.out.println("FATURA: ");
			System.out.printf("Pagamento basico: %.2f\n", registro.valorBasico());
			System.out.printf("Imposto: %.2f\n", imposto);
			System.out.printf("Pagamento total: %.2f\n", imposto + registro.valorBasico());
		}
		catch (ParseException e) {
			System.out.println("Erro: digite corretamente!");
		}
		catch (RuntimeException e){
			System.out.println("Erro: Desconhecido!");
		}
		finally {
			sc.close();			
		}
	}

}
