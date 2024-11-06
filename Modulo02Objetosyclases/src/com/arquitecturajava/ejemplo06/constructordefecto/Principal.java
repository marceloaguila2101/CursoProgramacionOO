package com.arquitecturajava.ejemplo06.constructordefecto;

public class Principal {
	public static void main(String [] args) {
		
		Coche c1 = new Coche("citroen", "C4");
		Coche c2 = new Coche();
		
		System.out.println(c1.getMarca());
		System.out.println(c1.getModelo());
		
		System.out.println(c2.getMarca());
		System.out.println(c2.getModelo());
	}
}
