import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Locale.setDefault(Locale.US);
//		String nome = "Maria";
//		int idade = 32;
//		double salario = 4000.00;
//		System.out.println("O(A) " + nome + " tem " + idade + " anos, e recebe R$" + salario + ".");
//		System.out.printf("O(A) %s tem %d anos, e recebe R$%.1f.", nome, idade, salario);
		//-----------VARIAVEIS-----------//
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code =  5290;
		
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		//---------CODIGO-----------//
		System.out.printf("Products: \n%s, which price is $ %.2f\n%s, which price is $ %.2f\n\nRecord: %d years old, code %d and gender: %c\n\n", product1, price1, product2, price2, age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f\nRounded (three decimal places): %.3f\n", measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	}

}
