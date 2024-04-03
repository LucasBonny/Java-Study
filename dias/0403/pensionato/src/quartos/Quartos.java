package quartos;

public class Quartos {
	private int idQuarto;
	private String nome;
	private String email;
	
	public Quartos(String nome, String email, int idQuarto) {
		this.nome = nome;
		this.email = email;
		this.idQuarto = idQuarto;
	}
	
	public int getIdQuarto() {
		return idQuarto;
	}
	public void setIdQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
