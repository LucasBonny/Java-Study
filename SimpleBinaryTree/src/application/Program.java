package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		//adicionar na lista
		List<String> list = new ArrayList<>();
		
		//importar dados
		String path = "C:\\temp\\names.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				list.add(line);
				line = br.readLine();
			}
			//Ordenando a lista
			Collections.sort(list);
			//mostrando a lista no console
			for(String e : list) {
				System.out.println(e);
			}
			//buscarndo o dado
			Integer value = busca(list,"Lorenzo Santiago");
			if(value == null) {
				System.out.println("Usuário não encontrado!");
			}
			else {
				System.out.println("Usuário Encontrado!\nIndice: [" + value + "]");
			}

		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	public static Integer busca(List<String> list, String valor) {
		int baixo = 0;
		int alto = list.size() - 1;
		
		while(baixo <= alto) {
			
			int meio = (alto + baixo) / 2;
			int comparacao = list.get(meio).compareTo(valor);
			
			if(comparacao == 0) {
				return meio;
			}
			else if(comparacao < 0) {
				baixo = meio + 1;
			}
			else {
				alto = meio - 1;
			}
		}
		
		return null;
	}
}
