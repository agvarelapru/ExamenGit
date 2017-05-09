package com.cdpjosecabrera;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Operaciones ope=new Operaciones();
		
		int suma=ope.suma(5, 6);
		System.out.println("El resultado es ..." +suma);
		

		int multi=ope.multi(5, 6);
		System.out.println("El resultado es ..." +multi);
		
		int div=ope.div(5, 6);
		System.out.println("El resultado es ..." +div);
	}

}
