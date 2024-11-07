package com.arquitecturajava.ejemplo02relacion1a1;

public class Sobre {
	private String color;
	private Galleta galleta;

//	public Sobre(String color, Galleta galleta) {
//		super();
//		this.color = color;
//		this.galleta = galleta;
//	}

	public Sobre(String color, String sabor, double precio) {
		super();
		this.color = color;
		// this.galleta = galleta;
		this.galleta = new Galleta(sabor, precio); // El mismo constructor crea la galleta
	}

//	public Galleta getGalleta() {
//		return galleta;
//	}
//
//	public void setGalleta(Galleta galleta) {
//		this.galleta = galleta;
//	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return galleta.getSabor();
	}

	public void setSabor(String sabor) {
		galleta.setSabor(sabor);
	}

	public double getPrecio() {
		// usando el metodo de delegación
		return 0.1 + galleta.getPrecio();
	}

}
