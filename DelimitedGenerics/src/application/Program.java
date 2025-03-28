package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		String path = "C:\\temp\\in.txt";
		
		List<Product> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
		}
		catch(RuntimeException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
