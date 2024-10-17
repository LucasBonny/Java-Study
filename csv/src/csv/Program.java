package csv;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Lucas Bonny\\Downloads\\aula1node1909\\campeonato-brasileiro-gols.csv");
        Scanner sc = null;
        try {
            sc = new Scanner(file);

            // Ignorando a primeira linha (cabeçalho)
            if (sc.hasNextLine()) {
                sc.nextLine();
            }

            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                String[] dados = linha.split(",");

                // Extraindo as informações importantes
                String rodada = dados[1].replace("\"", "");
                String clube = dados[2].replace("\"", "");
                String atleta = dados[3].replace("\"", "");
                String minuto = dados[4].replace("\"", "");

                System.out.println("INSERT INTO usuario(id_partida, id_clube, rodada, atleta, minuto) VALUES(null, '" + clube + "', " + rodada + ", '" + atleta + "', '" + minuto + "');");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

	}

}
