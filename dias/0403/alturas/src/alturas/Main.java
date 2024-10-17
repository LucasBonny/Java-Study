package alturas;
import java.util.Locale;
import java.util.Scanner;
import pessoas.Info;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Info[] info = new Info[n];
		for(int i = 0; i < info.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\nNome: ", i+1);
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			info[i] = new Info(nome, idade, altura);
		}
		double aTotal = 0;
		int menor = 0;
		for(int i = 0; i < info.length; i++) {
			aTotal += info[i].getAltura();
			if(info[i].getIdade() < 16) menor++;
		}
		aTotal /= info.length;
		System.out.printf("Altura média: %.2f\n", aTotal);
		System.out.println("Pessoas com menos de 16 anos: " + menor*100/info.length + "%");
		for(int i = 0; i < info.length; i++) {
			aTotal += info[i].getAltura();
			if(info[i].getIdade() < 16) System.out.println(info[i].getNome());;
		}
		sc.close();

	}

}
