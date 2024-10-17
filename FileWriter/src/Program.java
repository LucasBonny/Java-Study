import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		//Criar o diretorio
		String path = "c:\\temp\\out.txt";
		//Criar nome
		String[] nome = {"Lucas Bonifacio", "Marcos Vinicius", "Jonny Figueredo"};
		//Criar Profissao
		String[] p = {"Análise e Desenvolimento de Sistemas", "Contabilidade", "Recursos Humanos"};
 		//Inserir no arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,false))){
			for(int i = 0; i < nome.length; i++) {
				//bw.write("Nome: " + nome[i] + " Profissao: " + p[i]);
				bw.write("INSERT INTO usuarios(id, nome, profissao) VALUES ("+ (i+1) +",'" + nome[i] + "','" + p[i] + "');");
				bw.newLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
