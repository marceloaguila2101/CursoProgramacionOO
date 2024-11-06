package com.arquitecturajava.ejemplo04.constructor;

public class Principal {
	public static void main(String[] args) {
		
		Coche c1 = new Coche("Nissan", "Sentra");
		System.out.println(c1.getMarca());
		System.out.println(c1.getModelo());
		
		Coche c2 = new Coche("Yaris");
		System.out.println(c2.getMarca());
		System.out.println(c2.getModelo());
	}

}
