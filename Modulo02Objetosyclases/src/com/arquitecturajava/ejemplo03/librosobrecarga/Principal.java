package com.arquitecturajava.ejemplo03.librosobrecarga;

public class Principal {

	public static void main(String[] args) {
		Libro l1 = new Libro();
		l1.setTitulo("El jueego de Ender");
		l1.setTotalPaginas(200);
		
		System.out.println(l1.getPaginaActual());
		l1.avanzarPagina();
		System.out.println(l1.getPaginaActual());
		l1.avanzarCapitulo();
		System.out.println(l1.getPaginaActual());
		
		
	}
	
	
}
