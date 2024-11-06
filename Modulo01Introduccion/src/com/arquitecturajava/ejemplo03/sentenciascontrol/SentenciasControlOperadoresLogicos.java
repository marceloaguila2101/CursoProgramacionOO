package com.arquitecturajava.ejemplo03.sentenciascontrol;

public class SentenciasControlOperadoresLogicos {
	public static void main(String[] args) {
		int numero=10;
		
		if(numero>=5 && numero<7) {						// Operador and
			System.out.println("Has aprobado");
		}
		
		if(numero==0 || numero==10) {						// Operador or
			System.out.println("Estas en el extremo de la nota");
		}
		
		
	}

}
