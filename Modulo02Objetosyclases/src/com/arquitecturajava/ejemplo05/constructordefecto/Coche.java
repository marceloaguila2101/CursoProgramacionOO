package com.arquitecturajava.ejemplo05.constructordefecto;

public class Coche {

	private String marca;
	private String modelo;
	
	public Coche() {
		this.marca = "toyota";
		this.modelo = "yaris";
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
