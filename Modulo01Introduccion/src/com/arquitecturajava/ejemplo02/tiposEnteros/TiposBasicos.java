package com.arquitecturajava.ejemplo02.tiposEnteros;

public class TiposBasicos {
	public static void main(String [] args) {
		byte numero1 = 5;			// desde -128 a 127
		short numero2 = 1000;		//-32768 a 32767
		int numero3=200000;			//–2.147.483.648 a 2147483647
		long numero4=30000000;		//–9223372036854775808 a 9223372036854775807
		float numero5=100.23f;
		double numero6=20000.65;
		boolean verdadero = true;
		char caracter='c';
		String cadena = "Hola desde Java";
		
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero3);
		System.out.println(numero4);
		System.out.println(numero5);
		System.out.println(numero6);
		System.out.println(verdadero);
		System.out.println(caracter);
		System.out.println(cadena); 
	}

}
