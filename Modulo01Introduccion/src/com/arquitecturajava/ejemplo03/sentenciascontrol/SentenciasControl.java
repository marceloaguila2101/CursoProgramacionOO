package com.arquitecturajava.ejemplo03.sentenciascontrol;

public class SentenciasControl {
	public static void main(String[] args) {

		int numero = 1;

		if (numero > 5) {
			System.out.println("Has aprobado");
		} else if (numero == 5) {
			System.out.println("Has aprobado muy justo");
		} else {
			if (numero<2) {
				System.out.println("Has suspendido de manera exagerada");
			}else {
				System.out.println("Has suspendido");
			}
		}
	}

}
