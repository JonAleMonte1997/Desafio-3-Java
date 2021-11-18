package main;

public class Canario extends Animal{
	
	private String plumas;
	
	public Canario() {
		
	}
	
	public Canario(String raza, double peso, boolean peligro, String plumas) {
		this.raza = raza;
		this.peso = peso;
		this.peligro = peligro;
		this.plumas = plumas;
	}
	
	public String getPlumas() {
		return plumas;
	}

	public void setPlumas(String plumas) {
		this.plumas = plumas;
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
		return "Pio pio...";
	}

	@Override
	public String toString() {
		return "Canario [plumas=" + plumas + ", raza=" + raza + ", peso=" + peso + ", peligro=" + peligro
				+ ", getPlumas()=" + getPlumas() + ", getRaza()=" + getRaza() + ", getPeso()=" + getPeso()
				+ ", isPeligro()=" + isPeligro() + ", comunicacion()=" + comunicacion() + "]";
	}
}
