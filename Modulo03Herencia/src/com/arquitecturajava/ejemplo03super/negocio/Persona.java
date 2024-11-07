package com.arquitecturajava.ejemplo03super.negocio;

public class Persona {
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Para que no se pueda acceder a este metodo desde la clase principal, moveremos las clases
	// a otro paquete para que estos solo puedan ser accedido por las clases
	// Si la cambio a private, solo estará disponible desde la clase
	
	void imprimeTextoAndar() {
		System.out.print(getNombre()+" anda a ");
	}
	
	public void andar() {
		imprimeTextoAndar();
		System.out.println("5 km/hora");
	}

}
