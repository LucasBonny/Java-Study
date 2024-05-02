package atvlista2;

import java.util.ArrayList;
import cliente.Cliente;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Cliente> lista = new ArrayList<>();
		Cliente cliente = new Cliente("Lucas", 11, 11, 111);
		lista.add(cliente);

	}

}
