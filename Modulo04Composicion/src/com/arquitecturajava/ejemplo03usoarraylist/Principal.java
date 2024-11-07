package com.arquitecturajava.ejemplo03usoarraylist;

import java.util.ArrayList;

public class Principal {

	public static void main(String [] args) {
		ArrayList<String> miLista = new ArrayList<String>();
		
		miLista.add("hola");
		miLista.add("que");
		miLista.add("tal ");
		miLista.add("estas?");
		
//		for(int i=0;i<miLista.size();i++) {
//			System.out.println(miLista.get(i));
//		}
		
		boolean miVariable = miLista.contains("adios");
		System.out.println(miVariable);
		
		
		for(String cadena:miLista) {
			System.out.println(cadena);
		}
		

		System.out.println("*************************");
		miLista.clear();
		miLista.add("hola");
		
		for(String cadena:miLista) {
			System.out.println(cadena);
		}
		
		System.out.println("*************************");
		miLista.remove(0);
		for(String cadena:miLista) {
			System.out.println(cadena);
		}
		
		
	}
}
