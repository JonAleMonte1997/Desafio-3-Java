package main;

public class Gato extends Animal{
	
	private String pelaje;
	
	public Gato() {
		
	}
	
	public Gato(String raza, double peso, boolean peligro, String pelaje) {
		this.raza = raza;
		this.peso = peso;
		this.peligro = peligro;
		this.pelaje = pelaje;
	}
	
	public String getPelaje() {
		return pelaje;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isPeligro() {
		return peligro;
	}

	public void setPeligro(boolean peligro) {
		this.peligro = peligro;
	}

	@Override
	public String comunicacion() {
		return "Miau, miau...";
	}

	@Override
	public String toString() {
		return "Gato [pelaje=" + pelaje + ", raza=" + raza + ", peso=" + peso + ", peligro=" + peligro
				+ ", getPelaje()=" + getPelaje() + ", getRaza()=" + getRaza() + ", getPeso()=" + getPeso()
				+ ", isPeligro()=" + isPeligro() + ", comunicacion()=" + comunicacion() + "]";
	}
}
