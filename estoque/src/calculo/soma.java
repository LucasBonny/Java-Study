package calculo;

public class soma {
	public String nome;
	public double pricing;
	public int quantidade;

	public soma (String nome, double pricing, int quantidade) {
		this.nome = nome;
		this.pricing = pricing;
		this.quantidade = quantidade;
	}
	
	public double registro(){
		double res = quantidade * pricing;
		return res;
	}
	public double adcestoque(double x) {
		double res = (quantidade + x) * pricing;
		pricing += x;
		return res;
	}
	public double remestoque(double x) {
		double res = (quantidade - x) * pricing;
		pricing -= x;
		return res;
	}
	public int qtd(int x) {
		return quantidade += x;
	}
}
