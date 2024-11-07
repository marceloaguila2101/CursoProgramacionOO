package com.arquitecturajava.ejemplo02relacion1a1;

public class Principal {
	
	public static void main(String [] args) {
		
		//Galleta g1 = new Galleta("frambuesa", 100);
		
		//System.out.println(g1.getSabor());
		
		// Aquí tenemos 01 constructor que se dedica a construir un sobre con 
		// de color azul que contiene una galleta de chocolate a $5
		Sobre s1 = new Sobre("Azul", "Chocolate", 5); 
		//Sobre s1 = new Sobre("azul", g1);
		//s1.setColor("azul");
		//s1.setGalleta(g1);
		
		System.out.println(s1.getColor());
		//System.out.println(s1.getGalleta().getSabor());
		// Usando la Delegación de métodos
		System.out.println(s1.getSabor());
		//System.out.println(s1.getGalleta().getPrecio());
		System.out.println(s1.getPrecio());
		
		
	}
	

}
