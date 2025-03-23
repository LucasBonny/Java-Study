package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Registro;

public class exercise1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			Set<Registro> log = new HashSet<>();
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				log.add(new Registro(username, moment));
				
				line = br.readLine();
			}
			System.out.println("Total users: " + log.size());
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.getStackTrace();
		}
		sc.close();

	}

}
