package com.arquitecturajava.ejemplo04super2;

public class Persona {
	
	private String nombre;

	
	// Este constructor con la linea super() hace referencia al constructor
	// de la clase padre, en este caso, a la clase Object
	
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

}
