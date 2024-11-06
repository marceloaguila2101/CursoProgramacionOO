package com.arquitecturajava.ejemplo04super2;

public class Principal {
	
	// En estas clases se muestra el uso de la sentencia super() desde la clase persona
	
	public static void main(String [] args) {
		Persona p1 = new Persona("Carlos");
//		p1.setNombre("Carlos");
		p1.andar();
		
		Deportista d1 = new Deportista("pedro");
		//d1.setNombre("Pedro");
		d1.setDeporte("Tenis");
		d1.andar();
		
		
		//System.out.println(d1.getNombre());
		//System.out.println(d1.getDeporte());
		
	}

}
