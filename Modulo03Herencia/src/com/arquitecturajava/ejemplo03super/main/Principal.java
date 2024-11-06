package com.arquitecturajava.ejemplo03super.main;

import com.arquitecturajava.ejemplo03super.negocio.Deportista;
import com.arquitecturajava.ejemplo03super.negocio.Persona;

public class Principal {
	
	public static void main(String [] args) {
		// Persona
		Persona p1 = new Persona();
		p1.setNombre("Carlos");
		p1.andar();
		
		//Deportista
		Deportista d1 = new Deportista();
		d1.setNombre("Pedro");
		d1.setDeporte("Tenis");
		d1.andar();
		
		
		//System.out.println(d1.getNombre());
		//System.out.println(d1.getDeporte());
		
	}

}
