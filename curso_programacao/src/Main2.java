import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// string
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("Digite um nome: ");
//		String x = sc.next();
//		System.out.println("Você digitou: " + x);
//		
//		//Numero
//		
//		Scanner sc2 = new Scanner(System.in);
//		System.out.printf("Digite um numero: ");
//		int num = sc2.nextInt();
//		System.out.println("Voce colocou: " + num);
//		
//		//numero flutuante
//		
//		Scanner doub = new Scanner(System.in);
//		System.out.printf("Digite um numero flutuante: ");
//		double num2 = doub.nextDouble();
//		System.out.println("Você digitou: " + num2);
//		
//		//char
//		
//		Scanner ch = new Scanner(System.in);
//		System.out.printf("Digite um caracter: ");
//		char chr = ch.next().charAt(0);
//		System.out.println("Seu caracter foi: '" + chr +"'.");
//		
//		doub.close();
//		sc2.close();
//		sc.close();
//		Scanner nome = new Scanner(System.in);
//		String name = nome.next();
//		Scanner idade = new Scanner(System.in);
//		int year = idade.nextInt();
//		Scanner altura = new Scanner(System.in);
//		double cm = altura.nextDouble();
//		
//
//		System.out.println("O nome inserido é: " + name);
//		System.out.println("Seu Aniversário é: " + year);
//		System.out.println("Sua altura é: " + cm);
//		
//		altura.close();
//		nome.close();
//		idade.close();

//		Scanner sc = new Scanner(System.in);
//		String x = sc.next();
//		int y = sc.nextInt();
//		double z = sc.nextDouble();
//		System.out.println("Seus valores são: ");
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//
//		sc.close();
		int x;
		String sc1, sc2, sc3;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		sc.nextLine();
		sc1 = sc.nextLine();
		sc2 = sc.nextLine();
		sc3 = sc.nextLine();
		
		System.out.println("Valores: ");
		System.out.println(x);
		System.out.println(sc1);
		System.out.println(sc2);
		System.out.println(sc3);
		sc.close();
	}

}
