package com.arquitecturajava.ejemplo02sobrecarga;

public class Principal {
	
	public static void main(String [] args) {
		Persona p1 = new Persona();
		p1.setNombre("Carlos");
		p1.andar();
		
		Deportista d1 = new Deportista();
		d1.setNombre("Pedro");
		d1.setDeporte("Tenis");
		d1.andar();
		
		
		//System.out.println(d1.getNombre());
		//System.out.println(d1.getDeporte());
		
	}

}
