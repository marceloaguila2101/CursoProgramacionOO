package com.arquitecturajava.ejemplo02.persona;

public class Principal {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		
		p1.setNombre("Carlos");
		p1.setEdad(1000);
		
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getEdad());
		
	}
}
