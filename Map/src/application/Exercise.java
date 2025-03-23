package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise {

	public static void main(String[] args) {
		
		Map<String, Integer> p = new LinkedHashMap<>();
		String path = "c:\\temp\\in4.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer votes = Integer.parseInt(fields[1]);

				if(p.containsKey(name)) {
					votes += p.get(name);
				}
				p.put(name, votes);					
				
				line = br.readLine();
				
			}
			for(String s : p.keySet()) {
				System.out.println(s + ": " + p.get(s));
			}
			
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
