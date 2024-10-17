package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dominio implements Comparable<Dominio>{
	private String token;
	private String dominio;
	private LocalDate vencimento;
	
	public Dominio(String token, String dominio, LocalDate vencimento) {
		this.token = token;
		this.dominio = dominio;
		this.vencimento = vencimento;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	@Override
	public int compareTo(Dominio other) {
		if(this.getVencimento().compareTo(other.getVencimento()) < 0) return -1;
		if(this.getVencimento().compareTo(other.getVencimento()) > 0) return 1;
		return 0;
	}
	public String toString() {
		return "Vencimento: " + getVencimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " Dominio: " + getDominio() + " Token: " + getToken();
	}
	
}
