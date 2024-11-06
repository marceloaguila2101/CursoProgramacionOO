package com.arquitecturajava.ejemplo05polimorfismo;

public class Ingeniero extends Persona {

	public Ingeniero(String nombre) {
		super(nombre);
	}

	@Override
	public void andar() {
		System.out.println(getNombre()+ " anda a 4 km/hora");
	}

	
}
