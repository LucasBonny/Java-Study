import java.util.Scanner;

import cliente.Cliente;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite Um Usuário: ");
		String usuario = sc.nextLine();
		System.out.print("Digite Um Senha: ");
		String senha = sc.nextLine();
		System.out.print("Digite quantos dias deseja: ");
		int data = sc.nextInt();
		System.out.print("Digite a quantidade de ativos: ");
		int quantidade = sc.nextInt();
		Cliente cliente = new Cliente();
		cliente.createUser(usuario, senha, data, quantidade);
		sc.close();
		

	}

}
