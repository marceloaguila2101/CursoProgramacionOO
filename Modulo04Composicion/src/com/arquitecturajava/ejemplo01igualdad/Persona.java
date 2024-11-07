package com.arquitecturajava.ejemplo01igualdad;

public class Persona {
	
	private String nombre;

	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void andar() {
		System.out.println(getNombre()+" anda a 5 km/hora");
	}
	
	

	@Override
	public boolean equals(Object persona) {
		Persona nueva = (Persona) persona;
		return nueva.getNombre().equals(this.getNombre());
	}

	@Override
	public int hashCode() {
		// devuelve el hashcode del nombre de la persona
		return nombre.hashCode();
	}
	
	

}
