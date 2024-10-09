package entities;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
	private String name;
	private String email;
	private LocalDate dataNasc;
	private String telefone;
	
	public Employee(String name, String email, LocalDate dataNasc, String telefone) {
		this.name = name;
		this.email = email;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		return "INSERT INTO usuarios(nome,email,dataNasc,telefone) VALUES ('" + getName() + "','" + getEmail() + "','" + getDataNasc() + " 00:00','" + getTelefone() + "');";
	}

	@Override
	public int compareTo(Employee o) {
		if(this.getName().compareTo(o.getName()) < 0)
		{
			return -1;
		}
		if(this.getName().compareTo(o.getName())> 0) {
			return 1;
		}
		return 0;
	}
	

}
