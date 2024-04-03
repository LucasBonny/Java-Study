package entities;

public class Product {
	private int id;
	private String nome;
	private double price;
	
	public Product(int id, String nome, double price) {
		this.id = id;
		this.nome = nome;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
