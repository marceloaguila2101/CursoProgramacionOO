package com.arquitecturajava.ejemplo08estatic;

public class Principal {
	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(2);
		
		System.out.println(Circulo.area(2));
		System.out.println(c1.area());
	}

}
