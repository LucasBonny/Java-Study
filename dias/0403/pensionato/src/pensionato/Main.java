package pensionato;

import java.util.Locale;
import java.util.Scanner;

import quartos.Quartos;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos irão alugar: ");
		int n = sc.nextInt();
		Quartos[] quartos = new Quartos[10];
		for(int i = 0; i < n; i++) {
			System.out.print("Insira o nome do aluno: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Insira o email: ");
			String email = sc.nextLine();
			System.out.print("Insira o quarto: ");
			int idQuarto = sc.nextInt();
			quartos[idQuarto] = new Quartos(nome, email, idQuarto);
		}
		for(int i = 0; i < 9; i++) {
			if(quartos[i] != null) {
				System.out.println(i +  ": "+ quartos[i].getNome() +", " + quartos[i].getEmail());
			}
		}
		sc.close();
	}

}
