package com.arquitecturajava.ejemplo04.bucles;

public class Bucles {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) { 				// Sentencia for
			System.out.println("Hola " + i);
		}

		int j = 0;
		while (j < 10) { 							// Sentencia while
			System.out.println("Hola " + j);
			j++;
		}

		int k = 0;
		do {										// bucle do whilw
			System.out.println("Hola " + k);
			k++;
		} while (k < 10);

	}

}
