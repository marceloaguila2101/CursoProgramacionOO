package com.arquitecturajava.ejemplo03super.negocio;

public class Deportista extends Persona {
	
	private String deporte;

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	@Override
	public void andar() {
		//metodo de la clase padre imprimeTextoAndar();
		super.imprimeTextoAndar();    // con el uso de super se clarifica que llama al método de la clase padre
		System.out.println("10 km/hora");
	}
	
	

}
