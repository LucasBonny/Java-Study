package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import core.Funcionario;

public class Program2 {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter full file path: ");
	    String path = sc.nextLine();
	    
	    try(BufferedReader br = new BufferedReader(new FileReader(path))) {
	      System.out.print("Enter salary: ");
	      double average = sc.nextDouble();
	      List<Funcionario> f = new ArrayList<>();
	      String line = br.readLine();
	      while(line != null) {
	        String[] parts = line.split(",");
	        f.add(new Funcionario(parts[0], parts[1], Double.parseDouble(parts[2])));
	        line = br.readLine();
	      }
	      List<String> emails = f.stream()
	          .filter(x -> x.getSalary() > average)
	          .map(x -> x.getEmail()).sorted().toList();
	      System.out.println("Email of people whose salary is more than " 
	          + String.format("%.2f",  average) + ":");
	      emails.forEach(System.out::println);
	      double aveCalc = f.stream().filter(x -> x.getName().charAt(0) == 'M')
	          .map(x -> x.getSalary())
	          .reduce(0.0, (x,y) -> x + y);
	      System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", aveCalc));
	      
	    } catch (FileNotFoundException e) {
	      System.err.println(e.getMessage());
	    } catch (IOException e) {
	      System.err.println(e.getMessage());
	    }
	    
	    
	    sc.close();
	  }
}
