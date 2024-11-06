package com.arquitecturajava.ejemplo05polimorfismo;

public class Principal {
	
	public static void main(String [] args) {
		
		// Uso del polimorfismo, clase Persona de tipo Deportista
		Persona p1 = new Deportista("Carlos");
		//p1.andar();
		
		Persona p2 = new Ingeniero("Ana");
		//p2.andar();
		
		Deportista d1 = new Deportista("Angel");
		
		iniciarCaminoPersona(d1);
		iniciarCaminoPersona(p1);
		iniciarCaminoPersona(p2);
		
	}

	//Oculta una jerarquia de clases completa
	public static void iniciarCaminoPersona(Persona p) {
		p.andar();
	}
}
