package es.iesjandula.juan_sutil_mesa.transparencia9;

import java.util.Scanner;

public class JSMPrimerosPasosJava09 {

	public static void main(String[] args) {
		double pesetas = 166.386;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una cantidad en euros: ");
		double x = sc.nextDouble();
		
		System.out.println("La cantidad en pesetas es: " + (x*pesetas));
		sc.close();
	}
}
