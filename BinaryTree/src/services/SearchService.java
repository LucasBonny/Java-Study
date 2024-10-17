package services;

import java.util.List;

public class SearchService {
	
	public static <T extends Comparable<T>> Integer busca_binaria(List<T> lista, T valor) {
		int baixo = 0;
		int alto = lista.size() - 1;
		
		while(baixo <= alto) {			
			int meio = (alto + baixo) / 2;
			
			int comparacao = lista.get(meio).compareTo(valor);
			if(comparacao == 0) {
				return meio;
			}
			else if(comparacao < 0) {
				baixo = meio + 1;
			}
			else{
				alto = meio - 1;
			}
		}
		return null;
	}

}
