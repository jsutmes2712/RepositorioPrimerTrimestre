package es.iesjandula.juan_sutil_mesa.transparencia14;

import java.util.Scanner;

public class JSMVariablesJava03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el precio de la factura: ");
		double factura = sc.nextDouble();
		System.out.print("Introduzca el valor del IVA: ");
		double iva = sc.nextDouble();
		
		double total = factura + (factura * (iva/100.0));
		
		System.out.println("El valor total es : " + total);
		sc.close();
		
	}

}
