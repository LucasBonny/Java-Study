package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService TaxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.TaxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		//processa o tempo
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60;
		//calcula o valor basico
		double basicPayment;
		if(hours <= 12) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		}
		else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}
		
		//processa a taxa
		Double tax = TaxService.tax(basicPayment);
				
		carRental.setInvoice(new Invoice(basicPayment, tax));
		
	}
	
	
	
}
