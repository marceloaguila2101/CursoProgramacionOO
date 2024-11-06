package com.arquitecturajava.ejemplo04super2;

public class Deportista extends Persona {
	
	private String deporte;

	public Deportista(String nombre) {
		super(nombre);
	}
	
	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	@Override
	public void andar() {
		System.out.println(getNombre()+ " anda a 10 km/hora");
	}
	
	

}
