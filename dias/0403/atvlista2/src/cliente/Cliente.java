package cliente;

import java.util.Scanner;

public class Cliente {
	private String nomeDoCliente;
	private double saldo;
	private int agencia;
	private int conta;
	
	public Cliente(String nomeDoCliente, int agencia, int conta, double saldo) { //CRIAR CONTA
		if (agencia == this.agencia && conta == this.conta) {
			System.out.println("Conta já existe! Use outra conta!");
		} 
		else {
			this.nomeDoCliente = nomeDoCliente;
			this.agencia = agencia;
			this.conta = conta;
			this.saldo = saldo;
			System.out.println("Conta Criada Com Sucesso!\nAgência: " + agencia + "\nConta: " + conta + "\nNome do cliente: " + nomeDoCliente + "Saldo: " + saldo + " R$");
		}
	}
	public Cliente(String nomeDoCliente, int agencia, int conta) { // CRIAR CONTA - SOBRECARGA
		if (agencia == this.agencia && conta == this.conta) {
			System.out.println("Conta já existe! Use outra conta!");
		} 
		else {
			this.nomeDoCliente = nomeDoCliente;
			this.agencia = agencia;
			this.conta = conta;
			this.saldo = 0;
			System.out.println("Conta Criada Com Sucesso!\nAgência: " + agencia + "\nConta: " + conta + "\nNome do cliente: " + nomeDoCliente + "Saldo: " + saldo + " R$");
		}
	}
	public void removeAccount(int agencia, int conta) { // REMOVER CONTA
		if (agencia == this.agencia) {
			if(conta == this.conta) {
				if (saldo == 0) {
					System.out.println("Conta encerrada com sucesso!");
				} else {
					System.out.println("Não podemos está encerrando sua conta pois ainda há saldo na conta!");
				}
			}
			else System.out.println("Conta Inválida!");
		} 
		else System.out.println("Agência Inválida!");

	}
	public void transferMoney(int agencia, int conta, double valor) { //TRANSFERIR MONEY
		boolean res = searchAccount(agencia, conta);
		if(res == true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Você deseja transferir " + valor + "R$ para " + nomeDoCliente + " da conta " + conta + "\nS ou N.");
			char opc = sc.nextLine().charAt(0);
			if(opc == 'S') {
				System.out.println("Você transferiu " + valor + "R$ para " + nomeDoCliente + ".");
			}
			sc.close();
		}
		else {
			System.out.println("Conta Inexistente!");
		}
	}
	private boolean searchAccount(int agencia, int conta) { // PROCURAR CONTA
		if(agencia == this.agencia && conta == this.conta) {
			return true;
		}
		else return false;
	}
	public void withdrawMoney(int agencia, int conta, double valor) { //TRANSFERIR MONEY
		boolean res = searchAccount(agencia, conta);
		if(res == true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Você deseja sacar " + valor + "R$ da conta " + conta + "?\nS ou N.");
			char opc = sc.nextLine().charAt(0);
			if(opc == 'S') {
				System.out.println("Você sacou " + valor + "R$.");
			}
			sc.close();
		}
		else {
			System.out.println("Conta Inexistente!");
		}
	}
	
}
