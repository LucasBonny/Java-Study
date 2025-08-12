package application;

import java.util.ArrayList;
import java.util.List;

import core.Market;

public class Program3 {

	public static void main(String[] args) {
		
		List<Market> p = new ArrayList<>();
		
		p.add(new Market("TV LCD 40p", 1290.00, 7));
		p.add(new Market("SmartPhone Samsung S20", 2199.00, 23));
		p.add(new Market("Geladeira Smart Samsung 25L", 8979.00, 5));
		p.add(new Market("Maquina de Lavar Eletrolux 10L", 890.00, 3));
		p.add(new Market("Microondas Eletrolux 10L", 830.00, 10));
		
		double total = p.stream()
		    .map(x -> x.getPrice() * x.getQuantity())
		    .reduce(0.0, (x, y) -> x + y);
		System.out.println("Total: " + String.format("%.2f", total));
		}
	
}
