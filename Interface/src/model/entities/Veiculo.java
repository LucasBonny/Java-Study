package model.entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Veiculo {
	private String modelo;
	private Date retirada;
	private Date retorno;
	private double perHour;
	private double perDay;
	
	public Veiculo() {
		
	}
	public Veiculo(String modelo, Date retirada, Date retorno, double perHour, double perDay) {
		this.modelo = modelo;
		this.retirada = retirada;
		this.retorno = retorno;
		this.perHour = perHour;
		this.perDay = perDay;
	}
	//valor basico multiplica o valor da hora pela quantidade de horas abaixo de 12
	public double valorBasico() {
		//vê o tempo entre a saida e o retorno
		long tempo = retorno.getTime() - retirada.getTime();
		//conversão
		long minutosTotal = TimeUnit.MINUTES.convert(tempo, TimeUnit.MILLISECONDS);
		long horas = minutosTotal / 60;
		long minutos = minutosTotal % 60;		
		//verifica se há minutos acima de zero para adicionar ao cálculo mais 1 hora
		if(minutos > 0) {
			horas += 1;
		}
		//verifica se está acima de 12 horas
		if(horas > 12) {
			horas /= 24;
			horas++;
			return horas * perDay;
		}
		else {
			return horas * perHour;
		}
		
	}
	public double imposto() {
		return 1.0;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Date getRetirada() {
		return retirada;
	}
	public void setRetirada(Date retirada) {
		this.retirada = retirada;
	}
	public Date getRetorno() {
		return retorno;
	}
	public void setRetorno(Date retorno) {
		this.retorno = retorno;
	}
	public double getPerHour() {
		return perHour;
	}
	public void setPerHour(double perHour) {
		this.perHour = perHour;
	}
	public double getPerDay() {
		return perDay;
	}
	public void setPerDay(double perDay) {
		this.perDay = perDay;
	}
	
	
	

}
