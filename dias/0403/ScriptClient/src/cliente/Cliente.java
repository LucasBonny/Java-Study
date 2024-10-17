package cliente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
	private String usuario;
	private String senha;
	private LocalDate data;
	private int quantidade;
	
	public void createUser(String usuario, String senha, String data, int quantidade) {
		if(usuario.length() < 4 || usuario.length() > 16) {
			System.out.println("Crie um usuário de 4 a 16 caracteres.");
		}
		else if(senha.length() < 4 || senha.length() > 16) {
			System.out.println("Crie uma senha de 4 a 16 caracteres.");
		}
		else {
			LocalDate dataCv = mudarData(data);
			if(quantidade < 1) {
				System.out.println("Quantidade Inválida!");
			}
			else {
				DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				this.usuario = usuario;
				this.senha = senha;
				this.data = dataCv;
				this.quantidade = quantidade;
				
				System.out.println("\nUSUÁRIO CRIADO COM SUCESSO!\n");
				System.out.println("Usuário: " + usuario);
				System.out.println("Senha: " + senha);
				System.out.println("Data De Vencimento: " + dataCv.format(fm1));
				System.out.println("Quantidade: " + quantidade + " Ativos");
			}
		}
	}
	public void createUser(String usuario, String senha, int dias, int quantidade) {
		if(usuario.length() < 4 || usuario.length() > 16) {
			System.out.println("Crie um usuário de 4 a 16 caracteres.");
		}
		else if(senha.length() < 4 || senha.length() > 16) {
			System.out.println("Crie uma senha de 4 a 16 caracteres.");
		}
		else {
			LocalDate diaAtual = LocalDate.now();
			LocalDate novoDia = diaAtual.plusDays(dias);
			if(dias < 1) {
				System.out.println("Quantidade Inválida!");
			}
			else {
				DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				this.usuario = usuario;
				this.senha = senha;
				this.data = diaAtual;
				this.quantidade = quantidade;
				
				System.out.println("USUÁRIO CRIADO COM SUCESSO!\n");
				System.out.println("Usuário: " + usuario);
				System.out.println("Senha: " + senha);
				System.out.println("Data De Vencimento: " + novoDia.format(fm1));
				System.out.println("Quantidade: " + quantidade + " Ativos");
			}
		}
	}
	public void RenewDays(String usuario) {
		LocalDate pegar = LocalDate.now();
		int mes = pegar.getMonthValue();
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			data.plusDays(31);
		}
		else {
			data.plusDays(30);
		}
		
	}
	public void adicionarDias(int dias) {
		if(dias > 0) {
			data.plusDays(dias);
		}
		else {
			System.out.println("Quantidade de dias Inválido!");
		}
	}
	public LocalDate mudarData(String data) { //OK
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataConverter = LocalDate.parse(data, fm1);
		return dataConverter;
	}
}
