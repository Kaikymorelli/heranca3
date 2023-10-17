package Produto;

public class Sorvete extends Produto {
	
	private double tempAdequada;
	
	public Sorvete () {
		
	}

	public Sorvete(double tempAdequada) {
		super();
		this.tempAdequada = tempAdequada;
	}

	public double getTempAdequada() {
		return tempAdequada;
	}

	public void setTempAdequada(double tempAdequada) {
		this.tempAdequada = tempAdequada;
	}
	

}
