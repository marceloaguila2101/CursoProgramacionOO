package com.arquitecturajava.ejemplo06casting;

public class Principal {
	
	public static void main(String [] args) {
		Persona p1 = new Deportista("javier", "Padel");
		
		p1.getNombre();
		p1.andar();
		
		Deportista d1 = (Deportista) p1;
		
		System.out.println(d1.getDeporte());
		
		//System.out.println(d1.getNombre());
		//System.out.println(d1.getDeporte());
		
	}

}
