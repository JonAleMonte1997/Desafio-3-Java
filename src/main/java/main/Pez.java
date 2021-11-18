package main;

public class Pez extends Animal{
	
	private String escamas;
	
	public Pez() {
		
	}
	
	public Pez(String raza, double peso, boolean peligro, String escamas) {
		this.raza = raza;
		this.peso = peso;
		this.peligro = peligro;
		this.escamas = escamas;
	}
	
	public String geEscamas() {
		return escamas;
	}

	public void setEscamas(String escamas) {
		this.escamas = escamas;
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
		return "Glup, glup...";
	}

	@Override
	public String toString() {
		return "Pez [escamas=" + escamas + ", raza=" + raza + ", peso=" + peso + ", peligro=" + peligro
				+ ", geEscamas()=" + geEscamas() + ", getRaza()=" + getRaza() + ", getPeso()=" + getPeso()
				+ ", isPeligro()=" + isPeligro() + ", comunicacion()=" + comunicacion() + "]";
	}
}
