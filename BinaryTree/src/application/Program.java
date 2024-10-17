package application;

import java.util.ArrayList;
import java.util.List;

import services.SearchService;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 240000; i++) {
			list.add(i);
		}
		
		Integer x = SearchService.busca_binaria(list,26576);
		if(x != null) System.out.println("Valor encontrado no indice: " + x); 
		else System.out.println("Valor não encontrado!");
	}

}
