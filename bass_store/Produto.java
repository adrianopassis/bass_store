package bass_store;

public class Produto implements Compra{
	private int valor;
	private String modelo;
	
	public Produto(String modelo, int valor) {
		this.modelo = modelo;
		this.valor = valor;
		
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Modelo: " + modelo + ", " + "Valor: " + valor;
		
	}

	@Override
	public double saldo(double limite, double valor) {
		return limite - this.valor;
	}

	

	

}
