package veiculo;

public class Veiculo {
	private String marca;
    private String modelo;
    private int ano;
    private String placa;

    public Veiculo(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }
    public String mostrarVeiculos() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Placa: " + placa;
    }
}
