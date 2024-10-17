package entities;

public class Product {
//	public String name; // ATRIBUTOS
//	public double price;
//	public int quantity;
	private String name; // ENCAPSULADO
	private double price; // ENCAPSULADO
	private int quantity; // ENCAPSULADO

	public Product(String name, double price, int quantity) { // CONSTRUTOR COM PARAMETROS
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) { // SOBRECARGA
		this.name = name;
		this.price = price;
		quantity = 0; // OPCIONAL POIS A VARIAVEL JÁ INICIA COM O VALOR 0
	}

	public Product() { // CONSTRUTOR PADRAO

	}

	public String getName() { // getters tipo do atributo
		return name;
	}

	public void setName(String name) { // setters sao void
		this.name = name;
	}

	public double getPrice() { // getters tipo do atributo
		return price;
	}
	
	public void setPrice(double price) { // setters sao void
		this.price = price;
		
	}
	
	public int getQuantity() { // getters tipo do atributo
		return quantity;
	}
//	public void setQuantity(int quantity) { // setters sao void
//		this.quantity = quantity;
//	}
// não deverá ser feito por esse tipo, para proteger a integridade do produto
	
	
	public double TotalValueInStock() { // METODO
		return quantity * price;
	}

	public void addProducts(int quantity) { // METODO COM PARAMETRO
		this.quantity += quantity;
	}

	public void RemoveProducts(int quantity) { // METODO COM PARAMETRO
		this.quantity -= quantity;
	}

	public String toString() { // TO STRING
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", TotalValueInStock());
	}
}
