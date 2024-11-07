package com.arquitecturajava.ejemplo01igualdad;

public class Principal {
	public static void main(String[] args) {

		// regla de negocio para verificar igualdad de objetos(su contenido)	
		Persona p1 = new Persona("juan");
		Persona p2 = new Persona("juan");

		// forma rápida
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		// forma directa
		System.out.println(p1.equals(p2));
		

//		System.out.println(p1.getNombre());
//		System.out.println(p2.getNombre());
//
//		System.out.println(p1 == p2);
//		System.out.println(2==2);
//		System.out.println(p1);
//		System.out.println(p2);

	}

}
