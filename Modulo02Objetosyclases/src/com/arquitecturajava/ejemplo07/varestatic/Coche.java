package com.arquitecturajava.ejemplo07.varestatic;

public class Coche {

	private String marca;
	private String modelo;
	// la variable pertenece a la clase no al objeto
	private static int contador;
	
	public Coche() {
		
		this("toyota", "Yaris");
	//	this.marca="toyota";
	//	this.modelo="yaris";
	}
	
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		contador++;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public static int getContador() {
		return contador;
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
