package atvlista;

import java.util.ArrayList;

import veiculo.Veiculo;

public class Main1 {

	public static void main(String[] args) {
        ArrayList<Veiculo> listaDeVeiculos = new ArrayList<>();

        listaDeVeiculos.add(new Veiculo("Toyota", "Corolla", 2020, "ABC-1234"));
        listaDeVeiculos.add(new Veiculo("Honda", "CB 500", 2019, "XYZ-5678"));

        System.out.println("Informações dos veículos:");
        for (int i = 0; i < listaDeVeiculos.size(); i++) {
            System.out.println(listaDeVeiculos.get(i).mostrarVeiculos());
        }
    }

}
